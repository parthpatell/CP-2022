import java.util.Scanner;

public class Easy_NextRound {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] playerScores = new int[n + 1];
        int validScores = 0;
        for(int i = 0; i < n; i++) {
            playerScores[i] = input.nextInt();
            if(playerScores[i] >= playerScores[k-1] && playerScores[i] > 0) {
                validScores++;
            }
        }
        System.out.println(validScores);

        }

    }


