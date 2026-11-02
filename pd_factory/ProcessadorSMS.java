package pd_factory;

/*PROBLEMA RESOLVIDO: a escolha de criar SMS ficava dentro de um if/else. */

public class ProcessadorSMS extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}