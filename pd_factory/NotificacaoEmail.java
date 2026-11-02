package pd_factory;

/*PROBLEMA RESOLVIDO: o envio por e-mail era instanciado direto na regra de negócio. */

public class NotificacaoEmail implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}