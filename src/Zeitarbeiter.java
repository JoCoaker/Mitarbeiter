/**
 * Zeitarbeiter-Klasse
 *
 * @author Daniel Banciu (198632)
 * @version 1.0.0
 */

public class Zeitarbeiter implements IMitarbeiter, ISteuerZahler {
	private float stundenLohn;
	private int gearbeiteteStunden;
	private float jahresGehaltBisHeute;
	private String nachname;
	private String vorname;

	public Zeitarbeiter(float stundenLohn, String vorname, String nachname) {

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

	@Override
	public float tatsaechlicheEinkommenSteuer() {
		return this.jahresGehaltBisHeute * EINKOMMENSSTEUERSATZ;
	}

	@Override
	public float voraussichtlicheEinkommenSteuer() {
		return stundenLohn * 160 * 12 * EINKOMMENSSTEUERSATZ;
	}

	@Override
	public float getJahresGehaltBisHeute() {
		
		return jahresGehaltBisHeute;
	}

}
