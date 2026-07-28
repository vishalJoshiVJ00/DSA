/*
         *
        * *
       *   *
      *     *
       *   *
        * *
         *
 */









package pattern_printing;

import java.util.*;
public class patttern_11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <=n; row++){
            for(int space =1; space<= n-row; space++){
                System.out.print(" ");
            }
            if(row == 1){
                System.out.print("*");
            }
            else {
                System.out.print("*");
                for (int space = 1; space <= (2*row) - 3; space++) {
                    System.out.print(" ");
                }
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
            if(row == 1){
                System.out.print("*");
            }
            else{
                System.out.print("*");
                for (int space = 1; space <= (2*row) - 3; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.flush();
        }

    }
