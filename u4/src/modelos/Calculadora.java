package modelos;

public class Calculadora {

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumar(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans += num;
        }
        return ans;
    }
}
