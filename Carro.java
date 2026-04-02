public class Carro {
    public static final int ANO_PRIMEIRO_CARRO = 1886;

    private String marca;
    private String modelo;
    private int ano;
    private static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: ano deve estar entre " + ANO_PRIMEIRO_CARRO + " e 2026!");
            this.ano = 2026;
        } else {
            this.ano = ano;
        }
        totalCarros++;
    }

    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: ano deve estar entre " + ANO_PRIMEIRO_CARRO + " e 2026!");
        } else {
            this.ano = ano;
        }
    }

    public void exibir() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
}