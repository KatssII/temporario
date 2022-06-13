public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        Carro carro = new Carro(2012, 45000d);
        Imovel imovel =new Imovel(320, 920000);
        corretoraSeguros.fazerPropostaSeguro(carro);
        corretoraSeguros.fazerPropostaSeguro(imovel);

    }
}
