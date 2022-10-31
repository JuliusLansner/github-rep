public class ComputerGuesserRandom implements IGuesser
{
	private int min;
	private int max;

	public void yourTurn() {}

	public String getName()
	{
		return "Computer guesser";
	}

	public void newGame(int min, int max, String opponent, String type)
	{
		this.min = min;
		this.max = max;
	}

	public int makeGuess()
	{
		//random generator, min value is inclusive while max value is exclusive
		return (int) (Math.random()*(max-min+1)+min);
		//return (min + max) / 2;
		//

	}

	public void guessFeedback(Answer answer)
	{
		switch(answer)
		{
			case TOO_LOW:
				min = ((min + max) / 2) + 1;
				break;
			case TOO_HIGH:
				max = ((min + max) / 2) -1;
				break;
			case CORRECT:
				break;
			default:
				throw new RuntimeException("This should never happen!");
		}
	}

	public boolean endOfGame(int numberOfGuesses, String opponent)
	{
		return true;
	}

}
