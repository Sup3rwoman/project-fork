public class PhrasOMat {

    public static void main(String[] args){
    //Drei Wortgruppen erstellen, aus denen ausgewählt wird
        String[] wortListeEins = {"verlässliche", "erfolgsorientierte", "webbasierte", "allumfassende",
        "clevere", "kundenorientierte", "pfadkritische", "dynamische", "konkurrenzfähige", "verbundene",
        "zielgerichtete"};

        String [] wortListeZwei = {"gepowerte", "haftende", "Mehrwert-", "zentrierte", "geclusterte", "proaktive",
        "Out-of-the-Box", "positionierte", "vernetzte", "fokussierte", "kraftvolle", "geordnete", "geteilte",
        "kooperative", "beschleunigte", "Multi-Tier", "Enterprise-", "B2B", "Frontend-", "vermerkelte"};

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
        System.out.println("Math.random() gibt ein pseudozufälliges Double größer oder gleich 0.0 und kleiner als 1.0 zurück. Daher multiplizieren wir es mit der Länge (Anzahl Einträge) des Arrays: " + einsLänge + "  -- Beispiel für Math.random: " + rawRand1);
        System.out.println("Math.random() wird daher in diesem Anwendungsfall zu einem int gecastet (int) (Math.random() * einsLänge): " + rand1);

    // eine Phrase zusammenbauen
        String phrase = wortListeEins[rand1] + " " +
                wortListeZwei[rand2] + " " + wortListeDrei[rand3];

    // eine Phrase ausgeben

        System.out.println("");
        System.out.println("Was wir brauchenm ist eine " + phrase);
    }
}
