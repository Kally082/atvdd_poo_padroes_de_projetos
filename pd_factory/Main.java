package pd_factory;

public class Main {
    public static void main(String[] args) {
        ProcessadorNotificacao processador = new ProcessadorEmail();
        processador.enviar("Olá! Essa é uma notificação por e-mail.");   

        processador = new ProcessadorSMS();
        processador.enviar("Olá! Essa é uma notificação por SMS.");   
    }
}