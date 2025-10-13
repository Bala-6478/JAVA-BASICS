import java.util.stream.IntStream;

class INTSTREAM {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Get IntStream of characters
        IntStream stream = sb.chars();

        // Print character codes and actual characters
        stream.forEach(ch -> System.out.println(ch + " -> " + (char) ch));
    }
}
