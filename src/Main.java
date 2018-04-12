import java.text.DecimalFormat;

/**
 * Main
 *
 * @author Lukas Reichert (199034)
 * @version 2.0.0
 */
public class Main {

    /**
     * Main Methode um Mitarbeiter anzulegen und auszuprobieren.
     *
     * @param args {String[]}
     */
    public static void main(String[] args) {
        ISteuerZahler[] steuerZahler = new ISteuerZahler[] {new Zeitarbeiter(16.5f, "Lukas", "Reichert"), new Angestellter("Felix", "Ruess", 4250f, 21.33f), new ATAngestellter(4200f, "Daniel", "Banciu")};

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        for (ISteuerZahler sz :
                steuerZahler) {
            System.out.println(sz + " Tatsächliche Einkommenssteuer: " + df.format(sz.tatsaechlicheEinkommenSteuer()) + "€");
            System.out.println(sz + " Vorraussichtliche Einkommenssteuer: " + df.format(sz.voraussichtlicheEinkommenSteuer()) + "€");
        }

    }

}
