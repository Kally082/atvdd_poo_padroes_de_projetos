/*ANTES: qualquer parte do sistema podia fazer "new" e recarregar o arquivo de configurações várias vezes, gerando inconsistências.
AGORA: com o Singleton (construtor privado + instância única criada sob demanda). */

package pd_singleton;

public class ConfiguracaoApp {

    private String urlBanco;
    private ConfiguracaoApp() {
        System.out.println("Lendo o arquivo de configurações do disco...");
        this.urlBanco = "jdbc:mysql://localhost:3306/meubanco";
    }

    private static class Mantenedor {
        private static final ConfiguracaoApp INSTANCIA = new ConfiguracaoApp();
    }

    public static ConfiguracaoApp obterInstancia() {
        return Mantenedor.INSTANCIA;
    }

    public String getUrlBanco() {
        return urlBanco;
    }
}