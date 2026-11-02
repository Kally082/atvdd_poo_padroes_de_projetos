/* PROBLEMA RESOLVIDO: a fórmula da TRANSPORTADORA estava misturada com as demais no if/else. */

package pd_strategy;

public class FreteTransportadora implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}