/* PROBLEMA RESOLVIDO: a fórmula do PAC estava misturada com as demais no if/else. */
package pd_strategy;

public class FretePac implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 0.8 + 5;
    }
}