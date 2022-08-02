package day19_LoopPractices;


import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int frequencyMax = 0;
        char chMax = ' ';

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch1 = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2) {
                    frequency++;
                }
            }
                if (frequency > frequencyMax) {
                    frequencyMax = frequency;
                    chMax = ch1;
                }
            }
            System.out.println(chMax);
            System.out.println("frequencyMax = " + frequencyMax);
        }
    }

