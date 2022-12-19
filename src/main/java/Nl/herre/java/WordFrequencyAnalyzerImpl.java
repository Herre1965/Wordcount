package Nl.herre.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;

public class WordFrequencyAnalyzerImpl implements WordFrequencyAnalyzer {
    /**
     * CalculateHighestFrequency should return the highest frequency
     * in the text (severalwords might have this frequency)
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
           teller.put(s,teller.get(s) + 1);
       else
           teller.put(s,1);

              }
// Hoogste woord aantal terug geven nadat aantallen bepaald zijn.
// woordje opvangen in variabele en maximum aantal ook
        String meeste = "";
        int maximum = 0;
        for (Map.Entry<String,Integer> entry : teller.entrySet())
        {
            String sleutel = entry.getKey();
            Integer tel = entry.getValue();
            if (tel > maximum)
            {
                maximum = tel;
                meeste = sleutel;
             }
            else if (tel== maximum ) {
                if (sleutel.length() < meeste.length())
                    meeste = sleutel;
            }
        }
     System.out.println("Het meest voorkomende woord: " +meeste);
        System.out.println("Het woord komt: " + maximum +  " keer voor");
    return 0;
    }


    @Override
    public int calculateFrequencyForWord(String text, String word) {

        return 0;
   }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
}
