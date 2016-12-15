import cs1.Keyboard;

public class GuessNumber{
    private int randNum;
    private int high;
    private int low;
    private int tracker;

    public GuessNumber{
	randNum = (int) 101 * Math.random();
	high = 100;
	low = 1;
	tracker = 0;
    }

    public String check(int guess) {
	if (guess > randNum)
	    return "Too High, ";
	else if (guess < randNum)
	    return "Too Low, guess again";
	else
	    return "You Win!"
    }
    
    
