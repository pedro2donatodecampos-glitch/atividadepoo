import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Teste de Carro (já existente nos exercícios anteriores)
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Carro 1: ");
        meuCarro.exibir();
        System.out.println("TotalCarros = " + Carro.getTotalCarros());

        // Exercício Cliente
        Cliente c1 = new Cliente("Alice", "alice@email.com", "99999-0000");
        Cliente c2 = new Cliente("Bob", "bob@email.com");
        Cliente c3 = new Cliente("Carol");

        System.out.println("\n--- Clientes criados ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("Total de clientes = " + Cliente.getTotalClientes());
    }
}