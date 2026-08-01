package pattern_printing;
/*

   1
  121
 12321
1234321
 */
import java.util.Scanner;
public class pattern_15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int space = 1; space<=n-row; space++){
                System.out.print(" ");

            }
            for(int num = 1; num<=row; num++){
                System.out.print(num);
            }
            int count = row -1 ;
            for(int num = 1; num<=row-1; num++){

                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
