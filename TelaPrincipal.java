package visão;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    FormDentista tela = new FormDentista();
    FormUsuario telaUsu = new FormUsuario();
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();  
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonCadDentista = new javax.swing.JButton();
        jButtonCadAluno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadDentista = new javax.swing.JMenuItem();
        jMenuItemCadAluno = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemvindo = new javax.swing.JMenuItem();
        jMenuAtendimentos = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaPrincipal");
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setToolTipText("");
        jPanelInternal.setLayout(null);

        jButtonCadDentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/log_dentista.png"))); // NOI18N
        jButtonCadDentista.setToolTipText("Dentistas");
        jButtonCadDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadDentistaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadDentista);
        jButtonCadDentista.setBounds(50, 60, 90, 100);

        jButtonCadAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogCadAluno.jpg"))); // NOI18N
        jButtonCadAluno.setToolTipText("Alunos");
        jButtonCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlunoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadAluno);
        jButtonCadAluno.setBounds(230, 60, 100, 100);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Agendamento -");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(410, 30, 120, 20);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Atendimento");
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(410, 60, 120, 100);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 40, 590, 240);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 220, 17);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botão exit.jpg"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(550, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 20, 600, 310);

        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 340, 50, 14);

        jLabelUsuario.setText("jLabel4");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 340, 190, 14);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadDentista.setText("Dentistas");
        jMenuItemCadDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadDentistaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadDentista);

        jMenuItemCadAluno.setText("Alunos");
        jMenuCadastros.add(jMenuItemCadAluno);

        jMenuItemUsuario.setText("Usuários");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemvindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemvindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemvindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuAtendimentos.setText("Atendimentos");
        jMenuBar1.add(jMenuAtendimentos);

        jMenuSobre.setText("Sobre");
        jMenuBar1.add(jMenuSobre);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(618, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadDentistaActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(tela==null){
                    tela = new FormDentista();
                    tela.setVisible(true);
                    tela.setResizable(false);
                }else{
                    tela.setVisible(true);
                    tela.setResizable(false);
                }
                //FormDentista tela = new FormDentista();
                //tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!"+ex);
        }        
    }//GEN-LAST:event_jMenuItemCadDentistaActionPerformed

    private void jMenuItemTelaBemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemvindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemvindoActionPerformed

    private void jButtonCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlunoActionPerformed

    }//GEN-LAST:event_jButtonCadAlunoActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();               
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonCadDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadDentistaActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(tela==null){
                    tela = new FormDentista();
                    tela.setVisible(true);
                    tela.setResizable(false);
                }else{
                    tela.setVisible(true);
                    tela.setResizable(false);
                }
                //FormDentista tela = new FormDentista();
                //tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!"+ex);
        }
    }//GEN-LAST:event_jButtonCadDentistaActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        try {
            conecta.executaSql("select *from usuarios where usu_nome='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("usu_tipo").equals("Administrador")){
                if(telaUsu==null){
                    telaUsu = new FormUsuario();
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }else{
                    telaUsu.setVisible(true);
                    telaUsu.setResizable(false);
                }
                //FormUsuario tela = new FormUsuario();
                //tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Você não tem permissão para essa funcionalidade!\n Contate o administrador do sistema!"+ex);
        }
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadAluno;
    private javax.swing.JButton jButtonCadDentista;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAtendimentos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadAluno;
    private javax.swing.JMenuItem jMenuItemCadDentista;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemvindo;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
