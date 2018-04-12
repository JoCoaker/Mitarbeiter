/**
 * IMitarbeiter
 *
 * @author Lukas Reichert (199034)
 * @version 1.0.0
 */
public interface IMitarbeiter {

    // Konstanten
    float MINDEST_LOHN = 8.84f;

    /**
     * Berechnet das Entgelt.
     *
     * @return {float}
     */
    float entgeltBerechnen();

    /**
     * Returned das Jahres Gehalt bis heute.
     *
     * @return {float}
     */
    float getJahresGehaltBisHeute();

    /**
     * Gibt die Vertragsart zurück.
     *
     * @return {Arbeitsvertrag}
     */
    Arbeitsvertrag getVertragsart();
}
