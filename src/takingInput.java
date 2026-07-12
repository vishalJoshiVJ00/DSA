import java.util.Scanner;

public class takingInput {
    static void main() {
        Scanner s_input = new Scanner(System.in);
        System.out.println("enter the byte");
        int num1 = s_input.nextByte();
        System.out.println("byte number:" + num1);
        System.out.println("enter the integer:");
        int num2 = s_input.nextInt();
        System.out.println("integer: " + num2);
        System.out.println("enter the float:");
        float num3 = s_input.nextFloat();
        System.out.println("integer: " + num3);
        s_input.close();
    }
}
