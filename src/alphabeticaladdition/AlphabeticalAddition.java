/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticaladdition;

import java.util.HashMap;

/**
 *
 * @author trevor
 */
public class AlphabeticalAddition {
    
    private static HashMap<String, Integer> graph;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] letters;
        letters = new char[] {'a', 'b', 'c'};
        printResult(letters);
        letters = new char[] {'a', 'b'};
        printResult(letters);
        letters = new char[] {'z'};
        printResult(letters);
        letters = new char[] {'z', 'a'};
        printResult(letters);
        letters = new char[] {'y', 'c', 'b'};
        printResult(letters);
        letters = new char[0];
        printResult(letters);
    }
    
    public static char addLetters()
    {
        return 'z';
    }
    
    public static char addLetters(char[] letters)
    {
        createDictionary();
        int sum = sumLetters(letters);
        int answer;
        if (sum > graph.size())
            answer = sum % graph.size();
        else
            answer = sum;
        return getKeyFromValue(answer);
    }
    
    private static int sumLetters(char[] letters)
    {
        createDictionary();
        int sum = 0;
        if(letters.length > 0) {
            for(int i = 0; i < letters.length; i++)
            {
                sum += (int)graph.get(""+letters[i]);
            }
        } else {
            sum = 26;
        }
        
        return sum;
    }
    
    private static void createDictionary()
    {
        if(graph ==  null) {
            graph = new HashMap<>();
            graph.put("a", 1);
            graph.put("b", 2);
            graph.put("c", 3);
            graph.put("d", 4);
            graph.put("e", 5);
            graph.put("f", 6);
            graph.put("g", 7);
            graph.put("h", 8);
            graph.put("i", 9);
            graph.put("j", 10);
            graph.put("k", 11);
            graph.put("l", 12);
            graph.put("m", 13);
            graph.put("n", 14);
            graph.put("o", 15);
            graph.put("p", 16);
            graph.put("q", 17);
            graph.put("r", 18);
            graph.put("s", 19);
            graph.put("t", 20);
            graph.put("u", 21);
            graph.put("v", 22);
            graph.put("w", 23);
            graph.put("x", 24);
            graph.put("y", 25);
            graph.put("z", 26);
        }
    }
    
    private static char getKeyFromValue(int value)
    {
        createDictionary();
        for(String s: graph.keySet())
        {
            if(value == graph.get(s))
                return s.charAt(0);
        }
        
        return '?';
    }

    private static void printResult(char[] letters) {
        String format = "Sum of letters: %s = %c\n";
        System.out.printf(format, charsToString(letters), addLetters(letters));
    }
    
    private static String charsToString(char[] letters)
    {
        StringBuilder sb = new StringBuilder();
        String output;
        if (letters == null) {
            output = "{none}";
        } else {
            if (letters.length > 0) {
                for(int i = 0; i < letters.length; i++)
                {
                    sb.append(String.format("%c, ", letters[i]));
                }
                output = sb.toString();

                output = output.substring(0, output.length()-2);
            } else {
                output = "z";
            }
        }
        
        return output;
    }
}
