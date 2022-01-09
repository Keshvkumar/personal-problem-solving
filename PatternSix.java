import java.util.*;

public class PatternSix{
    public static void main(String[] arguments){

        /*
        pattern:    _ _ _ _ 1 
                    _ _ _ 2 2
                    _ _ 3 3 3
                    _ 4 4 4 4
                    5 5 5 5 5

        _ is represented as a space
        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter value of n:");
        // int n=scanner.nextInt();

        int n = 5;
        int spaces;

        for(int i=1; i<=n; i++){
            for(spaces=1; spaces <= n-i; spaces++){
                System.out.print("_"+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");

            }
            System.out.println();
        }

        System.out.println();
    }
}