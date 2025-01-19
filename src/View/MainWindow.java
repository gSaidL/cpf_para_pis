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

    public MainWindow() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.updateComponentTreeUI(contentPane);

        setTitle("Conversor de CPF");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        textResultado.setEditable(false);
        pack();
        setResizable(false);

        Font fonte = new Font("Arial", Font.PLAIN, 16);
        labelCpf.setFont(fonte);
        labelResultado.setFont(fonte);
        textCpf.setFont(fonte);
        textResultado.setFont(fonte);
        buttonConfirmar.setFont(fonte);
        buttonCopiar.setFont(fonte);

        buttonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = textCpf.getText();
                if(cpf.length() != 11){
                    JOptionPane.showMessageDialog(null, "CPF deve conter 11 dígitos", "Erro", 0);
                }
                else{
                    String resultado = verificador.gerarVerificador(cpf);
                    textResultado.setText(resultado);
                    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                    StringSelection strse1 = new StringSelection(resultado);
                    clip.setContents(strse1, strse1);
                }
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
