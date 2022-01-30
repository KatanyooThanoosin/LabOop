import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = in.nextInt();
        int computer = (int)(Math.random()*3);
        String[] a= {"scissor","rock","paper"};
        if(player > computer){
            if(player == 2&&computer==0)System.out.println("The computer is "+a[computer]+". You are "+a[player]+". You lose");
            else System.out.println("The computer is "+a[computer]+". You are "+a[player]+". You won");
        }
        else if(player == computer)System.out.println("The computer is "+a[computer]+". You are "+a[player]+" too. It is a draw");
        else{
            if(computer == 2&&player==0)System.out.println("The computer is "+a[computer]+". You are "+a[player]+". You won");
            else System.out.println("The computer is "+a[computer]+". You are "+a[player]+". You lose");
        }
        in.close();
    }
}
