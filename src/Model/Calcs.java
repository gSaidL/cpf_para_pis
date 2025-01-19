package Model;

public class Calcs {
    public int Mult(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10){
        return (num1 * 3 + num2 * 2 + num3 * 9 + num4 * 8 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3 + num10 * 2);
    }

    public int Div(int num){
        int result = num % 11;
        if(result < 2){
            return 0;
        }
        else{
            return 11 - result;
        }
    }
}
