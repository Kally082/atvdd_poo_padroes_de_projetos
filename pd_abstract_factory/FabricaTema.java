package pd_abstract_factory;

/*PROBLEMA RESOLVIDO: era possível misturar componentes de temas diferentes.*/
public interface FabricaTema {
    Botao criarBotao();
    Menu criarMenu();

    interface Botao {
        void desenhar();
    }

    interface Menu {
        void desenhar();
    }
}

// --------------- FAMÍLIA DARK ---------------

class BotaoDark implements FabricaTema.Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão escuro");
    }
}

class MenuDark implements FabricaTema.Menu {
    @Override
    public void desenhar() {
        System.out.println("Desenhando menu escuro");
    }
}

class FabricaDark implements FabricaTema {
    @Override
    public Botao criarBotao() {
        return new BotaoDark();
    }

    @Override
    public Menu criarMenu() {
        return new MenuDark();
    }
}

// --------------- FAMÍLIA LIGHT ---------------

class BotaoLight implements FabricaTema.Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão claro");
    }
}

class MenuLight implements FabricaTema.Menu {
    @Override
    public void desenhar() {
        System.out.println("Desenhando menu claro");
    }
}

class FabricaLight implements FabricaTema {
    @Override
    public Botao criarBotao() {
        return new BotaoLight();
    }

    @Override
    public Menu criarMenu() {
        return new MenuLight();
    }
}