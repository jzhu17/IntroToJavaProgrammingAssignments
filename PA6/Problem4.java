/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 13 November 2016
 * PA 6 - This program allows users to play the game of Tic-Tac-Toe.
 * Bugs: none
 */

import java.util.*;

public class Problem4 {
  public static final int SIZE=3;

  public static void main (String[] args) {
    System.out.println();
    System.out.println("Welcome to Julia's Tic-Tac-Toe game! :)");
    System.out.println();
    Scanner console=new Scanner(System.in);
    char[][] board = new char[SIZE][SIZE]; //creates a 2-D array with 9 values
    ticTacToe(console, board);
    System.out.println("Thanks for playing! Have a good one:)");
  }

  public static void ticTacToe(Scanner console, char [][] board) {
    int again=0; //sets the base value of playing again to be 0
    while (again==0) { //executes the game
      emptyBoard(board); //empties the board
      int lives=9; //sets base value of number of empty cells to be 9
      int over=1; //sets base value of the number that decides whether the game is over to be 0
      int won=2; //sets base value of the number that reprsents the person who won the game to be 2
      System.out.print("You will be the 'o' and the computer will be the 'x'. ");
      System.out.println();
      System.out.print("Do you want to go first? (Enter 0 to go first; enter 1 to let computer go first.)");
      int first =console.nextInt();
      if (first==0) { //user goes first
        user(board, console);
      } else {  //computer goes first
        comp(board);
      }
      lives--; //minuses 1 from number of empty cells
      while (over !=0 && lives !=0) { //the condition that no one won and there are empty cells left
        over=check(board); //checks if someone won the game
        if (over==0) { //someone won the game
          won=first; //the person who won was the last person who made the move
        } else {  //no one won the game
          first=(first+1)%2; //rotates between user and computer
          if (first==1) {
            comp(board);
          } else {
            user(board, console);
          }
        }
        lives--;
      }
      printBoard(board);
      System.out.println();
      if (won==0) { //user won the game
        System.out.println("Congratulations! You won!");
      } else if (won==1){ //computer won the game
        System.out.println("Sorry! You lost! ");
      } else { //no one won the game
        System.out.println("It's a tie.");
      }
      System.out.println();
      System.out.print("Do you want to play again? (Enter 0 to play again; enter 1 to quit.)");
      again=console.nextInt(); //updates the integer to determine whether to play again
      System.out.println();
    }
  }

  public static void emptyBoard (char [][] board) { //empties the board
    for (int i=0; i< SIZE; i++) {
      for (int j=0; j< SIZE; j++) {
        board[i][j]=' ';
      }
    }
  }

  public static void printBoard(char[][] board){ //prints the board
    for (int i=0; i<SIZE; i++) {
      for (int j=0; j<SIZE; j++) {
        System.out.print(" "+board[i][j]+" ");
        if (j != 2) {
          System.out.print("|");
        }
      }
      if (i !=2) {
      System.out.println("\n-----------");
      }
    }
  }

  public static void comp(char[][] board) { //computer goes
    for (int i = 0; i < SIZE; i++) { //counts the numbers in the array
      if (board[i][0]=='o'&& board[i][1]=='o'&& board[i][2]==' ' ){
        board[i][2]='x';
        return;
      }
      if (board[i][1]=='o'&& board[i][2]=='o'&& board[i][0]==' '){
        board[i][0]='x';
        return;
      }
      if (board[i][0]=='o'&& board[i][2]=='o'&& board[i][1]==' '){
        board[i][1]='x';
        return;
      }
      //above are conditions of winning with a horizontal roll
      if (board[0][i]=='o'&& board[1][i]=='o'&& board[2][i]==' '){
        board[2][i]='x';
        return;
      }
      if (board[1][i]=='o'&& board[2][i]=='o'&& board[0][i]==' '){
        board[0][i]='x';
        return;
      }
      if (board[2][i]=='o'&& board[0][i]=='o'&& board[1][i]==' '){
        board[1][i]='x';
        return;
      }
      //above are conditions of winning with a vertical roll
    }
    if (board[1][1]=='o') {
      if (board[0][0]=='o' & board[2][2]==' ') {
        board[2][2]='x';
        return;
      }
      if (board[2][2]=='o' & board[0][0]==' ') {
        board[0][0]='x';
        return;
      }
      if (board[0][2]=='o' & board[2][0]==' ') {
        board[2][0]='x';
        return;
      }
      if (board[2][0]=='o' & board[0][2]==' ') {
        board[0][2]='x';
        return;
      }
    }
    //above are conditions of winning with a diagonal roll when (1,1) is filled
    if (board[0][0]=='o' && board[2][2]=='o' && board[1][1]==' '||board[0][2]=='o' && board[2][0]=='o'&& board[1][1]==' ') {
      board[1][1]='x';
      return;
    }
    //above are conditions of winning with a diagonal roll when (1,1) is not filled
    for (int i=0; i<SIZE;i++) { //if above didn't happen, the code goes through the array and fills the first empty cell
      for (int j=0; j<SIZE;j++) {
        if (board[i][j]==' ') {
          board[i][j]='x';
          return;
        }
      }
    }
    printBoard(board);
  }

  public static void user(char[][] board, Scanner console) { //user goes
    printBoard(board);
    System.out.println("\nEnter the number of row(0-2): ");
    int rowNumber = console.nextInt();
    System.out.println("Enter the number of column(0-2): ");
    int columnNumber= console.nextInt();
    while (board[rowNumber][columnNumber] != ' ') { //condition that the cell is not empty
      System.out.print("Invalid numbers. Please enter the number of row(0-2) of an empty cell: ");
      rowNumber = console.nextInt();
      System.out.println("Please enter the number of column(0-2) of an empty cell: ");
      columnNumber= console.nextInt();
    }
    board[rowNumber][columnNumber]='o'; //fills the user's pick with 'o'
  }

  public static int check(char[][] board) { //check if anyone won the game
    for (int i=0; i<SIZE; i++) { //checks all the horizontal rolls
      int j=0;
      if (board[i][j] !=' '&& board[i][j]==board[i][j+1]&& board[i][j+1]==board[i][j+2]) {
        return 0;
      }
    }
    for (int i=0; i<SIZE; i++) { //checks all the vertical rolls
      int j=0;
      if (board[j][i] !=' '&& board[j][i]==board[j+1][i]&& board[j+1][i]==board[j+2][i]) {
        return 0;
      }
    }
    if (board[0][0] !=' '&& board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
      //checks 1 of the 2 diagonal rolls
      return 0;
    }
    if (board[0][2] !=' '&&board[0][2]==board[1][1] && board[1][1]==board[2][0]) {
      //checks 1 of the 2 diagonal rolls
      return 0;
    }
    return 1; //if all the above didn't happen, return 1 and the game continues
  }
}
