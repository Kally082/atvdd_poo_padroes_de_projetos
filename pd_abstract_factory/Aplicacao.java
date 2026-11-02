package pd_abstract_factory;

/*PROBLEMA RESOLVIDO: condicionais de tema e mistura acidental de componentes.*/
public class Aplicacao {

    private final FabricaTema.Botao botao;
    private final FabricaTema.Menu menu;

    public Aplicacao(FabricaTema fabrica) {
        this.botao = fabrica.criarBotao();
        this.menu = fabrica.criarMenu();
    }

    public void renderizarTela() {
        botao.desenhar();
        menu.desenhar();
    }
}