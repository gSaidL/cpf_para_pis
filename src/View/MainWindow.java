package View;

import Model.Verificador;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JPanel contentPane;
    private JTextField textCpf;
    private JLabel labelCpf;
    private JLabel labelResultado;
    private JTextField textResultado;
    private JButton buttonConfirmar;
    private JButton buttonCopiar;

    Verificador verificador = new Verificador();

    public MainWindow(){
        setTitle("Conversor de CPF");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        textResultado.setEditable(false);
//        textResultado.setForeground(Color.BLACK);
        pack();

        buttonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = verificador.gerarVerificador(textCpf.getText());
                textResultado.setText(resultado);
                Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strse1 = new StringSelection(resultado);
                clip.setContents(strse1, strse1);
            }
        });

        buttonCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultado = textResultado.getText();
                Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strse1 = new StringSelection(resultado);
                clip.setContents(strse1, strse1);
            }
        });
    }
}
