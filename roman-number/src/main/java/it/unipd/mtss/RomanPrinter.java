////////////////////////////////////////////////////////////////////
// Samuele Visentin 2034343
// Andrea Mangolini 2034305
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        HashMap<Character, String[]> conversionMap = new HashMap<Character, String[]>();

        int height = 6;
        conversionMap.put('I', new String[]{"  _____  ", " |_   _| ", "   | |   ", "   | |   ", "  _| |_  ", " |_____| "});
        conversionMap.put('V', new String[]{" __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "});
        conversionMap.put('X', new String[]{" __   __ ", " \\ \\ / / ", "  \\ V /  ", "   > <   ", "  / . \\  ", " /_/ \\_\\ "});
        conversionMap.put('L', new String[]{"  _       ", " | |      ", " | |      ", " | |      ", " | |____  ", " |______| "});
        conversionMap.put('C', new String[]{"   _____  ", "  / ____| ", " | |      ", " | |      ", " | |____  ", "  \\_____| "});
        conversionMap.put('D', new String[]{"  _____   ", " |  __ \\  ", " | |  | | ", " | |  | | ", " | |__| | ", " |_____/ "});
        conversionMap.put('M', new String[]{"  __  __  ", " |  \\/  | ", " | \\  / | ", " | |\\/| | ", " | |  | | ", " |_|  |_| "});

        String[][] result = new String[height][romanNumber.length()];
        int count = 0;
        for(Character c : romanNumber.toCharArray()) {
            result[count] = conversionMap.get(c);
            count++;
        }

        String printable = "";
        for (int i = 0; i < height; i++) {
            for(int j = 0; j < romanNumber.length(); j++) {
                printable += result[j][i];
            }
            printable += "\n";
        }

        System.out.println(printable);

        return null;
    }
}
