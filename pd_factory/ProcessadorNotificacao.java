package pd_factory;

/*PROBLEMA RESOLVIDO: acoplamento forte entre a regra de negócio e os "new" concretos. */

public abstract class ProcessadorNotificacao {

    protected abstract Notificacao criarNotificacao();

    public void enviar(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}