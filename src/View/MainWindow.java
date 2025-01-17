package View;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JPanel contentPane;
    private JTextField textCpf;
    private JLabel labelCpf;
    private JLabel labelResultado;
    private JLabel textResultado;
    private JButton buttonConfirmar;

    public String getTextCpf() {
        return textCpf.getText();
    }

    public MainWindow(){
        setTitle("Conversor de CPF");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
