package Model;

import View.MainWindow;

public class Converter {
    Calcs calcs = new Calcs();
    MainWindow window = new MainWindow();

    String cpf = window.getTextCpf();

    char[] splitCpf = cpf.toCharArray();
    int num1 = Integer.parseInt(String.valueOf(splitCpf[0]));
    int num2 = Integer.parseInt(String.valueOf(splitCpf[1]));
    int num3 = Integer.parseInt(String.valueOf(splitCpf[2]));
    int num4 = Integer.parseInt(String.valueOf(splitCpf[3]));
    int num5 = Integer.parseInt(String.valueOf(splitCpf[4]));
    int num6 = Integer.parseInt(String.valueOf(splitCpf[5]));
    int num7 = Integer.parseInt(String.valueOf(splitCpf[6]));
    int num8 = Integer.parseInt(String.valueOf(splitCpf[7]));
    int num9 = Integer.parseInt(String.valueOf(splitCpf[8]));
    int num10 = Integer.parseInt(String.valueOf(splitCpf[9]));

    int total = calcs.Mult(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
    int verificador = calcs.Div(total);

    String cpfShort = cpf.substring(0,10);

    String resultado = 8 + cpfShort + verificador;
}
