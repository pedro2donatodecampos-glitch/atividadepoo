import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Carro com construtor parametrizado:");
        meuCarro.exibir();

        Carro carroDesconhecido = new Carro();
        System.out.println("Carro com construtor sem parâmetros (valores padrão):");
        carroDesconhecido.exibir();

        System.out.println("-- Continuando com o carro principal --");

        int idade = meuCarro.idadeDoCarro();
        System.out.println("Idade do carro: " + idade);

        System.out.println("\nDados do carro usando getters:");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

        System.out.println("Atualizando dados do carro usando setters:");
        meuCarro.setMarca("BMW");
        meuCarro.setModelo("X5");
        meuCarro.setAno(2022);
        meuCarro.exibir();

        System.out.println("Testando validação do ano:");
        meuCarro.setAno(1800);
        meuCarro.setAno(2030);

        System.out.println("Lista de carros usando construtor:");
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Honda", "Civic", 2018));
        carros.add(new Carro("Ford", "Focus", 2019));
        carros.add(new Carro("Chevrolet", "Onix", 2021));

        for (Carro c : carros) {
            c.exibir();
        }
    }
}