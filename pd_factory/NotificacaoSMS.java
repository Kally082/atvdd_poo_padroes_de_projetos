package pd_factory;

/*PROBLEMA RESOLVIDO: o envio por SMS era instanciado direto na regra de negócio. */

public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}