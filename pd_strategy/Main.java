package pd_strategy;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        System.out.println("SEDEX: R$" + calculadora.calcular("sedex", 3.0));
        System.out.println("PAC: R$" + calculadora.calcular("PAC", 2.0));
        System.out.println("Loggi: R$" + calculadora.calcular("Loggi", 8.0));
        System.out.println("Transportadora: R$" + calculadora.calcular("Transportadora", 5.0));

        calculadora.calcular("J&T Express: R$", 4.0);
    }
}