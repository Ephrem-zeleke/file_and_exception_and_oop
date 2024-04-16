package object_oriented_programming.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {


    private DiceCup diceCup;
    private List<player> players;

    public static void main(String[] args) {
        // this is the main method
        // this will make player object
        // get a knockout number
        // create a dice cup
        // play the game until one player left
        // each player will roll the dice
        // print out the winner
        Game knockout = new Game();
        knockout.startGame();
    }

    public void startGame(){
        diceCup = new DiceCup(2);

        int numberOfPlayers = positiveIntInput("How many players?");

        createPlayers(numberOfPlayers);

        setKnockOutNumber();
        
        play();
        
        printGameResult();

    }

    private void createPlayers(int numberOfPlayers) {
        players = new ArrayList<>();

        for ( int x = 0; x < numberOfPlayers; x++){
            String name = stringInput("Enter palyer " + x + "'s name?");
            player player = new player(name);
            players.add(player);
        }

    }

    private void setKnockOutNumber() {

        for ( player p: players){
            int knockOutNumber;
            do {
                knockOutNumber = intInput("Player " + p.getName() + ", enter your knock out number:" + " " +
                        " it must be 6, 7, 8, or 9");

            }while (knockOutNumber < 6 || knockOutNumber > 9);

            p.setKnockoutNumber(knockOutNumber);


        }
    }

    private void play() {

        int playerIndex = 0;

        int totalPlayer = players.size();
        
        while (morethanOnePlayerInPlay()){

            player currentPlayer = players.get(playerIndex);

            if(currentPlayer.isKnockedOut()){
                System.out.println("Sorry, " + currentPlayer.getName() + " you are knocked out ");
            }else {
                String ignore = stringInput("Player " + currentPlayer.getName() + " enter press to roll");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);

            }

            playerIndex = (playerIndex + 1) % totalPlayer;

        }
    }

    private boolean morethanOnePlayerInPlay() {

        int totalInPlay = 0;
        for (player p: players){
            if(!p.isKnockedOut()){
                totalInPlay++;
            }
        }
        System.out.println("There are " + totalInPlay + " player(s) in the game");
        if(totalInPlay > 1){
            return true;
        }
        else {
            return false;
        }
    }

    private void printGameResult() {
        for(player p:players){
            if (p.isKnockedOut()){
                System.out.println("Player " + p.getName() + " was knocked out");
            }else {
                System.out.println("Player " + p.getName() + " IS THE WINNER!!!");
            }
        }
    }

}
