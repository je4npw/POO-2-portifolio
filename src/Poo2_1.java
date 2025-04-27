import javax.swing.*;
import java.awt.*;

public class Poo2_1 extends JFrame {
    public Poo2_1() {
        // Configuração da janela principal
        setTitle("Aplicação Swing");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // JComboBox com opções predefinidas
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        // JCheckBox desmarcado por padrão
        JCheckBox checkBox = new JCheckBox("Marcar opção");

        // JTextField com tamanho adequado
        JTextField textField = new JTextField(15);

        // Botões Salvar e Sair
        JButton btnSalvar = new JButton("Salvar");
        JButton btnSair = new JButton("Sair");

        // Adicionando os componentes à janela
        add(comboBox);
        add(checkBox);
        add(textField);
        add(btnSalvar);
        add(btnSair);
    }

    public static void main(String[] args) {
        // Criando e exibindo a janela
        SwingUtilities.invokeLater(() -> {
            Poo2_1 frame = new Poo2_1();
            frame.setVisible(true);
        });
    }
}