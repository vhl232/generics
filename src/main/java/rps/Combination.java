package rps;

class Combination {
    private Sign one;
    private Sign two;
    private Sign three;

    Combination(Sign one, Sign two, Sign three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println(one + " / " + two + " / " + three);
    }
}
