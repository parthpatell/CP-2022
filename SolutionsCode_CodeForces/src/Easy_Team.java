import java.util.Scanner;

public class Easy_Team {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int tally = 0;
        int a,b,c;
        String line;
        String[] lineSplit;
        for(int i = 0; i < n; i++){
            line = input.nextLine();
            lineSplit = line.split(" ");
            a = Integer.parseInt(lineSplit[0]);
            b = Integer.parseInt(lineSplit[1]);
            c = Integer.parseInt(lineSplit[2]);
            if((a+b+c) >= 2){
                tally++;
            }


        }
        System.out.println(tally);
    }
}
