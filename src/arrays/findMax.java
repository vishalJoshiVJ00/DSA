package arrays;
public class findMax {
    static void main(String[] args) {
        int arr[] = {1,7,9,3,21};
        int max = arr[0];
        for(int i= 1; i<=arr.length -1; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
