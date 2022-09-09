package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RundomUtils;

public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] setQuestionAnswerArray() {
        String[][] array = new String[Engine.MAX_ROUND_NUMBER][2];

        for (String[] roundQuestionAnswer: array) {
            int number = RundomUtils.returnRandomNumber(2, RundomUtils.MAX_RANDOM_NUMBER);

            //set question
            roundQuestionAnswer[0] = "Question: " + number;
            //set correct answer
            roundQuestionAnswer[1] = findCorrectAnswer(number);
        }

        return array;
    }

    private static String findCorrectAnswer(int number) {

        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
