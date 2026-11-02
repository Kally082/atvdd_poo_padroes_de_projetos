package pd_abstract_factory;

public class Main {
    public static void main(String[] args) {
        new Aplicacao(new FabricaDark()).renderizarTela();
        new Aplicacao(new FabricaLight()).renderizarTela();
    }
}
