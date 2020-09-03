package modeloConection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoBD {
      
    public Statement stm;
    public ResultSet rs;
    private String driver = "mysql-connector-java-5.1.48-bin";
    private String caminho = "jdbc:mysql://localhost:3306/projetoclinica";
    private String usuario = "root";
    private String senha = "281104";
    public Connection con;
    
    public void conexao() {   // Método responsável por realizar a conexão com a base de dados.          
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" +ex.getMessage());
        }
    }
    
    public void executaSql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n" +ex.getMessage());
        }
    }
    
    public void desconecta() {
        try {      
            con.close();
            //JOptionPane.showMessageDialog(null, "BD Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD:\n" +ex.getMessage());
        }
    }
    
}


