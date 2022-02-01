import java.util.Scanner;
/*
https://codeforces.com/problemset/problem/4/A
Problem 4A
Needed to find if you can get an even number of weight for the divided parts.
 */

public class Easy_Watermelon4a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int weightInKilo = input.nextInt();
        if(weightInKilo %2 ==0 && weightInKilo != 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        System.out.println();
    }
}
