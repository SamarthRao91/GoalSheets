package GoalSheet03;

import java.util.Random;

public class RandomLine {
    public static void main(String[] args) {
        int min = 5;
        int max = 11;
        double loopTimes = Math.random() * (max - min + 1) + min;
        loopTimes = (int) (loopTimes);
        for(int i =1; i <= loopTimes; i++)
        {
            RandomLines();
            System.out.println("\n");
        }

    }
    public static void RandomLines() {

        double characterNumber;
        char characterAlphabet;
        int min = 0;
        int max = 26;
        for (int i = 1; i <= 80; i++) {
            characterNumber = Math.random() * (max - min + 1) + min;
            characterNumber = (int) (characterNumber);
            if (characterNumber > 0) {
                characterNumber += 96;
            }
            characterAlphabet = (char) (characterNumber);
            System.out.print(characterAlphabet);
            //System.out.print("  " +characterNumber + "\n");

        }
    }
}
