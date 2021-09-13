public class PhrasOMat {

    public static void main(String[] args){
    //Quelle: "JAVA - Von Kopf bis Fuß - O'Reilly-Verlag"

    //Drei Wortgruppen erstellen, aus denen ausgewählt wird
        String[] wortListeEins = {"verlässliche", "erfolgsorientierte", "webbasierte", "allumfassende",
        "clevere", "kundenorientierte", "pfadkritische", "dynamische", "konkurrenzfähige", "verteilte",
        "zielgerichtete"};

        String [] wortListeZwei = {"gepowerte", "haftende", "Mehrwert-", "zentrierte", "geclusterte", "proaktive",
        "Out-of-the-Box", "positionierte", "vernetzte", "fokussierte", "kraftvolle", "geordnete", "geteilte",
        "kooperative", "beschleunigte", "Multi-Tier", "Enterprise-", "B2B", "Frontend-"};

        String[] wortListeDrei = {"Schicht", "Endstufe", "Lösung", "Architektur", "Kernkompetenz", "Strategie",
        "Kooperation", "Ausrichtung", "Räumlichkeit", "Vision", "Dimension", "Mission"};

    // ermitteln, wieviele Wörter sich in jeder Liste befinden
        int einsLänge = wortListeEins.length;
        int zweiLänge = wortListeZwei.length;
        int dreiLänge = wortListeDrei.length;

    // drei Zufallszahlen generieren, um Wörter aus den Listen herauszusuchen
        double rawRand1 = Math.random() * einsLänge;
        int rand1 = (int) (Math.random() * einsLänge);
        int rand2 = (int) (Math.random() * zweiLänge);
        int rand3 = (int) (Math.random() * dreiLänge);

    // Bisl Input bzgl. Math.Random als Gedankenstütze
        System.out.println("Math.random() gibt ein pseudozufälliges Double größer oder gleich 0.0 und kleiner als 1.0 zurück. Daher multiplizieren wir es mit der Länge (Anzahl Einträge) des Arrays, z.B. " + einsLänge + "  -- Beispiel für Math.random: " + rawRand1);
        System.out.println("Math.random() wird, weil es ein Double ist, in diesem Anwendungsfall zu einem int gecastet (int) (Math.random() * einsLänge): " + rand1 + ". Denn nur ein int-Wert kann die Index-Posotion eines Array angeben!");

    // eine Phrase zusammenbauen
        String phrase = wortListeEins[rand1] + " " +
                wortListeZwei[rand2] + " " + wortListeDrei[rand3];

    // eine Phrase ausgeben

        System.out.println("");
        System.out.println("Was wir brauchen, ist eine " + phrase + "!");
    }
}