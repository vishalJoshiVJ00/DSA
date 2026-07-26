package arrays;
import java.util.Scanner;
public class array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i<arr.length; i++){
            System.out.println("enter the number " + (i+1));
            arr[i] = sc.nextInt();
        }
        for(int value: arr){
            System.out.print("values in array");
            System.out.println(value);
        }
    }
}
