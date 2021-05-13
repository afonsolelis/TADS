import java.util.Scanner;
public class App {
    /* 
    Aluno Afonso Cesar Lelis Brandão
    Atv Avaliativa 2 Algoritimos e Programação I
    Professor Alexandre Mignon 
    */

    public static String[] nameList;

    //Função menu para escolha de ação.
    public static int Menu() {
        System.out.println("\n\n############# MAGICLIST ###############");
        System.out.println("############### MENU ##################");
        System.out.println("########## ESCOLHA UMA OPÇÃO ##########");
		System.out.println("(1) Adicionar um novo nome");
		System.out.println("(2) Apresentar todos os nomes");
		System.out.println("(3) Pesquisar um nome");
		System.out.println("(4) Remover um nome");
		System.out.println("(0) Sair");
        System.out.println("############### FIM DO MENU #############\n");
		Scanner leitorMenu = new Scanner(System.in);
		String op = leitorMenu.nextLine();
		try {
            return Integer.parseInt(op);
        } catch (NumberFormatException e){
            return 5;
        }
    }

    //Função adicionar.
    public static void Add() {
        System.out.println("\nOpção Adicionar nome\n");
        //Verifica se a lista está cheia.
        if ( nameList[nameList.length - 1] != null ) {
            System.out.println("Sua lista está cheia! Digite 4 no menu para remover um nome.");
            return;
        }
        System.out.println("Vamos adicionar um nome? Digite a seguir: ");
        Scanner leitorAdd = new Scanner(System.in);
		String nameAdd = leitorAdd.nextLine();
        //Chama a função find para saber se o nome já existe.
        if ( Find(nameAdd ) > -1) {
            System.out.println("Ei! Este nome já existe, tente adicionar outro...");
            return;
        }
        //Contador de quantos espaços null existem.
        int posicao = 0;
        int count = 0;
        for (int i = 0; i < nameList.length; i++) {
            if (nameList[i] == null) {
                count = count + 1;
            }
        }
        //Identificador de posição para inserção do nome.
        posicao = nameList.length - count;
        int index = posicao + 1;
        //Inserção do nome na posição correta.
        nameList[posicao] = nameAdd;
        System.out.println("Você tinha " + count + " posições vazias e o nome " + nameAdd + " foi adicionado na posição " + index);
        System.out.println("Agora você tem " + (count - 1) + " espaços vazios.");
    }

    //Função de show para mostrar o vetor.
    public static void Show() {
		int c = 1;
        System.out.print("Seu banco de nomes: \n");
		for (int i = 0; i < nameList.length; i++) {
			if ( nameList[i] == null ) {
			System.out.println(c + " - Vazio ");
			} else {
				System.out.println(c + " - " + nameList[i]);
			}
			c = c + 1;
    }
	}	

    /*Função de achar o nome. Retorna a posição em que achou ou -1 
    (para não confundir com o 0 do index, foi escolhido o retorno -1)*/
	public static int Find(String nameFind) {
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i] == null) {
				return -1;
			}
			if (nameFind.contains(nameList[i])) {
				return i;
			}
		}
		return -1;
	}

    //Função busca, acha o nome na posição e retorna uma mensagem (diferente da função achar (Find)).
    public static void Search() {
        System.out.println("Quem você está tentando achar?");
        Scanner leitorSearch = new Scanner(System.in);
		String nameSearch = leitorSearch.nextLine();
        if (Find(nameSearch) == -1) {
            System.out.println("Esse nome não está na sua lista, digite 1 no menu para adicionar.");
        } else {
            int index = Find(nameSearch) + 1;
            System.out.println("O nome existe na sua lista - posição " + index);
        }
    }

    //Função remover o nome.
    public static void Destroy() {
        System.out.println("Qual nome você quer deletar? (aqui está  a lista para te ajudar...)");
        //Chamo a função show para ajudar a ver o nome a ser deletado.
        Show();
        System.out.println("Escreva o nome para DELETAR");
        Scanner leitorDestroy = new Scanner(System.in);
		String nameDestroy = leitorDestroy.nextLine();
        //Chamo a função Find para saber se tem e qual a posição do nome.
        int posicao = Find(nameDestroy);
        //Lógica para identificar ao usuário que o nome não existe.
        if (posicao == -1) {
            System.out.println("Acho que você errou... esse nome não existe na sua lista. Vamos voltar ao menu.");
            return;
        }
        System.out.println("Você tem certeza? [Y/N]");
        Scanner leitorConfirm = new Scanner(System.in);
		String nameConfirm = leitorConfirm.nextLine();
        if (nameConfirm.equals("Y") || nameConfirm.equals("y")) {
            //Substituição do nome por null.
            nameList[posicao] = null;
            System.out.println("Você deletou " + nameDestroy);
            System.out.println("Sua agenda tem novas posições: ");
        } else {
            System.out.println("Digite 4 no menu para voltar");
            return;
        }
        //Lógica para reposicionar os nomes e não ficar um null entre eles.
        for (int i = posicao; i < nameList.length - 1; i++) {
            nameList[i] = nameList[i + 1];
            //Demonstrar as posições do vetor.
            if ( nameList[i] != null ) {
                System.out.println("o nome " + nameList[i] + " está na posição " + (i + 1));
            } else {
                System.out.println("a posição " + (i + 1) + " está vazia");
            }
            
        }
        //Caso a lista esteja cheia, o último nome ficaria repetido, então substitui por null.
        nameList[nameList.length - 1] = null;
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo à MagicList, estamos começando uma nova lista. Digite quantos nomes você gostaria de guardar. Lembre-se que o valor digitado não poderá mudar.");
        Scanner leitorList = new Scanner(System.in);
		int size = leitorList.nextInt();
        //Digitar 50, como pede o comando da questão.
        nameList = new String[size];
        System.out.println("Seja bem vindo à sua lista de nomes, você tem " + nameList.length + " espaços, use com sabedoria!");

        int opcao = 0;

        do {
            opcao = Menu();

            if (opcao == 1) {
                Add();
            } 
            else if (opcao == 2) {
                Show();
            }
            else if (opcao == 3) {
                Search();
            }
            else if (opcao == 4) {
                Destroy();
            }
            else if (opcao == 0) {
                System.out.println("Valeu! Te vejo na próxima.");
            } else {
                System.out.println("Digite uma opção válida!");
            }
        } while (opcao != 0);
    }
}
