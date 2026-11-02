package pd_adapter;

/*PROBLEMA RESOLVIDO: biblioteca legada incompatível (Dólar e assinatura diferente). */
public class FastPayLegacy {
    public void executeTransaction(double dollarsAmount) {
        System.out.println("Pago via FastPay: $" + dollarsAmount);
    }
}