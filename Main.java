import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu de Carros ---");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite um número de 1 a 4.");
                continue;
            }

            if (opcao == 1) {
                System.out.print("Marca: ");
                String marca = scanner.nextLine().trim();
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine().trim();

                int ano;
                while (true) {
                    System.out.print("Ano: ");
                    try {
                        ano = Integer.parseInt(scanner.nextLine());
                        if (ano < Carro.ANO_PRIMEIRO_CARRO || ano > 2026) {
                            System.out.println("Ano inválido. Deve ser entre " + Carro.ANO_PRIMEIRO_CARRO + " e 2026.");
                        } else {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Digite um número inteiro para o ano.");
                    }
                }

                Carro novoCarro = new Carro(marca, modelo, ano);
                carros.add(novoCarro);
                System.out.println("Carro cadastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n--- Lista de carros ---");
                if (carros.isEmpty()) {
                    System.out.println("Nenhum carro cadastrado.");
                } else {
                    for (int i = 0; i < carros.size(); i++) {
                        System.out.print((i + 1) + ") ");
                        carros.get(i).exibir();
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Total de carros cadastrados na classe (static): " + Carro.getTotalCarros());
                System.out.println("Total de carros na lista (instância): " + carros.size());

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Escolha 1, 2, 3 ou 4.");
            }
        }

        scanner.close();
    }
}