package pd_adapter;

public class Main {
    public static void main(String[] args) {
        FastPayLegacy biblioteca = new FastPayLegacy();
        ProcessadorPagamento processador = new AdaptadorFastPay(biblioteca, 5.0);

        processador.processar(100.0);   // Pago via FastPay: $20.0
    }
}