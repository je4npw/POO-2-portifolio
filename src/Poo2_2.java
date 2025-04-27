public class Poo2_2 {
    public static void main(String[] args) {
        // Instanciando as classes que implementam Runnable
        Thread numerosThread = new Thread(new NumerosRunnable());
        Thread mensagensThread = new Thread(new MensagensRunnable());

        // Iniciando as threads
        numerosThread.start();
        mensagensThread.start();
    }
}

// Classe que exibe números de 1 a 10 com intervalo de 1 segundo
class NumerosRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                System.err.println("Thread de números interrompida.");
            }
        }
    }
}

// Classe que exibe mensagens personalizadas a cada 2 segundos
class MensagensRunnable implements Runnable {
    @Override
    public void run() {
        String[] mensagens = {"Estude", "Café", "Descanse 5 min", "Dê uma olhada ao redor", "Foco!", "Aproveite o momento", "Respire fundo", "Continue assim!", "Você consegue!", "Deu certo!"};
        for (String mensagem : mensagens) {
            System.out.println("Thread2: " + mensagem);
            try {
                Thread.sleep(2000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                System.err.println("Thread de mensagens interrompida.");
            }
        }
    }
}