public class Poo2_3 {
    public static void main(String[] args) {
        // Obtendo a instância única do Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verificando se ambas as referências apontam para a mesma instância
        System.out.println("singleton1 e singleton2 são iguais? " + (singleton1 == singleton2));

        // Usando o Singleton em um cenário prático
        singleton1.exibirMensagem("Exemplo de uso do padrão Singleton.");
    }
}

