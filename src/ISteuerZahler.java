/**
 * ISteuerZahler
 *
 * @author Lukas Reichert (199034)
 * @version 1.0.0
 */
public interface ISteuerZahler {
    // Konstanten
    float EINKOMMENSSTEUERSATZ = 0.36f;

    /**
     * Berechnet die Tatsächliche Einkommen Steuer.
     *
     * @return {float}
     */
    float tatsaechlicheEinkommenSteuer();

    /**
     * Berechnet das voraussichtliche Einkommen Steuer.
     *
     * @return {float}
     */
    float voraussichtlicheEinkommenSteuer();
}
