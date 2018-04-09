import java.text.DecimalFormat;

/**
 * Main
 */
public class Main {

    /**
     * Main Methode um Mitarbeiter anzulegen und auszuprobieren.
     *
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Zeitarbeiter zeitarbeiter = new Zeitarbeiter(16.5f, "Lukas", "Reichert");
        Angestellter angestellter = new Angestellter("Felix", "Ruess", 4250f, 21.33f);
        ATAngestellter aTAngestellter = new ATAngestellter(4200f, "Daniel", "Banciu");

        zeitarbeiter.setGearbeiteteStunden(120);
        angestellter.setGearbeiteteUeberstunden(2);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println(zeitarbeiter + " hat diesen Monat " + df.format(zeitarbeiter.entgeltBerechnen()) + "€ verdient.");
        System.out.println(angestellter + " hat diesen Monat " + df.format(angestellter.entgeltBerechnen()) + "€ verdient.");
        System.out.println(aTAngestellter + " hat diesen Monat " + df.format(aTAngestellter.entgeltBerechnen()) + "€ verdient.");
    }

}
