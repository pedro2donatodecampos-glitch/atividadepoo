import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        meuCarro.exibir();

        int idade = meuCarro.idadeDoCarro();
        System.out.println("Idade do carro: " + idade);

        // Lista de carros (nova parte solicitada)
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Honda", "Civic", 2018));
        carros.add(new Carro("Ford", "Focus", 2019));
        carros.add(new Carro("Chevrolet", "Onix", 2021));

        for (Carro c : carros) {
            c.exibir();
        }
    }
}