package P9;

import java.util.*;

public class TicTacToeWithComputer {
    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            Arrays.fill(board[i], ' ');

        Scanner input = new Scanner(System.in);
        boolean playerTurn = true;

        while (true) {
            printBoard();

            if (playerTurn) {
                System.out.println("Player's turn");
                System.out.print("Enter a row (0,1 or 2): ");
                int row = input.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                int col = input.nextInt();

                if (board[row][col] == ' ') {
                    board[row][col] = 'X';
                    if (checkWin('X')) {
                        printBoard();
                        System.out.println("Game ended, Player Win");
                        break;
                    }
                    playerTurn = false;
                } else {
                    System.out.println("Cell already taken, try again!");
                }

            } else {
                System.out.println("Computer's turn");
                Random rand = new Random();
                int row, col;
                do {
                    row = rand.nextInt(3);
                    col = rand.nextInt(3);
                } while (board[row][col] != ' ');
                board[row][col] = 'O';

                if (checkWin('O')) {
                    printBoard();
                    System.out.println("Game ended, CPU Win");
                    break;
                }
                playerTurn = true;
            }

            if (isFull()) {
                printBoard();
                System.out.println("Game ended, Draw");
                break;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
            if (i < 2)
                System.out.println("---------");
        }
        System.out.println();
    }

    static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++)
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;
        for (int j = 0; j < 3; j++)
            if (board[0][j] == symbol && board[1][j] == symbol && board[2][j] == symbol)
                return true;
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;
        return false;
    }

    static boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ')
                    return false;
        return true;
    }
}
