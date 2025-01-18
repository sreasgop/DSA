import java.util.Scanner;

public class P2_CheckSortedArray {
    
    public static boolean isSorted(int[] arr){
        
        int n = arr.length;
        boolean sorted = true;

        for(int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
                break;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " integers: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted: "+isSorted(arr));

        sc.close();
        
    }
}
