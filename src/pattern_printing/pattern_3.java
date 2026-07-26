/*
    * * * * *
   * * * * *
  * * * * *
 * * * * *
* * * * *
 */





import java.util.Scanner;
public class pattern_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            int count = row;
            for(int col =1; col<=(n*2)-row; col++){
                if(1 <= n-count){
                    System.out.print(" ");
                    count++;
                }
                else{
                    System.out.print("*");
                    count++;
                }
            }
            System.out.print("\n");
        }
    }
}
