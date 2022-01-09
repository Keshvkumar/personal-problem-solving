import java.util.*;

public class PatternOne{
    public static void main(String[] arguments){

         /*
        pattern:    * 
                    * *
                    * * *
                    * * * *
                    * * * * *

        */

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n=scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}