import java.util.Scanner;

public class P1_SecondLargestElement {

    public static int secondLargest(int[] arr){

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=1; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i]; 
            } else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    
    }


    public static int secondSmallest(int[] arr){
    
        int n = arr.length; 
        int smallest = arr[0]; 
        int secondSmallest = Integer.MAX_VALUE;
    
        for(int i=1; i < n; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest; 
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
    
        return secondSmallest;
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   

        int secondLargestValue = secondLargest(arr);
        int secondSmallestValue = secondSmallest(arr);

        System.out.println("Second Largest: "+secondLargestValue);
        System.out.println("Second Smallest: "+secondSmallestValue);

        sc.close();

    }
}