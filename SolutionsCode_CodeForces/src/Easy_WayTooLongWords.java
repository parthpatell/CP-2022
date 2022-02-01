import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/71/A
 * Needed to add numbers of characters between first and last later
 * if the word was longer than 10 chars.
 */
public class Easy_WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        StringBuilder edittedWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String word = input.nextLine();
            if(word.length()>10){
                edittedWord.append(word.charAt(0)).append(word.length()-2).append(word.charAt(word.length()-1)).append("\n");
            }
            else{
                edittedWord.append(word).append("\n");
            }

        }
        System.out.print(edittedWord);
    }
}
