
import java.util.Scanner;

public class Q14_Pattern14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        charTriangle(n);
        
    }

    public static void charTriangle(int row){
        
        int ascii = 65;

        for(int i = 1; i <= row; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char) (ascii+j));
            }
            System.out.println();
        }
    }
}
