package pd_factory;
/*PROBLEMA RESOLVIDO: a escolha de criar e-mail ficava dentro de um if/else. */

public class ProcessadorEmail extends ProcessadorNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
