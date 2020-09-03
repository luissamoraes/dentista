package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoUsuario;

public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public FormUsuario() {
        initComponents();
        preencherTabela("select *from usuarios order by usu_nome");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldConfSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        jLabel6.setText("Tipo:");

        jTextFieldUsuario.setEnabled(false);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Administrador", "Dentista", "Aluno", " " }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirmar Senha:");

        jPasswordFieldConfSenha.setEnabled(false);

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jLabel2.setText("Cod:");

        jTextFieldCod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBuscar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordFieldConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        setSize(new java.awt.Dimension(687, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldPesquisar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "preencha o Usuário para continuar");
            jTextFieldUsuario.requestFocus();
        }else if(jPasswordFieldConfSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "preencha o Confirmar Senha para continuar");
            jPasswordFieldConfSenha.requestFocus();
        }else if(jPasswordFieldSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "preencha a Senha para continuar");
            jPasswordFieldSenha.requestFocus();
        }else 
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfSenha.getText())){
            
        if(flag == 1) {
        mod.setUsuNome(jTextFieldUsuario.getText());
        mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
        mod.setUsuSenha(jPasswordFieldSenha.getText());
        dao.Salvar(mod);
        preencherTabela("select *from usuarios order by usu_nome");
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldConfSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTextFieldCod.setText("");
        jButtonCancelar.setEnabled(false);
        
        }else{
            mod.setUsoCod(Integer.parseInt(jTextFieldCod.getText()));
            mod.setUsuNome(jTextFieldUsuario.getText());
            mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
            mod.setUsuSenha(jPasswordFieldSenha.getText());
            dao.Alterar(mod);
            preencherTabela("select *from usuarios order by usu_nome");
            
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfSenha.setText("");
            jTextFieldUsuario.setEnabled(false);
            jPasswordFieldConfSenha.setEnabled(false);
            jComboBoxTipo.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jPasswordFieldSenha.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jTextFieldCod.setText("");
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"As senhas não correspondem!");
        }     
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        mod.setUsuPesquisa(jTextFieldPesquisar.getText());
        BeansUsuario model = dao.buscaUsuario(mod);
        jTextFieldUsuario.setText(model.getUsuNome());
        jTextFieldCod.setText(String.valueOf(model.getUsoCod()));
        jPasswordFieldSenha.setText(model.getUsuSenha());
        jPasswordFieldConfSenha.setText(model.getUsuSenha());
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());
        jButtonExcluir.setEnabled(!true);
        jButtonAlterar.setEnabled(!true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        preencherTabela("select *from usuarios where usu_nome like'%" +mod.getUsuPesquisa()+"%'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfSenha.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION) {
            mod.setUsoCod(Integer.parseInt(jTextFieldCod.getText()));
            dao.Excluir(mod);
            preencherTabela("select *from usuarios order by usu_nome");
            
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfSenha.setText("");
            jTextFieldCod.setText("");
            
            jButtonCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        String nome_usuario =""+jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from usuarios where usu_nome='"+nome_usuario+"'");
        try {
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("usu_cod")));
            jTextFieldUsuario.setText(conex.rs.getString("usu_nome"));
            jComboBoxTipo.setSelectedItem(conex.rs.getString("usu_tipo"));
            jPasswordFieldSenha.setText(conex.rs.getString("usu_senha"));
            jPasswordFieldConfSenha.setText(conex.rs.getString("usu_senha"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ex);
        }        
        conex.desconecta();
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldConfSenha.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldUsuario.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfSenha.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jTextFieldPesquisar.setEnabled(!false);
        jButtonBuscar.setEnabled(!false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfSenha.setText("");
        jTextFieldCod.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTableUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableUsuarioMouseEntered

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID","Usuário", "Senha", "Tipo"};
        conex.conexao();
        conex.executaSql(Sql);       
        try {
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("usu_cod"),conex.rs.getString("usu_nome"),conex.rs.getString("usu_senha"),conex.rs.getString("usu_tipo")});
            }while(conex.rs.next());
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque por outro usuário para preencher a tabela");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableUsuario.setModel(modelo);
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(190);
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(117);
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuario.getTableHeader().setReorderingAllowed(false);
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
