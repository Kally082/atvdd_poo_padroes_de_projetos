package pd_strategy;
import java.util.HashMap;
import java.util.Map;

/*
 PROBLEMA RESOLVIDO: cadeia de if/else que crescia a cada novo tipo de frete.
 PADRÃO APLICADO: Strategy (esta classe é o Contexto: escolhe a estratégia e delega o cálculo).
 */

public class CalculadoraFrete {
    private final Map<String, EstrategiaFrete> estrategias = new HashMap<>();

    public CalculadoraFrete() {
        estrategias.put("SEDEX", new FreteSedex());
        estrategias.put("PAC", new FretePac());
        estrategias.put("TRANSPORTADORA", new FreteTransportadora());
        estrategias.put("LOGGI", new FreteLoggi());
    }

    public double calcular(String tipo, double peso) {
        EstrategiaFrete estrategia = estrategias.get(tipo.toUpperCase());

        if (estrategia == null) {
            throw new IllegalArgumentException("Tipo de frete inválido");
        }

        return estrategia.calcular(peso);
    }
}
