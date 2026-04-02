public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    private static int totalClientes = 0;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }

    public Cliente(String nome, String email) {
        this(nome, email, "Não informado");
    }

    public Cliente(String nome) {
        this(nome, "Não informado", "Não informado");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }

    @Override
    public String toString() {
        return "Cliente{nome='" + nome + "', email='" + email + "', telefone='" + telefone + "'}";
    }
}