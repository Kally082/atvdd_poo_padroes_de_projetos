package pd_observer;

/*PROBLEMA RESOLVIDO: era chamado diretamente pelo Pedido */
public class LogService implements OuvintePedido {

    @Override
    public void aoFinalizar() {
        registrarLog();
    }

    public void registrarLog() {
        System.out.println("Log registrado: pedido finalizado.");
    }
}