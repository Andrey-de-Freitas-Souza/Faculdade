/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paraminhaprincesa;


public class Tela extends javax.swing.JFrame {
     int pontos = 0;
    
    public Tela() {
        initComponents();
        btnPremios.setVisible(false);
        btnVoltar.setVisible(false);
        florkManual.setVisible(false);
        lblPremios2.setText("<html>1-Vale Beijo      "
                          + "2-Uma Tarde vendo filme "
                          + "3-Um chocolate          "
                          + "4-Vale foto             "
                          + "5-Vale desejo           </html>");
        florkPremios.setVisible(false);
        lblPremios1.setVisible(false);
        lblPremios2.setVisible(false);
        lblOpcoes.setVisible(false);
        resp.setVisible(false);
        btnConfirma.setVisible(false);
        florkAcertou.setVisible(false);
        btnPx.setVisible(false);
        florkMaoRosto.setVisible(false);
        lblOpcoes2.setVisible(false);
        btnConfirma2.setVisible(false);
        btnPx2.setVisible(false);
        florkChoro.setVisible(false);
        florkJoinha.setVisible(false);
        lblPontos.setVisible(false);
        btnPx3.setVisible(false);
        btnPx4.setVisible(false);
        btnConfirma4.setVisible(false);
        btnConfirma3.setVisible(false);
        lblOpcoes3.setVisible(false); 
        florkSp.setVisible(false);
        btnSpSim.setVisible(false);
        btnNao.setVisible(false);
        btnNao2.setVisible(false);
        btnNao3.setVisible(false);
        btnNao4.setVisible(false);
        btnNao5.setVisible(false);
        btnNao2.setVisible(false);
        btnNao6.setVisible(false);
        btnNao7.setVisible(false);
        btnNao8.setVisible(false);
        btnNao9.setVisible(false);
        btnVerPremios.setVisible(false);        
        btnFim.setVisible(false);
        
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
        btnMarquin = new javax.swing.JButton();
        txtAprensentacao = new javax.swing.JLabel();
        ImagemFala = new javax.swing.JLabel();
        btnPremios = new javax.swing.JButton();
        lblForkCafe = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        florkManual = new javax.swing.JLabel();
        florkPremios = new javax.swing.JLabel();
        lblPremios1 = new javax.swing.JLabel();
        lblPremios2 = new javax.swing.JLabel();
        btnConfirma = new javax.swing.JButton();
        lblOpcoes = new javax.swing.JLabel();
        resp = new javax.swing.JSpinner();
        florkAcertou = new javax.swing.JLabel();
        btnPx = new javax.swing.JButton();
        florkMaoRosto = new javax.swing.JLabel();
        btnConfirma3 = new javax.swing.JButton();
        btnConfirma2 = new javax.swing.JButton();
        btnConfirma4 = new javax.swing.JButton();
        btnPx2 = new javax.swing.JButton();
        btnPx3 = new javax.swing.JButton();
        btnPx4 = new javax.swing.JButton();
        lblOpcoes2 = new javax.swing.JLabel();
        florkJoinha = new javax.swing.JLabel();
        florkChoro = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();
        lblOpcoes3 = new javax.swing.JLabel();
        btnSpSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        btnNao2 = new javax.swing.JButton();
        btnNao3 = new javax.swing.JButton();
        btnNao4 = new javax.swing.JButton();
        btnNao5 = new javax.swing.JButton();
        btnNao6 = new javax.swing.JButton();
        btnNao7 = new javax.swing.JButton();
        btnNao8 = new javax.swing.JButton();
        btnNao9 = new javax.swing.JButton();
        florkSp = new javax.swing.JLabel();
        btnVerPremios = new javax.swing.JButton();
        btnFim = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/Flork para Literatura - Caratulas para Cuadernos (1) (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMarquin.setText("Falar com o Marquin");
        btnMarquin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarquinActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarquin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        txtAprensentacao.setText("<html>Olá Pamella! eu sou o cleitin, estou aqui porque o Andrey me pediu pra fazer um jogo com você, se você quiser aprender a jogar você terá que falar com meu amigo Marquin, para isso é só apertar no botão \"Falar com o Marquin\". Se você estiver pronta é só apertar o botão \"Começar\".</html>");
        getContentPane().add(txtAprensentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 150));

        ImagemFala.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\Downloads\\blabla.png")); // NOI18N
        getContentPane().add(ImagemFala, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 408, 342));

        btnPremios.setText("Prêmios");
        btnPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremiosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPremios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, -1));

        lblForkCafe.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblForkCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/aprensentando-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        getContentPane().add(lblForkCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 260));

        btnComecar.setText("Começar");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 124, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 120, -1));

        florkManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/manual-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        getContentPane().add(florkManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, -1));

        florkPremios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/comemorando-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        getContentPane().add(florkPremios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 260));

        lblPremios1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblPremios1.setText("Prêmios");
        getContentPane().add(lblPremios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        lblPremios2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPremios2.setText("<html>1-Vale Beijo 2-Uma Tarde vendo filme 3- Um chocolate 4-Vale foto</html>");
        getContentPane().add(lblPremios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, -1));

        btnConfirma.setText("Confirmar");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, -1));

        lblOpcoes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblOpcoes.setText("<html>---- Opções ---- [1] 21/04/2023 [2] 31/03/2023 [3] 16/04/2023 [4] 03/05/2023 (Digite o número da caixinha)</html> ");
        getContentPane().add(lblOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 110, -1));
        getContentPane().add(resp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 100, -1));

        florkAcertou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/acertou.png"))); // NOI18N
        getContentPane().add(florkAcertou, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnPx.setText("Próximo");
        btnPx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPxActionPerformed(evt);
            }
        });
        getContentPane().add(btnPx, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        florkMaoRosto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/errou1-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        getContentPane().add(florkMaoRosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnConfirma3.setText("Confirmar");
        btnConfirma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirma3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, -1));

        btnConfirma2.setText("Confirmar");
        btnConfirma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirma2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, -1));

        btnConfirma4.setText("Confirmar");
        btnConfirma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirma4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 100, -1));

        btnPx2.setText("Próximo");
        btnPx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPx2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        btnPx3.setText("Próximo");
        btnPx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPx3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        btnPx4.setText("Próximo");
        btnPx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPx4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        lblOpcoes2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblOpcoes2.setText("<html>---- Opções ----- [1] The last of Kingdom ---------- [2] Peaky Blinders [3] Stranger Things ---------- [4] Vikings </html>");
        getContentPane().add(lblOpcoes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 140));

        florkJoinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/joinha.png"))); // NOI18N
        getContentPane().add(florkJoinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        florkChoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/errou2-PhotoRoom.png-PhotoRoom.png"))); // NOI18N
        getContentPane().add(florkChoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblPontos.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblPontos.setText("Pontos: ");
        getContentPane().add(lblPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblOpcoes3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblOpcoes3.setText("<html>---- Opções ----- [1] Camisa preta, calça preta ------- [2]Camisa branca, calça jeans ------- [3] Camisa preta, calça jeans ------- [4] Camisa branca, calça preta</html>");
        getContentPane().add(lblOpcoes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 190));

        btnSpSim.setText("SIM");
        btnSpSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpSimActionPerformed(evt);
            }
        });
        getContentPane().add(btnSpSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 80, -1));

        btnNao.setText("NAO");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 80, -1));

        btnNao2.setText("NAO");
        btnNao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 80, -1));

        btnNao3.setText("NAO");
        btnNao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 80, -1));

        btnNao4.setText("NAO");
        btnNao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 80, -1));

        btnNao5.setText("NAO");
        btnNao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 80, -1));

        btnNao6.setText("NAO");
        btnNao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, -1));

        btnNao7.setText("NAO");
        btnNao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 80, -1));

        btnNao8.setText("NAO");
        btnNao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 80, -1));

        btnNao9.setText("NAO");
        btnNao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNao9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNao9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 80, -1));

        florkSp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paraminhaprincesa/florkSaopaulo-PhotoRoom (2).png"))); // NOI18N
        getContentPane().add(florkSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, -1, -1));

        btnVerPremios.setText("Ver Prêmios");
        btnVerPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPremiosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerPremios, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 110, -1));

        btnFim.setText("Finalizar");
        btnFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFimActionPerformed(evt);
            }
        });
        getContentPane().add(btnFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarquinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarquinActionPerformed
        lblForkCafe.setVisible(false);
        btnComecar.setVisible(false);
        txtAprensentacao.setVisible(true);
        btnMarquin.setVisible(false);
        btnVoltar.setVisible(true);
        btnPremios.setVisible(true);
        florkManual.setVisible(true);
        txtAprensentacao.setText("<html>Prazer Pamella! Eu sou o Marquin não fala pro Andrey mas ele não parava de te elogiar para mim, e ele pediu para eu te falar as Regras do jogo.Bom, pelo o que estou vendo no manual, é bem simples, você terá que responder perguntas de alternativa, quanto mais você acertar, mais prêmios você ganha! Você pode conferir os prêmios no botão 'Prêmios' </html>");
        
    }//GEN-LAST:event_btnMarquinActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        txtAprensentacao.setText("<html>Certo agora que o Marquin já te explicou o jogo, você quer começar ou quer falar novamente com ele?</html>");
        lblForkCafe.setVisible(true);
        btnComecar.setVisible(true);
        btnVoltar.setVisible(false);
        ImagemFala.setVisible(true);
        txtAprensentacao.setVisible(true);
        btnMarquin.setVisible(true);
        btnVoltar.setVisible(false);
        btnPremios.setVisible(false);
        florkManual.setVisible(false);
        florkPremios.setVisible(false);
        lblPremios1.setVisible(false);
        lblPremios2.setVisible(false);
        
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremiosActionPerformed
        florkPremios.setVisible(true);
        lblForkCafe.setVisible(false);
        btnComecar.setVisible(false);
        txtAprensentacao.setVisible(true);
        btnMarquin.setVisible(false);
        btnVoltar.setVisible(true);
        btnPremios.setVisible(false);
        florkManual.setVisible(false);
        ImagemFala.setVisible(false);
        txtAprensentacao.setText("A cada 1 acerto você ganha um prêmio!");
        lblPremios1.setVisible(true);
        lblPremios2.setVisible(true);
    }//GEN-LAST:event_btnPremiosActionPerformed

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed
        btnComecar.setVisible(false);
        btnMarquin.setVisible(false);
        txtAprensentacao.setText("<html>O JOGO COMEÇOU! A primeira pergunta é: Quando você e o Andrey se beijaram pela primeira vez?</html>");
        lblOpcoes.setVisible(true);
        resp.setVisible(true);
        btnConfirma.setVisible(true);
        lblPontos.setVisible(true);
        
    }//GEN-LAST:event_btnComecarActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
      btnPx.setVisible(true);
      btnConfirma.setVisible(false);  
      lblOpcoes.setVisible(false);
      resp.setVisible(false);
      
      int resposta = Integer.parseInt(resp.getValue().toString());
      if(resposta == 1){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>AAAAhh que pena você errou, a resposta correta era a número 3, foi no dia 16/04/2023 o Andrey me falou, que ali ele já tinha viciado no seu beijo kkkkkkkkk</html>");
      }
      else if(resposta == 2){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>AAAAhh que pena você errou, a resposta correta era a número 3, foi no dia 16/04/2023 o Andrey me falou, que ali ele já tinha viciado no seu beijo kkkkkkkkk</html>");
      }    
      else if(resposta == 3){
          lblForkCafe.setVisible(false);
          florkAcertou.setVisible(true);
          txtAprensentacao.setText("<html>BOAA, VOCÊ ACERTOU!!! O Andrey me falou que ali ele já tinha viciado no seu beijo kkkkkkkkk, VOCÊ MARCOU UM PONTO!</html>");
          pontos++;
      }

      else if(resposta == 4){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>AAAAhh que pena você errou, a resposta correta era a número 3, foi no dia 16/04/2023 o Andrey me falou, que ali ele já tinha viciado no seu beijo kkkkkkkkk</html>");
      }
      
     lblPontos.setText("Pontos: "+ pontos); 
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btnPxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPxActionPerformed
       lblOpcoes.setVisible(false);
       resp.setVisible(true);
       btnConfirma2.setVisible(true);
       lblForkCafe.setVisible(true);
       florkMaoRosto.setVisible(false);
       txtAprensentacao.setText("<html>Muito bem vamos para a segunda pergunta! Quando você e o Andrey se conheceram,qual série você recomendou ele assistir?<html>");
       lblOpcoes2.setVisible(true);
       btnPx.setVisible(false);
       florkAcertou.setVisible(false);
       
       
    }//GEN-LAST:event_btnPxActionPerformed

    private void btnConfirma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirma2ActionPerformed
      btnPx2.setVisible(true);
      btnConfirma2.setVisible(false);  
      lblOpcoes2.setVisible(false);
      resp.setVisible(false);
      
      int resposta = Integer.parseInt(resp.getValue().toString());
      if(resposta == 1){
          lblForkCafe.setVisible(false);
          florkJoinha.setVisible(true);
          txtAprensentacao.setText("<html>RESPOSTA CERTA!! Realmente foi The last of kingdom, falando nisso ele pediu pra te perguntar quando vocês vão assistir ela juntos? kkkkkkkk, VOCÊ MARCOU MAIS UM PONTO!!!</html>");
          pontos++;
      }
      else if(resposta == 2){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS! RESPOSTA ERRADA!! A série era The last of kingdom, falando nisso ele pediu pra te perguntar quando vocês vão assistir ela juntos? kkkkkkkk</html>");
      }    
      else if(resposta == 3){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS! RESPOSTA ERRADA!! A série era The last of kingdom, falando nisso ele pediu pra te perguntar quando vocês vão assistir ela juntos? kkkkkkkk</html>");
          
      }

      else if(resposta == 4){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS! RESPOSTA ERRADA!! A série era The last of kingdom, falando nisso ele pediu pra te perguntar quando vocês vão assistir ela juntos? kkkkkkkk</html>");
      }
      
      lblPontos.setText("Pontos: "+ pontos);  
    }//GEN-LAST:event_btnConfirma2ActionPerformed

    private void btnPx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPx2ActionPerformed
       lblOpcoes2.setVisible(false);
       resp.setVisible(true);
       btnConfirma3.setVisible(true);
       lblForkCafe.setVisible(true);
       florkChoro.setVisible(false);
       txtAprensentacao.setText("<html>A terceira pergunta é: Qual a é data do aniversário do Andrey? <html>");
       lblOpcoes2.setVisible(false);
       btnPx2.setVisible(false);
       florkJoinha.setVisible(false);
       lblOpcoes.setText("<html>---- Opções ---- [1] 16/06/2023 [2] 03/06/2023 [3] 15/07/2023 [4] 06/06/2023 (Digite o número da caixinha)</html> ");
       lblOpcoes.setVisible(true);
    }//GEN-LAST:event_btnPx2ActionPerformed

    private void btnConfirma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirma3ActionPerformed
      btnPx3.setVisible(true);
      btnConfirma3.setVisible(false);  
      lblOpcoes.setVisible(false);
      resp.setVisible(false);
      
      int resposta = Integer.parseInt(resp.getValue().toString());
      if(resposta == 1){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! O aniversário dele é dia 06/06/2023, e ele me disse que quer um beijo seu de presente!</html>");
          
      }
      else if(resposta == 2){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! O aniversário dele é dia 06/06/2023, e ele me disse que quer um beijo seu de presente!</html>");
      }    
      else if(resposta == 3){
          lblForkCafe.setVisible(false);
          florkMaoRosto.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! O aniversário dele é dia 06/06/2023, e ele me disse que quer um beijo seu de presente!</html>");
          
      }

      else if(resposta == 4){
          lblForkCafe.setVisible(false);
          florkAcertou.setVisible(true);
          txtAprensentacao.setText("<html>AEEEE RESPOSTA CORRETA!!! O aniversário dele é dia 06/06/2023 mesmo, e ele me disse que quer um beijo seu de presente! VOCÊ MARCOU MAIS UM PONTO!!!</html>");
          pontos++;
      }
      lblPontos.setText("Pontos: "+ pontos);  
    }//GEN-LAST:event_btnConfirma3ActionPerformed

    private void btnPx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPx3ActionPerformed
       lblOpcoes.setVisible(false);
       resp.setVisible(true);
       btnConfirma4.setVisible(true);
       lblForkCafe.setVisible(true);
       florkAcertou.setVisible(false);
       txtAprensentacao.setText("<html>Vamos agora para a quarta pergunta: Qual roupa o Andrey estava quando vocês foram no shopping? <html>");
       lblOpcoes.setVisible(false);
       btnPx3.setVisible(false);
       florkMaoRosto.setVisible(false);
       lblOpcoes3.setVisible(true);  
    }//GEN-LAST:event_btnPx3ActionPerformed

    
    
    private void btnPx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPx4ActionPerformed
       lblOpcoes3.setVisible(false);
       lblForkCafe.setVisible(false);
       resp.setVisible(false);
       btnNao.setVisible(true);
       btnSpSim.setVisible(true);
       florkSp.setVisible(true);
       florkAcertou.setVisible(false);
       txtAprensentacao.setText("<html>ÚLTIMA PERGUNTA!!! ela bem simples, você tem que dizer se a frase a seguir é verdadeira: O São paulo é muito melhor que o Corinthians?<html>");
       lblOpcoes.setVisible(false);
       btnPx4.setVisible(false);
       florkChoro.setVisible(false);
       lblOpcoes3.setVisible(false);
       florkAcertou.setVisible(false);
       florkJoinha.setVisible(false);
    }//GEN-LAST:event_btnPx4ActionPerformed

    private void btnConfirma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirma4ActionPerformed
      florkAcertou.setVisible(false);
      btnPx4.setVisible(true);
      btnConfirma4.setVisible(false);  
      lblOpcoes3.setVisible(false);
      resp.setVisible(false);
      
      int resposta = Integer.parseInt(resp.getValue().toString());
      if(resposta == 1){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! Ele estava de camisa branca e calça jeans, ele me contou que você estava lindíssima, de vestido preto e uma blusa branca!</html>");
          
      }
      else if(resposta == 2){
          lblForkCafe.setVisible(false);
          florkJoinha.setVisible(true);
          txtAprensentacao.setText("<html>PERFEITO RESPOSTA CORRETA!!! Ele estava de camisa branca e calça jeans, ele me contou que você estava lindíssima, de vestido preto e uma blusa branca!  VOCÊ MARCOU MAIS UM PONTO!!!</html>");
          pontos++;
      }    
      else if(resposta == 3){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! Ele estava de camisa branca e calça jeans, ele me contou que você estava lindíssima, de vestido preto e uma blusa branca!</html>");
          
      }

      else if(resposta == 4){
          lblForkCafe.setVisible(false);
          florkChoro.setVisible(true);
          txtAprensentacao.setText("<html>OPS RESPOSTA ERRADA!!! Ele estava de camisa branca e calça jeans, ele me contou que você estava lindíssima, de vestido preto e uma blusa branca!</html>");
          
      }
      lblPontos.setText("Pontos: "+ pontos);  
    }//GEN-LAST:event_btnConfirma4ActionPerformed

    private void btnSpSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpSimActionPerformed
      pontos++;      
      lblPontos.setText("Pontos: "+ pontos);        
      btnSpSim.setVisible(false);
      btnNao.setVisible(false);
      btnNao2.setVisible(false);
      btnNao3.setVisible(false);
      btnNao4.setVisible(false);
      btnNao5.setVisible(false);
      btnNao2.setVisible(false);
      btnNao6.setVisible(false);
      btnNao7.setVisible(false);
      btnNao8.setVisible(false);
      btnNao9.setVisible(false);
      btnVerPremios.setVisible(true);
      txtAprensentacao.setText("<html>SABIAA QUE VOCÊ IA CONCORDAR!! RESPOSTA CORRETA!</html>");
      
       
    }//GEN-LAST:event_btnSpSimActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        btnNao.setVisible(false);
        btnNao2.setVisible(true);
        
    }//GEN-LAST:event_btnNaoActionPerformed

    private void btnNao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao2ActionPerformed
        btnNao2.setVisible(false);
        btnNao3.setVisible(true);
    }//GEN-LAST:event_btnNao2ActionPerformed

    private void btnNao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao3ActionPerformed
        btnNao3.setVisible(false);
        btnNao4.setVisible(true);
    }//GEN-LAST:event_btnNao3ActionPerformed

    private void btnNao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao5ActionPerformed
        btnNao5.setVisible(false);
        btnNao6.setVisible(true);
    }//GEN-LAST:event_btnNao5ActionPerformed

    private void btnNao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao4ActionPerformed
        btnNao4.setVisible(false);
        btnNao5.setVisible(true);
    }//GEN-LAST:event_btnNao4ActionPerformed

    private void btnNao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao6ActionPerformed
        btnNao6.setVisible(false);
        btnNao7.setVisible(true);
    }//GEN-LAST:event_btnNao6ActionPerformed

    private void btnNao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao7ActionPerformed
        btnNao7.setVisible(false);
        btnNao8.setVisible(true);
    }//GEN-LAST:event_btnNao7ActionPerformed

    private void btnNao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao8ActionPerformed
        btnNao8.setVisible(false);
        btnNao9.setVisible(true);
    }//GEN-LAST:event_btnNao8ActionPerformed

    private void btnNao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNao9ActionPerformed
        btnNao9.setVisible(false);
        btnNao2.setVisible(true);
    }//GEN-LAST:event_btnNao9ActionPerformed

    private void btnVerPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPremiosActionPerformed
        btnVerPremios.setVisible(false);
        btnFim.setVisible(true);
        florkSp.setVisible(false);
        florkPremios.setVisible(true);
        ImagemFala.setVisible(false);
        txtAprensentacao.setText("VOCÊ MARCOU "+ pontos+ " PONTOS!!! Cofira os prêmios que você ganhou:");
        if(pontos == 1){
            lblPremios1.setVisible(true);
            lblPremios2.setText("<html>1-Vale Beijo</html>");
            lblPremios2.setVisible(true);   
        }
        if(pontos == 2){
            lblPremios1.setVisible(true);
            lblPremios2.setText("<html>1-Vale Beijo 2- Uma Tarde vendo filme</html>");
            lblPremios2.setVisible(true);   
        }
        if(pontos == 3){
            lblPremios1.setVisible(true);
            lblPremios2.setText("<html>1-Vale Beijo 2- Uma Tarde vendo filme -- 3- Um chocolate</html>");
            lblPremios2.setVisible(true);   
        }
        if(pontos == 4){
            lblPremios1.setVisible(true);
            lblPremios2.setText("<html>1- Vale Beijo 2-Uma Tarde vendo filme -- 3- Um chocolate 4-Vale foto</html>");
            lblPremios2.setVisible(true);   
        }
        if(pontos == 5){
            lblPremios1.setVisible(true);
            lblPremios2.setText("<html>1- Vale Beijo 2- Uma Tarde vendo filme -- 3- Um chocolate 4-Vale foto 5-Vale desejo</html>");
            lblPremios2.setVisible(true);   
        }
        
        
        lblPremios1.setVisible(true);
        lblPremios2.setVisible(true);
     
        
    }//GEN-LAST:event_btnVerPremiosActionPerformed

    private void btnFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFimActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFimActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemFala;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnConfirma2;
    private javax.swing.JButton btnConfirma3;
    private javax.swing.JButton btnConfirma4;
    private javax.swing.JButton btnFim;
    private javax.swing.JButton btnMarquin;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnNao2;
    private javax.swing.JButton btnNao3;
    private javax.swing.JButton btnNao4;
    private javax.swing.JButton btnNao5;
    private javax.swing.JButton btnNao6;
    private javax.swing.JButton btnNao7;
    private javax.swing.JButton btnNao8;
    private javax.swing.JButton btnNao9;
    private javax.swing.JButton btnPremios;
    private javax.swing.JButton btnPx;
    private javax.swing.JButton btnPx2;
    private javax.swing.JButton btnPx3;
    private javax.swing.JButton btnPx4;
    private javax.swing.JButton btnSpSim;
    private javax.swing.JButton btnVerPremios;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel florkAcertou;
    private javax.swing.JLabel florkChoro;
    private javax.swing.JLabel florkJoinha;
    private javax.swing.JLabel florkManual;
    private javax.swing.JLabel florkMaoRosto;
    private javax.swing.JLabel florkPremios;
    private javax.swing.JLabel florkSp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblForkCafe;
    private javax.swing.JLabel lblOpcoes;
    private javax.swing.JLabel lblOpcoes2;
    private javax.swing.JLabel lblOpcoes3;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPremios1;
    private javax.swing.JLabel lblPremios2;
    private javax.swing.JSpinner resp;
    private javax.swing.JLabel txtAprensentacao;
    // End of variables declaration//GEN-END:variables
}
