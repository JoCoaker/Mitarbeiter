/**
 * ATAngestellter-Klasse
 *
 * @author Felix Ruess (199261)
 * @version 1.0.0
 */
public class ATAngestellter implements IMitarbeiter, ISteuerZahler {
	private float monatsLohn;
	private float jahresGehaltBisHeute;
	private String nachname;
	private String vorname;
	private Arbeitsvertrag vertragsart;
	

	public ATAngestellter(float monatsLohn, String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.vertragsart = Arbeitsvertrag.AT_ANGESTELLTER;
		
		this.monatsLohn = monatsLohn;
		
		if(monatsLohn <= MINDEST_LOHN * 160) {
			System.out.println("Lohn unter Mindestlohn! ");
		}
	}

	public float getMonatsLohn() {
		return monatsLohn;
	}

	public float entgeltBerechnen() {
		this.jahresGehaltBisHeute += monatsLohn - monatsLohn * 0.19325;
		return monatsLohn;
	}

	@Override
	public Arbeitsvertrag getVertragsart() {
		return vertragsart;
	}

	public float getJahresGehaltBisHeute() {
		
		return jahresGehaltBisHeute;
	}

	@Override
	public float tatsaechlicheEinkommenSteuer() {
		return this.jahresGehaltBisHeute*EINKOMMENSSTEUERSATZ;
	}

	@Override
	public float voraussichtlicheEinkommenSteuer() {
		return this.monatsLohn*12*EINKOMMENSSTEUERSATZ;
	}

	@Override
    public String toString() {
        return this.vorname + " " + this.nachname + " Vertragsart: " + this.vertragsart;
    }
}
