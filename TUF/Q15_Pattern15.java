
import java.util.Scanner;

public class Q15_Pattern15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        downwardCharTriangle(n);

    }

    public static void downwardCharTriangle(int row){
        
        int asciiValue = 65;

        for(int i = row; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)(asciiValue+j));
            }
            System.out.println();
        }
    }

}
