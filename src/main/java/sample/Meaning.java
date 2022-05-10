package sample;

public class Meaning {
    private StringBuilder meaning;

    public Meaning() {
        this.meaning = new StringBuilder("");
    }

    public Meaning(StringBuilder meaning) {
        this.meaning = meaning;
    }

    public void add(String s) {
        meaning.append(s + "\n");
    }

    @Override
    public String toString() {
        return meaning + "";
    }
}
