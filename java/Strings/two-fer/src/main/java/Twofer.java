public class Twofer {
    public String twofer(String name) {
        String phrase = "One for you, one for me.";
        return (name == null) ? phrase : phrase.replace("you", name);
    }
}
