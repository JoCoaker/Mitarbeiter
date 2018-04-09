/**
 * ATAngestellter-Klasse
 *
 * @author Felix Ruess (199261)
 * @version 1.0.0
 */
public class ATAngestellter extends Mitarbeiter {
	private float monatsLohn;

	public ATAngestellter(float monatsLohn, String vorname, String nachname) {
		super(vorname, nachname);
		this.monatsLohn = monatsLohn;
	}

	public float getMonatsLohn() {
		return monatsLohn;
	}

	public float entgeltBerechnen() {
		this.jahresGehaltBisHeute += monatsLohn - monatsLohn * 0.19325;
		return monatsLohn;
	}
}
