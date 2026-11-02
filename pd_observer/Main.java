package pd_observer;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarOuvinte(new EmailService());
        pedido.adicionarOuvinte(new LogService());

        pedido.finalizar();
    }
}