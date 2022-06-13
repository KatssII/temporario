public class Carro implements Seguravel{
    private double valorMercado;
    private double anoFabricacao;


    public Carro(double anoFabricacao, double valorMercado) {
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + anoFabricacao + " com valor de mecado "
                + valorMercado;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = valorMercado * 0.04;
        if (anoFabricacao < 2000){
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }
}
