package object_oriented_programming.knockout_game;

import java.util.Random;

public class Dice {
    // we create a dice object and this object will generate a random number between 1 and 6

    public int roll(){
        Random rnd = new Random();
        return rnd.nextInt(6) + 1; // this will generate a random number between 1 and 6 and return it

    }
}
