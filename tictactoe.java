// Tic Tac Toe Game
import java.util.Scanner;

public class tictactoe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };//declares the table the global variable 

    static Scanner sc = new Scanner(System.in);//global scanner
//function to printboard 
    static void printBoard() {
        System.out.println("\nBoard:");
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
    }
//function to select the position 
    static void selection(char symbol) {
        int row, col;
//infinite loop used because to give another chance over invalid input
        while (true) {
            System.out.print("Enter row (0-2): ");
            row = sc.nextInt();//taking input row
            System.out.print("Enter column (0-2): ");
            col = sc.nextInt();//taking input column
//checking for validity of the position 
            if (row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;//breaks the loop if correct input is given 
            } 
            //another chance for wrong input
            else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }
//checking for the win
    static boolean win(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s)//checking for row similarity 
                return true;

            if (board[0][i] == s && board[1][i] == s && board[2][i] == s)//checking column similarity
                return true;
        }
//checking diagonal similarity
        if (board[0][0] == s && board[1][1] == s && board[2][2] == s)
            return true;

        else if (board[0][2] == s && board[1][1] == s && board[2][0] == s)
            return true;
        return false;//if none of them satisfies goes to next chance 
    }

    //main code
    public static void main(String[] args) {

        System.out.println("Hello! This is a two-player Tic-Tac-Toe game");
        System.out.print("Press 1 to start or 0 to exit: ");
        int choice = sc.nextInt();//taking choice from the users

        if (choice == 0) {
            System.out.println("Game exited.");
            return;//exited from the code
        }

        sc.nextLine();

        System.out.print("Enter Player 1 name (X): ");
        String name1 = sc.nextLine();//name of player1

        System.out.print("Enter Player 2 name (O): ");
        String name2 = sc.nextLine();//name of player2

        boolean isGame = true;//tells that still the game is on
        int turn = 0;// calculate the number of turns 

        while (isGame && turn < 9) {
            printBoard();//prints the board

            if (turn % 2 == 0) {                        //allows the player 1 to choose input
                System.out.println(name1 + "'s turn (X)");
                selection('X');
                if (win('X')) {                        //checking of win for player 1
                    printBoard();
                    System.out.println(name1 + " won the game 🎉");
                    break;
                }
            } else {                                   //allows the player 2 to choose input
                System.out.println(name2 + "'s turn (O)");
                selection('O');
                if (win('O')) {                       //checking of win for player 2
                    printBoard();
                    System.out.println(name2 + " won the game 🎉");
                    break;
                }
            }
            turn++;
        }

        if (turn == 9) {            //dosen't allow more than 9 turns 
            printBoard();
            System.out.println("It's a draw!");
        }

        System.out.println("Game Over!");
    }
}
