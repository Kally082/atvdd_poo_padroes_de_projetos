/*ANTES: cada nova fórmula de frete exigia mexer na mesma cadeia de if/else
COM STRATEGY: esta interface é o contrato de todas as estratégias */
package pd_strategy;

public interface EstrategiaFrete {
    double calcular(double peso);
}