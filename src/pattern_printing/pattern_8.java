/*
 *
 * *
 *   *
 *     *
 * * * * *
 */

import java.util.*;
public class pattern_8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row<=n; row++){
            if(row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }
            else{
                    System.out.print("* ");
                    for(int space = row - 2; space>0; space--){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
            System.out.println();
            }
        }
    }
