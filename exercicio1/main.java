public class Main {

    public static void main(String[] args) {

        Administrador admin = new Administrador(
            "Emily",
            "Emily@email.com",
            "Basico"
        );

        admin.setNivelAcesso("Total");

        admin.exibirDados();
    }