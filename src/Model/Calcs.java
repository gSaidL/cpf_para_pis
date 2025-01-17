package Model;

public class Calcs {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num10;

    public int Mult(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10){
        return (num1 * 3 + num2 * 2 + num3 * 9 + num4 * 8 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3 + num10 * 2);
    }

    public int Div(int num){
        int result = num % 11;
        if(11 - result < 2){
            return 0;
        }
        else{
            return 11 - result;
        }
    }
}
