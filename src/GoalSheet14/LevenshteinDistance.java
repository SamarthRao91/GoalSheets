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
        Map < String, ArrayList<String> > immediateNeighbors = new HashMap<>();

        String filePath = "C:\\Users\\raosa\\IdeaProjects\\GoalSheets\\src\\GoalSheet14\\Dictionary";

         //read from the file into the arrayList and sort it alphabetically
        Scanner fileInput = new Scanner(new File(filePath));
        while (fileInput.hasNext()) {
            words.add(fileInput.nextLine());
        }

        Collections.sort(words);

        //loop through the arrayList , and check if words[i] has a edit distance of 1 with words[k]
       for (int i = 0; i <= words.size() - 1; i++) {
            String baseWord = words.get(i);
           ArrayList<String> dotWords = new ArrayList<>();
            for (int k = 0; k <= words.size() - 1; k++) {
                String targetWord = words.get(k);

                    int distance = findDistance(baseWord, targetWord);
                    if (distance == 1) {

                        dotWords.add(targetWord);
                        immediateNeighbors.put(baseWord, dotWords);
                    }

            }

        }

        for (Map.Entry<String, ArrayList<String> > entry : immediateNeighbors.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        //ask the user for two words and walk the map
        System.out.println("Please input two words from the dictionary");
        Scanner userInput = new Scanner(System.in);
        String first = userInput.nextLine();
        System.out.println();
        userInput = new Scanner(System.in);
        String second = userInput.nextLine();
        System.out.println();

        //walk the map
        ArrayList<String> mapValues  = new ArrayList<>();
        ArrayList<String> retVal = new ArrayList<>();
        boolean pathFound = false;
        boolean toContinued = false;
        int l =0;
        retVal.add(first);
        mapValues = immediateNeighbors.get(first);



        while(!pathFound && ( l < mapValues.size()))
        {
            System.out.println("ALsize " + mapValues.size() + " l " + l );
            for (String mapValue : mapValues) {
                if (mapValue.equals(second)) {
                    retVal.add(mapValue);
                    pathFound = true;
                }
                else
                {
                     //make rinse and repeat method
                    /* for (String s : retVal) {
                        if (mapValues.get(l).equals(s)) {
                            toContinued = true;
                            break;
                        }
                    }
                    if(toContinued)
                    {

                        l++;
                        continue;
                    }



                    mapValues = immediateNeighbors.get(mapValues.get(l));
                    retVal.add(mapValues.get(l));
                     l++;
*/

                }
            }
        }

        System.out.println();
        System.out.println(retVal);


    }


    static int min(int a, int b, int c)
    {
        return Math.min(Math.min(a, b), c);
    }


    //test

    static int findDistance(String s1, String s2) {
        int word1Length = s1.length();
        int word2Length = s2.length();
        int substitutionCost;
        int i;
        int j;
        //declaring 2d array, all values are already set to 0
        int[][] wordLengthArray = new int[word1Length +1 ][word2Length+1];

        for (i = 1; i <= word1Length; i++) {
            wordLengthArray[i][0] = i;
        }
        for (j = 1; j <= word2Length; j++) {
            wordLengthArray[0][j] = j;
        }


        for (j = 1; j <= word2Length; j++) {
            for (i = 1; i <= word1Length; i++) {
                if (s1.charAt(i -1 ) == s2.charAt(j -1)) {
                    substitutionCost = 0;
                } else {
                    substitutionCost = 1;
                }

                wordLengthArray[i][j] = min(wordLengthArray[i - 1][j] + 1, wordLengthArray[i][j - 1] + 1, wordLengthArray[i - 1][j - 1] + substitutionCost);

            }
        }
        return wordLengthArray[word1Length][word2Length];

    }
}