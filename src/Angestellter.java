
/**
 * Angestellter
 *
 * @author Peter Tim Oliver Nauroth (198322)
 * @version 1.0.0
 */

public class Angestellter extends Mitarbeiter {
	
	private float monatsLohn;
	private float ueberStundenTarif;
	private int gearbeiteteUeberstunden;
	

	Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif) {
		super(vorname, nachname);
		this.monatsLohn = monatsLohn;
		this.ueberStundenTarif = ueberStundenTarif;
		gearbeiteteUeberstunden = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float entgeltBerechnen() { 
		float kvBeitrag = 0.073f;											//Angaben in %/100
		float rvBeitrag = 0.0935f;
		float avBeitrag = 0.015f;
		float pvBeitrag = 0.025f;
		
		float gesamtLohn = (monatsLohn + (gearbeiteteUeberstunden * ueberStundenTarif));
		this.jahresGehaltBisHeute += gesamtLohn;
		
		return gesamtLohn - (gesamtLohn * (kvBeitrag+rvBeitrag+avBeitrag+pvBeitrag));
	}
	
	
	
    /**
     * Getter & Setter
     */
	
	
	public int getGearbeiteteUeberstunden() {
		return gearbeiteteUeberstunden;
	}

	public void setGearbeiteteUeberstunden(int gearbeiteteUeberstunden) {
		this.gearbeiteteUeberstunden = gearbeiteteUeberstunden;
	}

	public float getMonatsLohn() {
		return monatsLohn;
	}

	public float getUeberStundenTarif() {
		return ueberStundenTarif;
	}

}
