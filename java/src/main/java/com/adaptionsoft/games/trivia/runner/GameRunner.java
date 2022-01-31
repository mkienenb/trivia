package com.adaptionsoft.games.trivia.runner;

import com.adaptionsoft.games.uglytrivia.Game;

import java.util.Random;


public class GameRunner {

    private static boolean notAWinner;

    public static void main(String[] args) {
        new GameRunner().runGame(new Random(), new Game());
    }

    /** Added to support testing with known random seeds
     * @param seed random seed
     */
    public static void runGameWithSeed(long seed) {
        Random random = new Random(seed);
        new GameRunner().runGame(random, new Game());
    }

    private void runGame(Random rand, Game aGame) {

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }


        } while (notAWinner);
    }
}
