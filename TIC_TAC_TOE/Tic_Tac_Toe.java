import java.util.Arrays;
import java.util.Scanner;
public class Tic_Tac_Toe{
    static String[] board;
    static String turn;

     static String checkWinner(){
        for(int a=0;a<9;a++){
            String line=null;
            switch(a){
                case 0:
                    line=board[0]+board[1]+board[2];
                    break;
                case 1:
                    line =board[3]+board[4]+board[5];
                    break;
                case 2:
                    line=board[6]+board[7]+board[8];
                    break;
                case 3:
                    line=board[0]+board[3]+board[6];
                    break;
                case 4:
                    line=board[1]+board[4]+board[7];
                    break;
                case 5:
                    line=board[2]+board[5]+board[8];
                case 6:
                    line=board[6]+board[4]+board[8];
                    break;
                case 7:
                    line=board[2]+board[4]+board[6];
                    break;

        }
        if(line.equals("XXX")){
            return "X";
        }
        else if(line.equals("000")){
            return "0";
        }
        }
        for(int a=0;a<9;a++){
            if(Arrays.asList(board).contains(String.valueOf(a+1))){
                break;
            
            }
            else if(a==8){
                return "draw";

            }
        }
        System.out.println(turn+" ' turn; enter a slot number to place"+turn+"in: ");
        return null;
     }
     static void printBoard(){
        System.out.println("|---|---|---|");
        System.out.println("|"+board[0]+"|"+board[1]+"|"+board[2]);
        System.out.println("|"+board[3]+"|"+board[4]+"|"+board[5]);
        System.out.println("|"+board[6]+"|"+board[7]+"|"+board[8]);
        System.out.println("|---|---|---");
        
     }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        board=new String[9];
        turn="X";
        String winner=null;
        for(int a=0;a<9;a++){
            board[a]=String.valueOf(a+1);
        }
        System.out.println("Welcome to 3*3 Tic Tac Toe");
        printBoard();
        System.out.println("X will play first.Enter a slot number to place X in:");
        while(winner==null){
            int numInput;
            try{
                numInput=in.nextInput();
                //chek range
                if(!(numInput>0 && numInput<=9)){
                    System.out.println("Invalid input;re enter slot number:");
                    continue;
                }
                //check if slot is available
                if(board[numInput-1].equals(String.valueOf(numInput)))
                {
                    board[numInput-1]=turn;
                    turn =turn.equals("X")? "O":"X";
                    printBoard();
                    winner=checkWinner();
                }
                else{
                    System.out.println("Slot already taken ; reneter slot number");

                }


            }
            catch(InputMisMatch Exception e){
                System.out.println("Slot already taken; renter slot number");
                in.nextLine();

            }
        }
        if(Winner.equalsIgnoreCase("draw")){
            System.out.println("Its a draw! Thanks for playing");
        }
        else{
            System.out.println("Congratulations!"+winner+" ' s have won! Thanks for playing");
        }
        in.close();


     }



}