public class Singleton {
    // Campo estático para armazenar a única instância
    private static Singleton instancia;

    // Construtor privado para impedir criação de instâncias externas
    private Singleton() {
        System.out.println("Instância Singleton criada!");
    }

    // Método estático público para acessar a instância única
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Método prático para demonstrar o uso do Singleton
    public void exibirMensagem(String mensagem) {
        System.out.println("Mensagem do Singleton: " + mensagem);
    }
}