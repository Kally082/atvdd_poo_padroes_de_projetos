package pd_decorator;

interface Cafe {
    String getDescricao();
    double getPreco();
}

/*PROBLEMA RESOLVIDO: precisa existir uma bebida base à qual os adicionais possam ser somados. */
class CafeSimples implements Cafe {

    private static final double PRECO = 5.00;

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}

/* PROBLEMA RESOLVIDO: evitar repetir em cada adicional a lógica de guardar o café embrulhado. */
abstract class DecoradorBase implements Cafe {

    protected final Cafe cafe;

    public DecoradorBase(Cafe cafe) {
        this.cafe = cafe;
    }
}

/* PROBLEMA RESOLVIDO: adicionar novos ingredientes sem precisar criar uma subclasse nova para cada combinação. */
class DecoradorLeite extends DecoradorBase {

    private static final double ACRESCIMO = 2.00;

    public DecoradorLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Leite";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + ACRESCIMO;
    }
}

class DecoradorChocolate extends DecoradorBase {

    private static final double ACRESCIMO = 3.00;

    public DecoradorChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Chocolate";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + ACRESCIMO;
    }
}

class DecoradorChantilly extends DecoradorBase {

    private static final double ACRESCIMO = 1.50;

    public DecoradorChantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Chantilly";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + ACRESCIMO;
    }
}

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new DecoradorChocolate(new DecoradorChantilly(new DecoradorLeite(new CafeSimples())));

        System.out.println("Bebida: " + cafe.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", cafe.getPreco());

    }
}