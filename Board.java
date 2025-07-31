public class Board
{
    private String b1 = "1";
    private String b2 = "2";
    private String b3 = "3";
    private String b4 = "4";
    private String b5 = "5";
    private String b6 = "6";
    private String b7 = "7";
    private String b8 = "8";
    private String b9 = "9";
    
    boolean end = false;
    
    /**
     * Prints the Tic Tac Toe board
     */
    public void printBoard()
    {
        System.out.println("     |     |     ");
        System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3 + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + b4 + "  |  " + b5 + "  |  " + b6 + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + b7 + "  |  " + b8 + "  |  " + b9 + "  ");
        System.out.println("     |     |     ");
    }
    
    /**
     * Gets the value of a position on the board
     * @param num the position on the board
     * @return the value of the position
     */
    public String getPosition(int num)
    {
        if(num == 1)
        {
            return b1;
        }
        if(num == 2)
        {
            return b2;
        }
        if(num == 3)
        {
            return b3;
        }
        if(num == 4)
        {
            return b4;
        }
        if(num == 5)
        {
            return b5;
        }
        if(num == 6)
        {
            return b6;
        }
        if(num == 7)
        {
            return b7;
        }
        if(num == 8)
        {
            return b8;
        }
        return b9;
    }
    
    /**
     * Checks if a position has not yet been marked by a symbol
     * @param num the position on the board
     * @return true if the position is not marked by a symbol
     * @return false if the position is marked by a symbol
     */
    public boolean checkPosition(int num)
    {
        if(num == 1)
        {
            if (b1.equals("1"))
            {
                return true;
            }
        }
        if(num == 2)
        {
            if (b2.equals("2"))
            {
                return true;
            }
        }
        if(num == 3)
        {
            if (b3.equals("3"))
            {
                return true;
            }
        }
        if(num == 4)
        {
            if (b4.equals("4"))
            {
                return true;
            }
        }
        if(num == 5)
        {
            if (b5.equals("5"))
            {
                return true;
            }
        }
        if(num == 6)
        {
            if (b6.equals("6"))
            {
                return true;
            }
        }
        if(num == 7)
        {
            if (b7.equals("7"))
            {
                return true;
            }
        }
        if(num == 8)
        {
            if (b8.equals("8"))
            {
                return true;
            }
        }
        if(num == 9)
        {
            if (b9.equals("9"))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Replaces the value of a position with a symbol
     * @param num the position on the board
     * @param symbol the symbol 
     */
    public void placeSymbol(int num, String symbol)
    {
        if(num == 1)
        {
            b1 = symbol;
        }
        if(num == 2)
        {
            b2 = symbol;
        }
        if(num == 3)
        {
            b3 = symbol;
        }
        if(num == 4)
        {
            b4 = symbol;
        }
        if(num == 5)
        {
            b5 = symbol;
        }
        if(num == 6)
        {
            b6 = symbol;
        }
        if(num == 7)
        {
            b7 = symbol;
        }
        if(num == 8)
        {
            b8 = symbol;
        }
        if(num == 9)
        {
            b9 = symbol;
        }
    }
    
    /**
     * Ends the game
     */
    public void endGame()
    {
        end = true;
    }
    
    /**
     * Checks if the game has ended
     * @return if game has ended
     */
    public boolean gameEnd()
    {
        return end;
    }
}