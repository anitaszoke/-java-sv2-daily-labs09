package day03;

public class Caesar extends Encryptions {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String encrypts(String word) {
        String wordUpper = word.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char w : wordUpper.toCharArray()) {
            int originalPosition = Character.getNumericValue(w) + 55;
            int newPosition = originalPosition + getOffset();
            char c = (char) newPosition;

            sb.append(c);
        }
        String s = sb.toString();
        return s;
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar(7);
        System.out.println(caesar.encrypts(caesar.encrypts("ABC")));
    }
}