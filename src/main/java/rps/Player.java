package rps;

class Player {
    private final String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    Sign makeChoise() {
        return Sign.values()[(int) (Math.random() * 4)];
    }
}
