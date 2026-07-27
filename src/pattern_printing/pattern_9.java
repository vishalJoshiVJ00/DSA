package pattern_printing;/*
        *
       *  *
      *    *
     *      *
    **********

      */



import java.util.*;
public class pattern_9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <=n; row++){
           for(int space = 1; space<= n - row; space++){
               System.out.print("  ");
           }
           if(row==1 || row == n){
               for(int col =1; col<=row*2 -1; col++){
                   System.out.print("* ");
               }
           }
           else{
               System.out.print("* ");
               for(int space = 1; space<=2*row - 3; space++){
                   System.out.print("  ");
               }
               System.out.print("* ");
           }

            System.out.println();
        }
    }
}