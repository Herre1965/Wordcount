package Nl.herre.java;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordFrequencyAnalyzer word = new WordFrequencyAnalyzerImpl();
        word.calculateHighestFrequency("the sunshine shines over the lake");

          }
}
