package ch.klandolt.java.quiz.business;

/**
 * Computes information about a set of data values.
 */
public class DataSet {
	private int sum;
	private int sumString;
	private int maximum;
	private int maximumString;
	private int count;
	private IMeasurable maximumkandidat;
	private IMeasurable maximumKandidatString;
	

	/**
	 * Constructs an empty data set.
	 */
	public DataSet() {
		sum = 0;
		count = 0;
		maximum = 0;
	}

	/**
	 * Adds a data value to the data set
	 * 
	 * @param x
	 *            a data value
	 */
	public void add(Quiz kandidat) {

		int x = kandidat.getPunkte();
		int xString = kandidat.getName().length();
		
		// Zur Summe hinzufügen
		sum = sum + x;
		sumString = sumString + xString;
		// Wenn Grösser als aktuell grösste Zahl Punkte
		if (count == 0 || maximum < x) {
			maximum = x;
			maximumkandidat = kandidat;
		}
		//Wenn Grösser als aktuell grösste Länge String
		if (count == 0 || maximumString < xString) {
			maximumString = xString;
			maximumKandidatString = kandidat;
		}
		//Counter hochzählen
		count++;
	}

	/**
	 * Gets the average of the added data.
	 * 
	 * @return the average or 0 if no data has been added
	 */
	public double getAveragePoint() {
		if (count == 0)
			return 0;
		else
			return sum / count;
	}
	
	/**
	 * Gets the average of the added data.
	 * 
	 * @return the average or 0 if no data has been added
	 */
	public double getAverageString() {
		if (count == 0)
			return 0;
		else
			return sumString / count;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public void getMaximumPoint() {
		System.out.println("Der Gewinner ist: " + maximumkandidat.getName() + " mit " + maximum + "Punkte");
		
	}
	
	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public void getMaximumString() {
		System.out.println("Der Gewinner ist: " + maximumKandidatString.getName() + " mit " + maximumString + "Punkte");
		
	}
}
