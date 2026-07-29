package pattern_printing;
/*
A
A B
A B C
A B C D
 */
import java.util.Scanner;
public class pattern_13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            int alpha = 65;
            for(int col = 1; col<=row; col++){
                System.out.print((char) (alpha ));
                alpha++;
            }
            System.out.println();
        }
    }
}
