import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Carro 1 criado:");
        meuCarro.exibir();
        System.out.println("Total de carros: " + Carro.getTotalCarros());

        Carro carroDesconhecido = new Carro();
        System.out.println("\nCarro 2 criado:");
        carroDesconhecido.exibir();
        System.out.println("Total de carros: " + Carro.getTotalCarros());

        System.out.println("\n--- Criando mais 5 carros para totalizar 7 ---");
        ArrayList<Carro> carros = new ArrayList<>();
        
        carros.add(new Carro("Honda", "Civic", 2018));
        System.out.println("Carro 3 criado. Total: " + Carro.getTotalCarros());
        
        carros.add(new Carro("Ford", "Focus", 2019));
        System.out.println("Carro 4 criado. Total: " + Carro.getTotalCarros());
        
        carros.add(new Carro("Chevrolet", "Onix", 2021));
        System.out.println("Carro 5 criado. Total: " + Carro.getTotalCarros());
        
        carros.add(new Carro("Mercedes", "C-Class", 2023));
        System.out.println("Carro 6 criado. Total: " + Carro.getTotalCarros());
        
        carros.add(new Carro("Audi", "A4", 2025));
        System.out.println("Carro 7 criado. Total: " + Carro.getTotalCarros());

        System.out.println("\n--- Demonstração: acessando static ---");
        System.out.println("Acessando por CLASSE: Carro.getTotalCarros() = " + Carro.getTotalCarros());
        System.out.println("Acessando por OBJETO: meuCarro.getTotalCarros() = " + meuCarro.getTotalCarros());
        System.out.println("Ambos retornam o MESMO valor porque totalCarros é atributo da classe!");
        System.out.println("Diferença: um é compartilhado (static) e outro é único por objeto (instância).\n");

        demonstrarEscopo();
    }
    private static void demonstrarEscopo() {
        System.out.println("\n--- Demonstração de escopo de variáveis ---");

        int x;
        if (true) {
            x = 10;
        }
        System.out.println("x (corrigido) = " + x);

    }
}