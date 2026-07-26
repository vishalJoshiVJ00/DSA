/*

          *
         ***
        *****
       *******
        *****
         ***
          *
 */






import java.util.*;
public class pattern_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <=n; row++){
            for(int space =1; space<= n-row; space++){
                System.out.print(" ");
            }
            for(int star =1; star <= (row*2)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //part2
        for(int row = n; row>0; row-- ){
            if(row==n){
                continue;
            }
            for(int space = 1; space<=n-(row-1)-1; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=(row*2)-1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.flush();
    }
}