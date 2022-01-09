import java.util.*;

public class PatternThree{
    public static void main(String[] arguments){

        /*
        pattern:    1 
                    2 3
                    4 5 6
                    7 8 9 10       
                    11 12 13 14 15

        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter value of n:");
        // int n=scanner.nextInt();

        int n = 5;
        int count=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        System.out.println();
    }
}