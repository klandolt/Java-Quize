package ch.klandolt.java.quiz.business;

public class Quiz implements IMeasurable {
	private int Points;
	private String Name;
	
	public Quiz(String Name, int Points) {
		
		this.Points = Points;
		this.Name = Name;
		
	}
	

	@Override
	public int getPunkte() {
		
		return Points;
	}

	@Override
	public String getName() {
		
		return Name;
	}

}
