package cavernaDePitagoras;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class Interface extends javax.swing.JFrame {

    private int respTotal;
    private int allAcer;
    private int contador;
    public Funcoes sortQuest;
    
    public Interface() {
        initComponents();
        informativoLb.setVisible(false);
        getAlternativa.setVisible(false);
        btnResposta.setVisible(false);
        resultadoLb.setVisible(false);
        scoreLb.setVisible(false); 
    }

  
    public int respTget() {
        return respTotal;
    }

    public void totalTset(int respTotal) {
        this.respTotal = respTotal;
    }

    public int AllAcerGet() {
        return allAcer;
    }

    public void AllAcerSet(int allAcer) {
        this.allAcer = allAcer;
    }
    
         
   
    
                                            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        perguntaLb = new javax.swing.JLabel();
        informativoLb = new javax.swing.JLabel();
        getAlternativa = new javax.swing.JTextField();
        scoreLb = new javax.swing.JLabel();
        alternativaLb = new javax.swing.JLabel();
        resultadoLb = new javax.swing.JLabel();
        btnStart = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        btnResposta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Caverna de Pit??goras");

        perguntaLb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        informativoLb.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        informativoLb.setText("Digite a alternativa escolhida: ");

        scoreLb.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        scoreLb.setForeground(new java.awt.Color(0, 0, 255));

        alternativaLb.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        alternativaLb.setForeground(new java.awt.Color(255, 102, 0));

        resultadoLb.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        resultadoLb.setForeground(new java.awt.Color(255, 0, 0));

        btnStart.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 0, 0));
        btnStart.setText("Primeiro Ano");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/afonsolelis/NetBeansProjects/cavernaDePitagoras/images/Captura de Tela 2021-05-12 ??s 09.17.00.png")); // NOI18N

        btnResposta.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnResposta.setText("Responder");
        btnResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespostaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Tutorial\n\nClique em Primeiro Ano, e quando\nsouber a resposta, digite no campo\nda alternativa e depois clique em\nresponder.\n\nEste ?? um jogo de perguntas e res-\npostas de matem??tica, em que\no estudante ter?? que acertar 3 ques-\nt??es seguidas para pular de ano.\n\nAs fases s??o 1, 2, 3 ano e o vesti-\nbular!\n\nAproveite para treinar para o seu\nvestibular e boa sorte!");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Grupo 3\n- Afonso Brand??o\n- Beatriz Ferreira\n- Livia ALmeida\n- Raul Torres\n- Guilherme Gaefke");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perguntaLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResposta)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(informativoLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alternativaLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scoreLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(informativoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(getAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perguntaLb, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alternativaLb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreLb, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(resultadoLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(492, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Basic() {
        btnResposta.setVisible(false);
        
        String resposta1 = getAlternativa.getText();
        if(resposta1.equals(sortQuest.respGet())){
            resultadoLb.setText("Parab??ns, voc?? acertou a quest??o.");
            totalTset(respTget() + 1);
            AllAcerSet(AllAcerGet() + 1);
        }else{
            resultadoLb.setText("Infelizmente voc?? errou. Tente de novo.");
            totalTset(respTget() + 1);
        }
        
        scoreLb.setText("Pontos: ("+ AllAcerGet() +" de "+respTget()+")");
        
        if(respTget() - AllAcerGet() > 3 ){
            btnStart.setText("Iniciar de novo?");
            perguntaLb.setText("Fim do jogo. Voc?? errou mais de 3 quest??es e repetiu! Volte ao primeiro ano.");
            alternativaLb.setText(" ");
            informativoLb.setText(" ");
            btnResposta.setVisible(false);
            informativoLb.setVisible(false);
            getAlternativa.setVisible(false);
            resultadoLb.setVisible(false);
            scoreLb.setVisible(true);
            totalTset(0);
            AllAcerSet(0);
        }
    }
    
    private void btnRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespostaActionPerformed

        if (contador == 0) {
            Basic();
            if (AllAcerGet() == 3) {
                btnStart.setText("Segundo ano.");
                perguntaLb.setText("Parab??ns, voc?? passou para a segunda fase de perguntas!");
                alternativaLb.setText(" ");
                informativoLb.setText(" ");
                btnResposta.setVisible(false);
                informativoLb.setVisible(false);
                getAlternativa.setVisible(false);
                resultadoLb.setVisible(false);
                scoreLb.setVisible(true);
                totalTset(0);
                AllAcerSet(0);
                contador = contador + 1;
            }
        }
        if (contador == 1) {
            Basic();
            if (AllAcerGet() == 4) {
                btnStart.setText("Terceiro ano.");
                perguntaLb.setText("Parab??ns, voc?? passou para a terceira fase de perguntas!");
                alternativaLb.setText(" ");
                informativoLb.setText(" ");
                btnResposta.setVisible(false);
                informativoLb.setVisible(false);
                getAlternativa.setVisible(false);
                resultadoLb.setVisible(false);
                scoreLb.setVisible(true);
                totalTset(0);
                AllAcerSet(0);
                contador = contador + 1;
            }
        }
        if (contador == 2) {
            Basic();
            if (AllAcerGet() == 4) {
                btnStart.setText("Vestibular!");
                perguntaLb.setText("Fase final, passe no vestibular");
                alternativaLb.setText(" ");
                informativoLb.setText(" ");
                btnResposta.setVisible(false);
                informativoLb.setVisible(false);
                getAlternativa.setVisible(false);
                resultadoLb.setVisible(false);
                scoreLb.setVisible(true);
                totalTset(0);
                AllAcerSet(0);
                contador = contador + 1;
            }
        }
        if (contador == 3) {
            Basic();
            if (AllAcerGet() == 4) {
                btnStart.setText("Reiniciar?");
                perguntaLb.setText("Parab??ns! Voc?? passou no vestibular!");
                alternativaLb.setText(" ");
                informativoLb.setText(" ");
                btnResposta.setVisible(false);
                informativoLb.setVisible(false);
                getAlternativa.setVisible(false);
                resultadoLb.setVisible(false);
                scoreLb.setVisible(true);
                totalTset(0);
                AllAcerSet(0);
                contador = 0;
            }
        }
        
        
    }//GEN-LAST:event_btnRespostaActionPerformed

    private void LogicPrimAno() {
        PrimeiroAno gamer = new PrimeiroAno();
        
        Random aleatorio = new Random();
        
        btnStart.setText("Proxima pergunta");
        
        int sorteado = 1 + aleatorio.nextInt(5);
        
        sortQuest = (Funcoes)gamer.hashPergs.get(sorteado);

        
        perguntaLb.setText(sortQuest.enunGet());
        alternativaLb.setText(sortQuest.alterGet());
        
        informativoLb.setText("Digite sua alternativa: ");
        btnResposta.setVisible(true);
        informativoLb.setVisible(true);
        getAlternativa.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
    }
    
    private void LogicSegAno() {
        SegundoAno gamer = new SegundoAno();
        
        Random aleatorio = new Random();
        
        btnStart.setText("Proxima pergunta");
        
        int sorteado = 1 + aleatorio.nextInt(5);
        
        sortQuest = (Funcoes)gamer.hashPergs.get(sorteado);

        
        perguntaLb.setText(sortQuest.enunGet());
        alternativaLb.setText(sortQuest.alterGet());
        
        informativoLb.setText("Digite sua alternativa: ");
        btnResposta.setVisible(true);
        informativoLb.setVisible(true);
        getAlternativa.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
    }
    
    private void LogicTerAno() {
        TerceiroAno gamer = new TerceiroAno();
        
        Random aleatorio = new Random();
        
        btnStart.setText("Proxima pergunta");
        
        int sorteado = 1 + aleatorio.nextInt(5);
        
        sortQuest = (Funcoes)gamer.hashPergs.get(sorteado);

        
        perguntaLb.setText(sortQuest.enunGet());
        alternativaLb.setText(sortQuest.alterGet());
        
        informativoLb.setText("Digite sua alternativa: ");
        btnResposta.setVisible(true);
        informativoLb.setVisible(true);
        getAlternativa.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
    }
    
    private void LogicVest() {
        Vestibular gamer = new Vestibular();
        
        Random aleatorio = new Random();
        
        btnStart.setText("Proxima pergunta");
        
        int sorteado = 1 + aleatorio.nextInt(5);
        
        sortQuest = (Funcoes)gamer.hashPergs.get(sorteado);

        
        perguntaLb.setText(sortQuest.enunGet());
        alternativaLb.setText(sortQuest.alterGet());
        
        informativoLb.setText("Digite sua alternativa: ");
        btnResposta.setVisible(true);
        informativoLb.setVisible(true);
        getAlternativa.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
        resultadoLb.setVisible(true);
        scoreLb.setVisible(true);
    }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        if (contador == 0) {
            LogicPrimAno();
        }
        else if (contador == 1) {
            LogicSegAno();
        }
        else if (contador == 2) {
            LogicTerAno();
        }
        else if (contador == 3) {
            LogicVest();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interface().setVisible(true);

            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alternativaLb;
    private javax.swing.JButton btnResposta;
    private javax.swing.JToggleButton btnStart;
    private javax.swing.JTextField getAlternativa;
    private javax.swing.JLabel informativoLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel perguntaLb;
    private javax.swing.JLabel resultadoLb;
    private javax.swing.JLabel scoreLb;
    // End of variables declaration//GEN-END:variables
}
