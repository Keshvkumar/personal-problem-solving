import java.util.*;

public class PatternFour{
    public static void main(String[] arguments){

        /*
        pattern:    1 
                    2 2       
                    3 3 3     
                    4 4 4 4   
                    5 5 5 5 5 

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
            }
            count++;
            System.out.println();
        }

        System.out.println();
    }
}