/*
*
* *
* * *
* * * *
* * * * *
 */



import java.util.Scanner;
public class pattern_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
