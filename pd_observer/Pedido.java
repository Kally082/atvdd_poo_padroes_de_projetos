package pd_observer;

import java.util.ArrayList;
import java.util.List;

/*ANTES: Pedido instanciava e chamava manualmente cada serviço, exigindo alterar a classe a cada novo serviço.
 AGORA: mantém a lista de ouvintes e os notifica */
public class Pedido {

    // Lista dinâmica de quem quer ser avisado
    private final List<OuvintePedido> ouvintes = new ArrayList<>();

    public void adicionarOuvinte(OuvintePedido ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void removerOuvinte(OuvintePedido ouvinte) {
        ouvintes.remove(ouvinte);
    }

    public void finalizar() {
        System.out.println("Pedido finalizado!");
        notificarOuvintes();
    }

    private void notificarOuvintes() {
        for (OuvintePedido ouvinte : ouvintes) {
            ouvinte.aoFinalizar();
        }
    }
}