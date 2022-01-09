import java.util.*;

public class PyramidPattern{
    public static void main(String[] arguments){

        /*
        pattern:   
                          * 
                        * * *
                      * * * * *
                    * * * * * * *

        */
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of n:");
        int n=scanner.nextInt();

        // int n = 50;
        int spaces;

        for(int i=1; i<=n; i++){

            for(spaces=n-i+1; spaces > 1; spaces--){
                System.out.print(" "+" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");

            }
            if(i!=1){
                for(int j=1; j<i; j++){
                    System.out.print("*"+" ");

                }
            }
            
            System.out.println();
        }

        System.out.println();
    }
}