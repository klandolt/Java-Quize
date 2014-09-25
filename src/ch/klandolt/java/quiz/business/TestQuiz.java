package ch.klandolt.java.quiz.business;

public class TestQuiz {

	public static void main(String[] args) {
		
		//DataSet inizialisieren:
		DataSet meinDatenset = new DataSet();
		
		//Quiz Erstellen und zum Datenset laden
		
		Quiz Quiz1 = new Quiz("Max", 2);
		meinDatenset.add(Quiz1);
		Quiz Quiz2 = new Quiz("Johannes", 1);
		meinDatenset.add(Quiz2);
		Quiz Quiz3 = new Quiz("Flavio", 7);
		meinDatenset.add(Quiz3);
		Quiz Quiz4 = new Quiz("Hugo", 8);
		meinDatenset.add(Quiz4);
		Quiz Quiz5 = new Quiz("Lars", 3);
		meinDatenset.add(Quiz5);
		Quiz Quiz6 = new Quiz("Boris", 1);
		meinDatenset.add(Quiz6);
		Quiz Quiz7 = new Quiz("Philippe", 3);
		meinDatenset.add(Quiz7);
		Quiz Quiz8 = new Quiz("Kevin", 10);
		meinDatenset.add(Quiz8);
		Quiz Quiz9 = new Quiz("Timo", 5);
		meinDatenset.add(Quiz9);
		Quiz Quiz10 = new Quiz("Elia", 9);
		meinDatenset.add(Quiz10);
		
	
		
		
		System.out.println("Durschnitspunkte: " + meinDatenset.getAverage());
		
		meinDatenset.getMaximum();
		
		
		
		
		

	}

}
