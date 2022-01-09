import java.util.*;

public class PatternSeven{
    public static void main(String[] arguments){

        /*
        pattern:   
                   5 5 5 5 5 
                     4 4 4 4
                       3 3 3
                         2 2
                           1

        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter value of n:");
        // int n=scanner.nextInt();

        int n = 5;
        int spaces;

        for(int i=n; i>=1; i--){
            for(spaces=1; spaces <= n-i; spaces++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");

            }
            
            
            System.out.println();
        }

        System.out.println();
    }
}