package Nl.herre.java;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordFrequencyAnalyzer word = new WordFrequencyAnalyzerImpl();
        //opdracht 1.
        word.calculateHighestFrequency("the sunshine shines over the lake");
        // opdracht 2.
        String  text = "the sunshine shines again and again and again over the big lake";
        String woord = "   again ";
        word.calculateFrequencyForWord(text,woord);
        System.out.println("het woord" + woord + "komt " + (word.calculateFrequencyForWord(text,woord)) + " voor");
       //opdracht 3.

        String tekst = "the sunshine shines over and over the lake again";
        List<WordFrequency> wordFrequencies = word.calculateMostFrequentNWords(tekst, 3);
        for (WordFrequency wordFrequency : wordFrequencies) {
            System.out.println(wordFrequency.getWord()+ ": "+ wordFrequency.getFrequency());


        }

    }

}
