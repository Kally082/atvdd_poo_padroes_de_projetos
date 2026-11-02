package pd_observer;

/*PROBLEMA RESOLVIDO: era chamado diretamente pelo Pedido. */
public class EmailService implements OuvintePedido {

    @Override
    public void aoFinalizar() {
        enviarEmail();
    }

    public void enviarEmail() {
        System.out.println("E-mail de confirmação enviado.");
    }
}