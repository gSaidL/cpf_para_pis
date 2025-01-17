package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JPanel contentPane;
    private JTextField textCpf;
    private JLabel labelCpf;
    private JLabel labelResultado;
    private JLabel textResultado;
    private JButton buttonConfirmar;

    public MainWindow(){
        setTitle("Conversor de CPF");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setVisible(true);

        buttonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCpf();
                System.out.println(getCpf());
            }
        });
    }

    public String getCpf(){
        return textCpf.getText();
    }


}
