package rps;

class Combination<S>{
    private S one;
    private S two;
    private S three;

    public Combination(S one, S two, S three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public S getOne() {
        return one;
    }

    public void setOne(S one) {
        this.one = one;
    }

    public S getTwo() {
        return two;
    }

    public void setTwo(S two) {
        this.two = two;
    }

    public S getThree() {
        return three;
    }

    public void setThree(S three) {
        this.three = three;
    }
}




