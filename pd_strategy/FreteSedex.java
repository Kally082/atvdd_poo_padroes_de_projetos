/* PROBLEMA RESOLVIDO: a fórmula do SEDEX estava misturada com as demais no if/else. */

package pd_strategy;

public class FreteSedex implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.5 + 10;
    }
}
