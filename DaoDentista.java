package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansDentista;

public class DaoDentista {   
    ConexaoBD conex = new ConexaoBD();
    BeansDentista mod = new BeansDentista();
    
    public void Salvar(BeansDentista mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into dentistas(nome_dentista, especialidade_dentista, cro_dentista) values (?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3,mod.getCro());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados!/nErro:" +ex);
        }       
        conex.desconecta();
    }
    
    public void Editar(BeansDentista mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update dentistas set nome_dentista=?, especialidade_dentista=?, cro_dentista=? where cod_dentista=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setInt(3, mod.getCro());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados!/nErro:" +ex);
        }        
        conex.desconecta();
    }
    
    public void Excluir(BeansDentista mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from dentistas where cod_dentista=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados!/nErro:" +ex);
        }        
        conex.desconecta();
    }
    
 public BeansDentista buscaDentista(BeansDentista mod) {
     conex.conexao();
     conex.executaSql("select *from dentistas where nome_dentista like'%" +mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_dentista"));
            mod.setNome(conex.rs.getString("nome_dentista"));
            mod.setEspecialidade(conex.rs.getString("especialidade_dentista"));
            mod.setCro(conex.rs.getInt("cro_dentista"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dentista não cadastrado!");
        }
     conex.desconecta();
        return mod;
 }
}
