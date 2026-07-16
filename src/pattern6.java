/*
*******
 *****
  ***
   *
 */






import java.util.Scanner;
public class pattern6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = n; row >= 1          ; row--) {
            for (int col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
        System.out.print("\n");
        for (int space = 1; space<=(n+1)-row ; space++) {
            System.out.print(" ");
        }
    }
    }
}
