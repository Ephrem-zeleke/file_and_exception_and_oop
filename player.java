package object_oriented_programming.knockout_game;

public class player {


    private String name;
    private boolean knockedOut; // are the player still in the game?
    private int knockoutNumber; // the number the player chose

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }

    public player (String name){
        this.name = name;
        this.knockedOut = false; // everybody is in the game at the beginning
        // now let's generate getter and setter for the fields and intellij will generate it


    }
    public String playTurn(DiceCup diceCup){
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)){
            knockedOut = true;

        }
        String resultTemplate = "Player %s rolled a total of %s and %d knocked out. ( your knockout number was %d";

        String knockedOutOrNot = "was not";
        if (knockedOut){
            knockedOutOrNot = "was";
        }
        String result = String.format(resultTemplate, name, score, knockedOutOrNot, knockoutNumber);

        return result;
    }

    public boolean playerKnockedOut( int score){
        if ( score == knockoutNumber){
            return true;
        }else {
            return false;
        }
    }


}
