
/**
 * Angestellter
 *
 * @author Peter Tim Oliver Nauroth (198322)
 * @version 1.0.2
 */

public class Angestellter implements IMitarbeiter, ISteuerZahler {

    private float monatsLohn;
    private float ueberStundenTarif;
    private int gearbeiteteUeberstunden;
    private String vorname;
    private String nachname;
    private float jahresGehaltBisHeute = 0;
    private Arbeitsvertrag vertragsArt;


    Angestellter(String vorname, String nachname, float monatsLohn, float ueberStundenTarif) {

        if (monatsLohn / (40 * 4) < MINDEST_LOHN) {
            throw new IllegalArgumentException("Gehalt unter Mindestlohn");
        }
        this.vertragsArt = Arbeitsvertrag.ANGESTELLTER;
        this.vorname = vorname;
        this.nachname = nachname;
        this.monatsLohn = monatsLohn;
        this.ueberStundenTarif = ueberStundenTarif;
        gearbeiteteUeberstunden = 0;
    }

    @Override
    public float entgeltBerechnen() {
        float kvBeitrag = 0.073f;                                            //Angaben in %/100
        float rvBeitrag = 0.0935f;
        float avBeitrag = 0.015f;
        float pvBeitrag = 0.025f;

        float gesamtLohn = (monatsLohn + (gearbeiteteUeberstunden * ueberStundenTarif));
        this.jahresGehaltBisHeute += gesamtLohn;

        return gesamtLohn - (gesamtLohn * (kvBeitrag + rvBeitrag + avBeitrag + pvBeitrag));
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

    @Override
    public float tatsaechlicheEinkommenSteuer() {
        return this.jahresGehaltBisHeute * EINKOMMENSSTEUERSATZ;
    }

    @Override
    public float voraussichtlicheEinkommenSteuer() {
        return this.monatsLohn * 12 * EINKOMMENSSTEUERSATZ;
    }

    @Override
    public float getJahresGehaltBisHeute() {
        return this.jahresGehaltBisHeute;
    }

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname + " Vertragsart: " + this.vertragsArt;
    }


    @Override
    public Arbeitsvertrag getVertragsart() {
        return this.vertragsArt;
    }
}
