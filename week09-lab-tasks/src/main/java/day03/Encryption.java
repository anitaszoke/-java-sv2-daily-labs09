package day03;

public class Encryption {

    public String encrypts(String word) {
        String wordUpper = word.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char w : wordUpper.toCharArray()) {
            int originalPosition = Character.getNumericValue(w) + 55;
            int newPosition = originalPosition + 3;
            char c = (char) newPosition;

            sb.append(c);
        }
        String s = sb.toString();
        return s;
    }

    public static void main(String[] args) {
        Encryption e = new Encryption();

        System.out.println(e.encrypts("ABC"));
    }
}
