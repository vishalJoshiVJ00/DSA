package pattern_printing;
/*
      *******
       *****
        ***
         *
        ***
       *****
      *******
 */
import java.util.Scanner;
public class pattern_14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int space = 1; space<=row-1; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= (n*2)-(row*2-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = n; row>0; row--){
            if(row == n){
                continue;
            }
            for(int space = 1; space<=row-1; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= (n*2)-(row*2-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

