import java.util.*;

public class PatternFive{
    public static void main(String[] arguments){

        /*
        pattern:    1 
                    2 3
                    3 4 5
                    4 5 6 7
                    5 6 7 8 9

        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter value of n:");
        // int n=scanner.nextInt();

        int n = 5;
        int count;

        for(int i=1; i<=n; i++){
            count = i;
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        System.out.println();
    }
}