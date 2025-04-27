import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Poo2_4 {
    public static void main(String[] args) {
        // Parâmetros de conexão
        String url = "jdbc:mysql://localhost:3306/redesa15_gestor";
        String usuario = "laravel";
        String senha = "mariadbpass";

        // Consulta SQL
        String consulta = "SELECT name, email FROM users";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
             PreparedStatement stmt = conexao.prepareStatement(consulta);
             ResultSet resultado = stmt.executeQuery()) {

            System.out.println("Conexão bem-sucedida!");
            // percorrendo os resultados
            while (resultado.next()) {
                String name = resultado.getString("name");
                String email = resultado.getString("email");

                System.out.printf("Nome: %s, Email: %s%n", name, email);
            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao acessar o banco de dados: " + e.getMessage());
        }
    }
}