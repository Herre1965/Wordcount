package Nl.herre.java;

import java.util.*;

public class WordFrequencyAnalyzerImpl implements WordFrequencyAnalyzer {
    /**
     * CalculateHighestFrequency should return the highest frequency
     * in the text (severalwords might have this frequency)
     *
     * @param text ingevoerd door gebruiker
     * @return highest frequency
     */
    public int calculateHighestFrequency(String text) {
        // Ik krijg een lange tekst binnen. Ik wil ieder woordje tellen.
        // Ipv hele tekst ieder woord opslaan.
        // Hoe kan ik een string splitsen in meerdere woorden?
        Map<String, Integer> teller = new HashMap<>();
        String[] woorden = text.split(" ");

        // Tellen hoevaak woord voorbij komt.
        for (String s : woorden) {
            // als woord al bestaat ophogen ipv op 1 zetten
//        teller.put(s, 1);
            if (teller.keySet().contains(s))
                teller.put(s, teller.get(s) + 1);
            else
                teller.put(s, 1);

        }
// Hoogste woord aantal terug geven nadat aantallen bepaald zijn.
// woordje opvangen in variabele en maximum aantal ook
        String meeste = "";
        int maximum = 0;
        for (Map.Entry<String, Integer> entry : teller.entrySet()) {
            String sleutel = entry.getKey();
            Integer tel = entry.getValue();
            if (tel > maximum) {
                maximum = tel;
                meeste = sleutel;
            } else if (tel == maximum) {
                if (sleutel.length() < meeste.length())
                    meeste = sleutel;
            }
        }
        System.out.println("Het meest voorkomende woord: " + meeste);
        System.out.println("Het woord komt: " + maximum + " keer voor");
        return 0;
    }


    @Override
    public int calculateFrequencyForWord(String text, String woord) {
/**
 * CalculateFrequencyForWord should return the frequency
 * of the specified word in the text
 * @param text en specifiek woord ingevoerd door gebruiker
 * @return aantal keren dat meegegeven woord voorkomt in de tekst
 */
        // Ik krijg een  tekst binnen. Ik wil het aantal keren tellen dat meegegeven woord voorkomt.
        // Ipv hele tekst ieder woord opslaan.
        // String 'woorden' splitsen door middel van split.
        // als woord op index nr gelijk is aan woord dat is ingegeven dan teller ophogen voor het ingegeven woord.
        // trim haalt whitespaces weg.
        String trimw = woord.trim();

        String woorden[] = text.split(" ");
        int tel = 0;
        for (int i = 0; i < woorden.length; i++) {
            if (trimw.equalsIgnoreCase(woorden[i]))
                tel++;
        }
        return tel;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {

        String lijst[] = text.split(" ");

//        for (String index: lijst)
//        { System.out.println(index + ": " + Collections.frequency(List.of(lijst),index));
//        }

// calculateMostFrequentWords krijgt een lijst met WordFrequency objecten terug.
// WordFrequency is een interface, geen object. Dit moeten we nog maken.  ... implements WordFrequency
// WordFrequency heeft een frequency en een woord. Die moet je vullen per lijst element.

        return null;
    }
}
