public class Administrador extends Usuario {

    private String nivelAcesso;

    public Administrador(String nome, String email, String nivelAcesso) {
        super(nome, email);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nivel de acesso: " + nivelAcesso);
    }
}


