/*
* * * * *
* * * *
* * *
* *
*
 */



import java.util.Scanner;
public class pattern_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n-(row-1); col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
