// Aluno Afonso Cesar Lelis Brandão
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int questao;
        Scanner leitorQuestao = new Scanner(System.in);
        do {
            System.out.println("\n\nEscolha a questão que quer analisar");
            System.out.println("Questão de 1 a 8, ou 0 para sair. Digite a seguir o número escolhido: ");
            questao = leitorQuestao.nextInt();
            //Início das questões;

            if (questao == 1) {
                // Primeiro vamos ler o nome
                Scanner leitor = new Scanner(System.in);
                System.out.print("Digite seu nome: ");
                String name = leitor.next();
                // Agora vamos ler o salário
                Scanner leitor2 = new Scanner(System.in);
                System.out.print("Digite seu salário fixo: ");
                float salario = leitor2.nextFloat();
                // Então vamos ler o total de vendas efetuadas
                Scanner leitor3 = new Scanner(System.in);
                System.out.print("Digite o valor total de vendas efetuadas: ");
                float vendas = leitor3.nextFloat();
                // Agora fazer o cálculo de 15% e somar com o salário
                float calculo = (float) (0.15*vendas+salario);
                System.out.print(name + ", seu salário este mês será: R$" + calculo);
            }
            else if (questao == 0) {
                System.out.print("Obrigado.");
            }
            else if (questao == 2) {
                //Ler o primeiro número
                Scanner leitor = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                float n1 = leitor.nextFloat();
        
		        //Ler o segundo número
		        Scanner leitor2 = new Scanner(System.in);
		        System.out.print("Digite o segundo número: ");
		        float n2 = leitor2.nextFloat();
        
		        //Ler o terceiro número
		        Scanner leitor3 = new Scanner(System.in);
		        System.out.print("Digite o terceiro número: ");
		        float n3 = leitor3.nextFloat();
        
		        // Lógica
                if ( n1 > n2 && n1 > n3 ) {
                System.out.println("O maior numero digitado é: " + n1);
		        } else if ( n2 > n1 && n2 > n3 ) {
                System.out.println("O maior numero digitado é: " + n2);
		        } else {
    	        System.out.println("O maior numero digitado é: " + n3);
  	            }   
            }
            else if (questao == 3) {
                //Primeiro ler o lado do quadrado
                Scanner lado = new Scanner(System.in);
                System.out.print("Qual o lado do quadrado em metros?: ");
                float l = lado.nextFloat();
                    
                //Agora o raio do círculo
                Scanner raio = new Scanner(System.in);
                System.out.print("Qual o raio do circulo em metros?: ");
                float r = raio.nextFloat();
                    
                    //Lógica
                float areaquad = (float) ( l * l );
                float areacirc = (float) ( 3.14 * r * r );
                    
                if ( areaquad > areacirc ) {
                System.out.print("A área do quadrado é maior, sendo " + areaquad + "m2, e o círculo " + areacirc + "m2");
                } else {
                        System.out.print("A área do círculo é maior, sendo " + areacirc + "m2, e o quadrado " + areaquad + "m2");
                }
            }
            else if (questao == 4) {
                //Primeiro vamos ler a idade do nadador
                Scanner leitor = new Scanner(System.in);
                System.out.print("Olá, seja bem vindo à competição de natação, digite sua idade: ");
                int idade = leitor.nextInt();
                
                //Agora a lógica
                if ( idade < 5) {
                        System.out.print("Você não tem idade para competir ainda!");
                }
                else if ( idade >= 5 && idade <= 7 ) {
                        System.out.print("Sua categoria é Infantil A");
                }
                else if ( idade >= 8 && idade <= 10 ) {
                        System.out.print("Sua categoria é Infantil B");
                }
                else if ( idade >= 11 && idade <= 13 ) {
                        System.out.print("Sua categoria é Juvenil A");
                }
                else if ( idade >= 14 && idade <= 17 ) {
                        System.out.print("Sua categoria é Juvenil A");
                } else {
                        System.out.print("Sua categoria é Adulto");
                }
            }
            else if (questao == 5) {
                int posicao = 0;
                // Leitura dos números
                Scanner leitor = new Scanner(System.in);
                System.out.print("Digite o primeiro número: ");
                float n1 = leitor.nextFloat();

                Scanner leitor2 = new Scanner(System.in);
                System.out.print("Digite o segundo número: ");
                float n2 = leitor2.nextFloat();

                Scanner leitor3 = new Scanner(System.in);
                System.out.print("Digite o terceiro número: ");
                float n3 = leitor3.nextFloat();

                //print da ordem digitada
                System.out.print( "Ordem digitada \n");
                System.out.print( n1 + "\n");
                System.out.print( n2 + "\n");
                System.out.print( n3 + "\n\n");

                //print da organização em crescente
                System.out.print( "Organizando em crescente \n");
                
                float a = 0;
                float b = 0;
                float c = 0;

                if ( n1 > n2 && n1 > n3 ) {
                    a = n1;
                    b = n2;
                    c = n3;
                }
                else if ( n2 > n1 && n2 > n3 ) {
                    a = n2;
                    b = n1;
                    c = n3;
                } else {
                    a = n3;
                    b = n1;
                    c = n2;
                }

                System.out.print( a + "\n");
                System.out.print( b + "\n");
                System.out.print( c + "\n\n");

                //lógica dos triângulos
                float sumbc = b + c;
                float asqr = a * a;
                float bsqr = b * b;
                float csqr = c * c;
                float sumbcsqr = bsqr + csqr;
                
                if ( a > 0 && b > 0 && c > 0 ) {
                    if ( a >= sumbc) {
                    System.out.print("Não forma triângulo");
                    }
                    else if ( asqr == sumbcsqr ) {
                            System.out.print("Triângulo retângulo");
                    }
                    else if ( asqr > sumbcsqr && a != b && a != c && b != c ) {
                            System.out.print("Triângulo obtusângulo");
                    }
                    else if ( asqr < sumbcsqr && a != b && a != c && b != c ) {
                            System.out.print("Triângulo aculátero");
                    }
                    else if ( a == b && a == c ) {
                            System.out.print("Triângulo equilátero");
                    }
                    else if ( a == b ) {
                            System.out.print("Triângulo isósceles");
                    }
                    else if ( c == b ) {
                            System.out.print("Triângulo isósceles");
                    }
                    else if ( a == c ) {
                            System.out.print("Triângulo isósceles");
                    } else {
                            System.out.print("Seu triângulo não tem configuração");
                    }
                } else {
                System.out.print("Só aceitamos números reais!");
                }
            }
            else if (questao == 6) {
                //Primeiro ler o número X
                Scanner leitorx = new Scanner(System.in);
                System.out.print("Digite o número X (base): ");
                float x = leitorx.nextFloat();
                //Agora ler o número Y
                Scanner leitory = new Scanner(System.in);
                System.out.print("Digite o número Y (expoente): ");
                float y = leitory.nextFloat();
            
                //Lógica   
                float potencia = 1;
                float contador = 0;

                while ( contador != y ) {
                potencia = potencia * x;
                contador = contador + 1;
                }

                System.out.print("O valor de " + x + " elevado a " + y + " é " + potencia);
            }
            else if (questao == 7) {
                int nulo = 0;
                int branco = 0;
                int contagem = 0;
                int candidato1 = 0;
                int candidato2 = 0;
                int candidato3 = 0;
                int candidato4 = 0;
                
                Scanner leitor = new Scanner(System.in);
                
                //loop para coletar os votos
                do {
                
                System.out.print("Qual seu voto? (Digite 0 para encerrar a votação) -> ");
                contagem = leitor.nextInt();
                
                
                        if ( contagem == 1){
                                candidato1 = candidato1 + 1;
                        }
                        else if ( contagem == 2 ) {
                                candidato2 = candidato2 + 1;
                        }
                        else if ( contagem == 3 ) {
                                candidato3 = candidato3 + 1;
                        }
                        else if ( contagem == 4 ) {
                                candidato4 = candidato4 + 1;
                        }
                        else if ( contagem == 5 ) {
                                nulo = nulo + 1;
                        }
                        else if ( contagem == 6 ) {
                                branco = branco + 1;
                        }
                        else if ( contagem == 0 ) {
                        System.out.print("Votação encerrada! \n");
                        } else {
                            System.out.print("Digite um número válido - \n");
                        }
                }
                while ( contagem != 0 );
                
                //calculo do percentual de votos
                int sumvotos = candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco;
                float perc1 = ((float) candidato1 / sumvotos) * 100; 
                float perc2 = ((float) candidato2 / sumvotos) * 100;
                float perc3 = ((float) candidato3 / sumvotos) * 100;
                float perc4 = ((float) candidato4 / sumvotos) * 100;
                float perc5 = ((float) nulo / sumvotos) * 100;
                float perc6 = ((float) branco / sumvotos) * 100;
                
                //demonstração dos votos
                System.out.print("Resultados: \n");
                System.out.print("Total de votos: " + sumvotos + "\n");
                System.out.print("Candidato 1 = " + candidato1 + " votos com " + perc1 + "% de participação \n");
                System.out.print("Candidato 2 = " + candidato2 + " votos com " + perc2 + "% de participação \n");
                System.out.print("Candidato 3 = " + candidato3 + " votos com " + perc3 + "% de participação \n");
                System.out.print("Candidato 4 = " + candidato4 + " votos com " + perc4 + "% de participação \n");
                System.out.print("Nulos = " + nulo + " votos com " + perc5 + "% de participação \n");
                System.out.print("Brancos = " + branco + " votos com " + perc6 + "% de participação \n");
            }
            else if (questao == 8) {
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;
                int contagem = 0;
                int clientes = 0;
                int idaderuim = 0;
                int mediaruim = 0;
                int difotimoruim = 0;
                int maioridaderuim = 0;
                int maioridadeotimo = 0;
                int maioridadepessimo = 0;
                
                //Lógica de colocar clientes para testar com menor número durante a depuração do algoritmo. Pode ser colocado quantos clientes necessário. Pela prova = 20 clientes.
                Scanner leitor1 = new Scanner(System.in);
                System.out.println("Administrador, \n");
                System.out.print("digite quantos clientes tem para a pesquisa: ");
                clientes = leitor1.nextInt();
                // Digitar 20 clientes como pede na questão

                System.out.print("Tudo ok, vamos coletar os dados agora: \n");

                while ( contagem < clientes) {
                        contagem = contagem + 1;
                        System.out.println("\n\n Seja muito bem vindo ao cinema Vision! \n");
                        System.out.print("Estamos fazendo uma pesquisa de satisfação sobre o filme Rambo 34 \n");
                        System.out.print("Primeiro, digite a sua idade: ");
                        Scanner leitor2 = new Scanner(System.in);
                        int capidade = leitor2.nextInt();
                        
                        System.out.print("Digite A para ÓTIMO \n");
                        System.out.print("Digite B para BOM \n");
                        System.out.print("Digite C para REGULAR \n");
                        System.out.print("Digite D para RUIM \n");
                        System.out.print("Digite E para PÉSSIMO \n");
                        Scanner leitor3 = new Scanner(System.in);

                        System.out.print("Por final, digite qual a sua nota para o filme Rambo 34? \n");
                        String nota = leitor3.next();
                        System.out.println("\n\n Voto \n" + contagem);
                        //Lógica de coleta de dados
                        //A funcao equals foi a mais adequada nesta situação
                        if ( nota.equals("a") || nota.equals("A") ) {
                                a++;
                                if ( capidade > maioridadeotimo ) {
                                    maioridadeotimo = capidade;
                                }
                                System.out.print("\n A maior idade ÓTIMOS é: " + maioridadeotimo + "\n");
                        }
                        else if ( nota.equals("b") || nota.equals("B")) {
                                b++;
                        }
                        else if ( nota.equals("c") || nota.equals("C")) {
                                c++;
                        }
                        else if ( nota.equals("d") || nota.equals("D")) {
                                d++;
                                if ( capidade > maioridaderuim ) {
                                    maioridaderuim = capidade;
                                }
                                idaderuim = idaderuim + capidade;
                                System.out.print("\n A maior idade RUIM é: " + maioridaderuim + "\n");
                        }
                        else if ( nota.equals("e") || nota.equals("E")) {
                                e++;
                                if ( capidade > maioridadepessimo ) {
                                    maioridadepessimo = capidade;
                                }
                        }
                }
                
                //Média das idades que votaram ruim -  com o cuidado de não dividir por 0.
                if ( d > 0 ) {
                    mediaruim = ((int)idaderuim / d);
                } else {
                    mediaruim = 0;
                }
                
                
                //Percentual de pessoas que votaram péssimo
                float percpess = ((float) e / contagem) * 100;

                //Diferença das idades ótimo e ruim - lógica para não dar resultado negativo.
                if ( maioridadeotimo > maioridaderuim ) {
                    difotimoruim = maioridadeotimo - maioridaderuim;
                } else {
                    difotimoruim = maioridaderuim - maioridadeotimo;
                }
                
                System.out.print("\n O número de votos ÓTIMOS são: " + a + "\n");
                System.out.print("A média de idade das pessoas que responderam RUIM é: " + mediaruim + "\n");
                System.out.print("A porcentagem de respostas PÉSSIMO são: " + percpess + "% e a maior idade é: " + maioridadepessimo + "\n");
                System.out.print("A diferença de idade entre a maior idade que respondeu ÓTIMO e a maior idade que respondeu RUIM é: " + difotimoruim + "\n");

                //contabilização dos votos para usar as variáveis b e c
                System.out.print("\n \n O número de votos ÓTIMOS são: " + a + "\n");
                System.out.print("O número de votos BONS são: " + b + "\n");
                System.out.print("O número de votos REGULARES são: " + c + "\n");
                System.out.print("O número de votos RUINS são: " + d + "\n");
                System.out.print("O número de votos PÉSSIMOS são: " + e + "\n");
            }
        } while (questao != 0);
    }
}
