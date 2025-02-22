package generic.test.ex2;

public class Pair<A, B> {
    private A first;
    private B second;

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{first=" + this.first +
                ", second=" + this.second + "}";
    }
}
