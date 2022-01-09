import java.util.*;

public class PatternTwo{
    public static void main(String[] arguments){

        /*
        pattern:    A
                    BB
                    CCC
                    DDDD
                    EEEEE
                    FFFFFF

        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter value of n:");
        // int n=scanner.nextInt();

        int n = 26;
        char value = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(value);
            }

            // value=value+1 will causes an implicit narrowing conversion.
            // we need to use either value++ or value+=1 instead.
            value += (1);
            System.out.println();
        }

        System.out.println();
    }
}