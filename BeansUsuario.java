package modeloBeans;

public class BeansUsuario {
    
    private Integer usoCod;
    private String usuNome;
    private String usuTipo;
    private String usuSenha;
    private String usuPesquisa;

    public String getUsuPesquisa() {
        return usuPesquisa;
    }

    public void setUsuPesquisa(String usuPesquisa) {
        this.usuPesquisa = usuPesquisa;
    }

    public Integer getUsoCod() {
        return usoCod;
    }

    public void setUsoCod(Integer usoCod) {
        this.usoCod = usoCod;
    }

    public String getUsuNome() {
        return usuNome;
    }

    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    public String getUsuTipo() {
        return usuTipo;
    }

    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    public String getUsuSenha() {
        return usuSenha;
    }

    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }
    
}
