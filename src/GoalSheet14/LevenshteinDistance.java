package GoalSheet14;
/*
 * BJP Ch 11 project 1. Find edit (Levenshtein) distance between words.
 *  Read words from a sorted dictionary file. - X
 *  Compute a map from every word to its immediate neighbors, that is, the words that have an edit distance of 1 from it.
 *  You can walk the map to find paths from one word to another, and can use a linked list of words to visit neighbors
 * By the way, that is a little hint.) One last thing to note, the dictionaries have 370,099 words in them.
 *  Use one or both to help you solve the problem
 * */

import java.io.*;
import java.util.*;

public class LevenshteinDistance {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList < String > words = new ArrayList < > ();
        Map < String, String > immediateNeighbors = new HashMap < String, String > ();
        String filePath = "C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet14\\Dictionary";
        Scanner fileInput = new Scanner(new File(filePath));
        while (fileInput.hasNext()) {
            words.add(fileInput.nextLine());
        }

        Collections.sort(words);
       /* for (int i = 0; i <= words.size() - 1; i++) {
            String baseWord = words.get(i);

            for (int k = 0; k <= words.size() - 1; k++) {
                String targetWord = words.get(k);
                if (baseWord.length() == targetWord.length() || baseWord.length() == targetWord.length() - 1 || baseWord.length() == targetWord.length() + 1) {
                    int distance = findDistance(baseWord, targetWord, baseWord.length(), targetWord.length());
                    System.out.println("\n" + distance);
                    if (distance == 1) {
                        //make a map, with key being the baseWord and targetWord being the value.
                        immediateNeighbors.put(baseWord, targetWord);
                    }
                } else {
                    break;
                }
            }

        }
       immediateNeighbors.forEach((key, value) -> System.out.println(key + ":" + value));*/

        int distanceTester = findDistance("the", "cats");
        System.out.println(distanceTester);
;
    }

    static int min(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }


    static int findDistance(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        word1Length -= 1;
        word2Length -= 1;
        int i;
        int j;
        int substitutionCost = 0;
        //declaring 2d array, all values are already set to 0
        int[][] wordLength = new int[word1.length()][word2.length()];

        for (i = 1; i <= word1Length; i++) {
            wordLength[i][0] = i;
        }
        for (j = 1; j <= word2Length; j++) {
            wordLength[0][j] = j;
        }


        for (j = 1; j <= word2Length; j++) {
            for (i = 1; i <= word1Length; i++) {
                if (word1.indexOf(i) == word2.indexOf(j)) {
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }

                wordLength[i][j] = min(wordLength[i - 1][j] + 1, wordLength[i][j - 1] + 1, wordLength[i - 1][j - 1] + substitutionCost);

            }
        }
        return wordLength[word1Length][word2Length];

    }
}