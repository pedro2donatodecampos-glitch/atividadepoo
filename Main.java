import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        meuCarro.exibir();

        int idade = meuCarro.idadeDoCarro();
        System.out.println("Idade do carro: " + idade);

     
        System.out.println("\nDados do carro usando getters:");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

      
        System.out.println("\nAlterando dados com setters:");
        meuCarro.setMarca("BMW");
        meuCarro.setModelo("X5");
        meuCarro.setAno(2022);
        meuCarro.exibir();

       
        System.out.println("\nTestando validação do ano:");
        meuCarro.setAno(1800); 
        meuCarro.setAno(2030); 

       
        System.out.println("\nLista de carros:");
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Honda", "Civic", 2018));
        carros.add(new Carro("Ford", "Focus", 2019));
        carros.add(new Carro("Chevrolet", "Onix", 2021));

        for (Carro c : carros) {
            c.exibir();
        }
    }
}