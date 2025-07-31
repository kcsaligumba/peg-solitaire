import java.util.Scanner;

public class Viewer
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Tic Tac Toe!");
        
        Scanner in = new Scanner(System.in);
        
        //Player 1 symbol choice
        System.out.print("Player 1, choose your symbol: ");
        String symbol1 = in.nextLine();
        Player player1 = new Player();
        player1.setSymbol(symbol1);
        
        //Player 2 symbol choice
        System.out.print("Player 2, choose your symbol: ");
        String symbol2 = in.nextLine();
        Player player2 = new Player();
        player2.setSymbol(symbol2);
        
        Board board = new Board();
        Rules rules = new Rules();
        
        //Prevents Player 1 and Player 2 from having the same symbol
        
        if (symbol1.equals("1") || symbol1.equals("2") || symbol1.equals("3") || symbol1.equals("4") || symbol1.equals("5") || symbol1.equals("6") || symbol1.equals("7")|| symbol1.equals("8")|| symbol1.equals("9")|| symbol2.equals("1")|| symbol2.equals("2")|| symbol2.equals("3")|| symbol2.equals("4")|| symbol2.equals("5")|| symbol2.equals("6")|| symbol2.equals("7")|| symbol2.equals("8")|| symbol2.equals("9"))
        {
            board.endGame();
            System.out.println("Error the symbol cannot be a number 1-9.");
        }
        else if (symbol1.equals(symbol2))
        {
            board.endGame();
            System.out.println("Error: Cannot use the same symbol.");
        }
        else
        {
            board.printBoard();
        }
        
        int i = 1;
        while (!board.gameEnd())
        {
            //Player 1's turn
            if (i % 2 == 1)
            {
                System.out.print("Player 1, choose your position: ");
                int pos1 = in.nextInt();
                if (board.checkPosition(pos1))
                {
                    board.placeSymbol(pos1, symbol1);
                    board.printBoard();
                    i++;
                }
            }
                
            //Checks winner
            if (rules.checkWinner(board.getPosition(1), board.getPosition(2), board.getPosition(3), board.getPosition(4), board.getPosition(5), board.getPosition(6), board.getPosition(7), board.getPosition(8), board.getPosition(9)))
            {
                board.endGame();
                System.out.println("Player 1 wins!");
                break;
            }
                
            //Checks tie
            if (rules.checkTie(board.getPosition(1), board.getPosition(2), board.getPosition(3), board.getPosition(4), board.getPosition(5), board.getPosition(6), board.getPosition(7), board.getPosition(8), board.getPosition(9)))
            {
                board.endGame();
                System.out.println("Tie!");
                break;
            }
                
            //Player 2's turn
            if (i % 2 == 0)
            {
                System.out.print("Player 2, choose your position: ");
                int pos2 = in.nextInt();
                if (board.checkPosition(pos2))
                {
                    board.placeSymbol(pos2, symbol2);
                    board.printBoard();
                    i++;
                }
            }
                    
            //Checks winner
            if (rules.checkWinner(board.getPosition(1), board.getPosition(2), board.getPosition(3), board.getPosition(4), board.getPosition(5), board.getPosition(6), board.getPosition(7), board.getPosition(8), board.getPosition(9)))
            {
                board.endGame();
                System.out.println("Player 2 wins!");
                break;
            }
                
            //Checks tie
            if (rules.checkTie(board.getPosition(1), board.getPosition(2), board.getPosition(3), board.getPosition(4), board.getPosition(5), board.getPosition(6), board.getPosition(7), board.getPosition(8), board.getPosition(9)))
            {
                board.endGame();
                System.out.println("Tie!");
                break;
            }
        }
    }
}