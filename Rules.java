public class Rules
{
    /**
     * Checks for winner
     * @param b1 the value of position 1
     * @param b2 the value of position 2
     * @param b3 the value of position 3
     * @param b4 the value of position 4
     * @param b5 the value of position 5
     * @param b6 the value of position 6
     * @param b7 the value of position 7
     * @param b8 the value of position 8
     * @param b9 the value of position 9
     * @return true if winner is found
     * @return false if no winner is found
     */
    public boolean checkWinner(String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8, String b9)
    {
        if (b1.equals(b2) && b2.equals(b3))
        {
            return true;
        }
        if (b4.equals(b5)&&b5.equals(b6))
        {
             return true;
        }
        if (b7.equals(b8)&&b8.equals(b9))
        {
             return true;
        }
        if (b1.equals(b4) && b4.equals(b7))
        {
            return true;
        }
        if (b2.equals(b5) && b5.equals(b8))
        {
            return true;
        }
        if (b3.equals(b6) && b6.equals(b9))
        {
            return true;
        }
        if (b3.equals(b5) && b5.equals(b7))
        {
            return true;
        }
        if (b1.equals(b5) && b5.equals(b9))
        {
            return true;
        }
        return false;
    }
    
    /**
     * Checks for tie
     * @param b1 the value of position 1
     * @param b2 the value of position 2
     * @param b3 the value of position 3
     * @param b4 the value of position 4
     * @param b5 the value of position 5
     * @param b6 the value of position 6
     * @param b7 the value of position 7
     * @param b8 the value of position 8
     * @param b9 the value of position 9
     * @return true if tie is found
     * @return false if no tie is found
     */
    public boolean checkTie(String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8, String b9)
    {
        if(!b1.equals("1") && !b2.equals("2") && !b3.equals("3") && !b4.equals("4") && !b5.equals("5") && !b6.equals("6") && !b7.equals("7") && !b8.equals("8") && !b9.equals("9"))
        {
            return true;
        }
        return false;
    }
}