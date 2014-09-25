package ch.klandolt.java.quiz.business;

/**
 * Computes information about a set of data values.
 */
public class DataSet {
	private int sum;
	private int maximum;
	private int count;
	private IMeasurable maximumkandidat;

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
		// Zur Summe hinzufügen
		sum = sum + x;
		// Wenn Grösser als aktuell grösste Zahl
		if (count == 0 || maximum < x) {
			maximum = x;
			maximumkandidat = kandidat;
		}
		//Counter hochzählen
		count++;
	}

	/**
	 * Gets the average of the added data.
	 * 
	 * @return the average or 0 if no data has been added
	 */
	public double getAverage() {
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public void getMaximum() {
		System.out.println("Der Gewinner ist: " + maximumkandidat.getName() + " mit " + maximum + "Punkte");
		
	}
}
