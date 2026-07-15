/*
    *
   ***
  *****
 *******
*********
 */






import java.util.Scanner;
public class pattern_5 {
    static void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int row = 1; row<=n; row++){
        for(int col = 1; col <= n-row; col++){
            System.out.print(" ");
        }
        for(int star = 1; star<=(row*2)-1; star++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }
}
