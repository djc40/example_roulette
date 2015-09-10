package roulette;

public class TripleBet extends Bet {
    private static final String[] NULL = null;
    private int myLowInt;
    private int myHighInt;

    public TripleBet (String description, int odds, int lowInt, int highInt) {
        super(description, odds, NULL);
        // TODO Auto-generated constructor stub
        myLowInt = lowInt;
        myHighInt = highInt; 

    }

}
