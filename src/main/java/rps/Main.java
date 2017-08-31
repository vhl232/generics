package rps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private List<Player> players = new ArrayList<>();
    private List<Combination> combinations = new LinkedList<>();

    private void play() {
        combinations.add(new Combination(
                players.get(0).makeChoise(),
                players.get(1).makeChoise(),
                players.get(2).makeChoise()));

        Player looser = findLooser();
        players.remove(looser);

    }

    private Player findLooser() {
        // finding looser here
        return null;
    }

    public static void main(String[] args) {
        Main game = new Main();

        game.players.add(new Player("Vasya"));
        game.players.add(new Player("Petya"));
        game.players.add(new Player("Kolya"));

        while (game.players.size() > 1) {
            game.play();
        }

        System.out.println("The winner is " + game.players.get(0).getName());
    }
}
