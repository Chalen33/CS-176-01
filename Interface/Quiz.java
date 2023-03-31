package Interface;

public class Quiz  implements Measurable {

	private double score;

	public Quiz(int score) 
	{
		this.score = score;
	}

	public double getMeasure()
	{
		return score;
	}

	}

