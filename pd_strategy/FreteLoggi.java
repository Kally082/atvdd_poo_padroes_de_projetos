
/* Nova transportadora inserida*/

package pd_strategy;

public class FreteLoggi implements EstrategiaFrete {
    @Override
    public double calcular(double peso) {
        return peso * 1.0 + 12;
    }
}