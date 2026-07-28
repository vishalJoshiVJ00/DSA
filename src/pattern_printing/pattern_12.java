package pattern_printing;

/*


         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *


 */
import java.util.Scanner;
public class pattern_12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int star = 1; star<=row; star ++){
                System.out.print("*");
            }
            for(int space = 1; space<=(n*2) - (row*2); space ++){
                System.out.print(" ");
            }
            for(int star = 1; star<=row; star ++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = n; row>0; row--){
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            for(int space = 1; space <= (n*2)-(row*2); space++){
                System.out.print(" ");
            }

            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
