package modeloBeans;

public class BeansDentista {

    public String getPesquisa() {
        return pesquisa;
    }
    
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    private int codigo;
    private String nome;
    private String especialidade;
    private int cro;
    private String pesquisa;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }
}
