package PatternStyle;

import java.util.Arrays;
import java.util.Scanner;

public class StarPattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Please Enter The Number of Rows : ");
        for(int i =  1; i<= rows ; i++){
            for(int j = 1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
