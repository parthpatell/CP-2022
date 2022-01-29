import java.util.Scanner;

public class Watermelon4a {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int weightInKilo = input.nextInt();
        if(weightInKilo %2 ==0 && weightInKilo != 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
