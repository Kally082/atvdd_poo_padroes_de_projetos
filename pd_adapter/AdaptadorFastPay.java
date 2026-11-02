package pd_adapter;

/*ANTES: o sistema esperava Reais e a biblioteca FastPayLegacy só aceitava Dólar, com método e assinatura diferentes.
 AGORA: o Adapter traduz a chamada do sistema para a chamada da biblioteca. */

public class AdaptadorFastPay implements ProcessadorPagamento {

    private final FastPayLegacy fastPay;
    private final double cotacaoDolar;

    public AdaptadorFastPay(FastPayLegacy fastPay, double cotacaoDolar) {
        this.fastPay = fastPay;
        this.cotacaoDolar = cotacaoDolar;
    }

    @Override
    public void processar(double valorEmReais) {
        double valorEmDolar = valorEmReais / cotacaoDolar;
        fastPay.executeTransaction(valorEmDolar);
    }
}