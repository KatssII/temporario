public class Imovel implements Seguravel {

    private int areaConstruida;
    private double valorMercado;

    public Imovel(int areaConstruida, double valorMercado) {
        this.areaConstruida = areaConstruida;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescricao() {
        return "Imovel  com área construida de " + areaConstruida + "m² e valor de mercado " + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }
}
