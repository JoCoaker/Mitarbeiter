/**
 * Zeitarbeiter-Klasse
 *
 * @author Daniel Banciu (198632)
 * @version 1.0.0
 */

public class Zeitarbeiter extends Mitarbeiter {
	private float stundenLohn;
	private int gearbeiteteStunden;

	public Zeitarbeiter(float stundenLohn, String vorname, String nachname) {
		super(vorname, nachname);
		this.stundenLohn = stundenLohn;

	}

	public float getStundenLohn() {
		return stundenLohn;
	}

	public int getGearbeiteteStunden() {
		return gearbeiteteStunden;
	}

	public void setGearbeiteteStunden(int gearbeiteteStunden) {
		this.gearbeiteteStunden = gearbeiteteStunden;
	}

	public float entgeltBerechnen() {

		this.jahresGehaltBisHeute += (gearbeiteteStunden * stundenLohn);
		return (float) (gearbeiteteStunden * stundenLohn - (gearbeiteteStunden * stundenLohn) * 0.19325);

	}

}
