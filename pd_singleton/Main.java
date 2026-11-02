package pd_singleton;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoApp a = ConfiguracaoApp.obterInstancia();
        ConfiguracaoApp b = ConfiguracaoApp.obterInstancia();

        System.out.println(a.getUrlBanco());
        System.out.println("Esses objetos possuem a mesma instância? " + (a == b));
    }
}