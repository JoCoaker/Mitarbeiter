
/**
 * Mitarbeiter
 *
 * @author Lukas Reichert (199034)
 * @version 1.0.0
 */
public abstract class Mitarbeiter {

    // Klassen Variablen
    protected String vorname;
    protected String nachname;
    protected float jahresGehaltBisHeute = 0;

    /**
     * Konstruktor
     *
     * @param vorname {String}
     * @param nachname {String}
     */
    Mitarbeiter(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    /**
     * Berechnet das Entgelt für den Mitarbeiter.
     *
     * @return entgelt {float}
     */
    public abstract float entgeltBerechnen();

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname;
    }

    /**
     * Getter
     */
    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public float getJahresGehaltBisHeute() {
        return this.jahresGehaltBisHeute;
    }
}