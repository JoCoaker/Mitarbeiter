import java.text.DecimalFormat;

/**
 * Main
 *
 * @author Lukas Reichert (199034)
 * @version 2.0.0
 */
public class Main {

    /**
     * Main Methode um Mitarbeiter anzulegen und ausgeben verschiede Werten.
     *
     * @param args {String[]}
     */
    public static void main(String[] args) {
        // Mitarbeiter erstellen
        ISteuerZahler[] steuerZahler = new ISteuerZahler[] {new Zeitarbeiter(16.5f, "Lukas", "Reichert"), new Angestellter("Felix", "Ruess", 4250f, 21.33f), new ATAngestellter(4200f, "Daniel", "Banciu")};

        // Arbeitsstunden setzten
        ((Zeitarbeiter)steuerZahler[0]).setGearbeiteteStunden(45);
        ((Angestellter)steuerZahler[1]).setGearbeiteteUeberstunden(1);

        // Entgelt für den ersten Monat berechnen
        for (ISteuerZahler sz :
                steuerZahler) {
            ((IMitarbeiter)sz).entgeltBerechnen();
        }

        DecimalFormat df = new DecimalFormat("#.00");

        /*
         * Tatsächliche Einkommenssteuer und Vorraussichtliche Einkommenssteuer ausgeben.
         */
        for (ISteuerZahler sz :
                steuerZahler) {
            System.out.println(sz + " Tatsaechliche Einkommenssteuer: " + df.format(sz.tatsaechlicheEinkommenSteuer()) + "€");
            System.out.println(sz + " Vorraussichtliche Einkommenssteuer: " + df.format(sz.voraussichtlicheEinkommenSteuer()) + "€");
            System.out.println();
        }

    }

}
