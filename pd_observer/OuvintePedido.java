package pd_observer;

/*PROBLEMA RESOLVIDO: o Pedido dependia diretamente de cada serviço interessado no evento.*/
public interface OuvintePedido {
    void aoFinalizar();
}