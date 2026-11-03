import java.util.Arrays;

public class MagicWord {
    private static final String[] WORDS = {"gladiador", "estreno", "magnitud"};
    private int attemps;
    private String hiddenWord;
    private boolean[] corectLetter;

    public MagicWord() {
        int random = (int) (Math.random() * WORDS.length);
        attemps = 1;
        hiddenWord = WORDS[random];
        corectLetter = new boolean[hiddenWord.length()];
        for (int i = 0; i < corectLetter.length; i++) {
            corectLetter[i] = false;
        }
    }

    public int getAttemps() {
        return attemps++;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (corectLetter[i]) {
                s = s + hiddenWord.charAt(i);
            } else {
                s = s + "_";
            }
        }
        return s;
    }

    public boolean wins() {
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (!corectLetter[i] == true) {
                return false;
            }
        }
        return true;
    }

    public void shoot(String wordOrLetter) {
        if (wordOrLetter.length() == 1) {
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (wordOrLetter.charAt(0) == hiddenWord.charAt(i)) {
                    corectLetter[i] = true;
                }
            }
        } else {
            if (hiddenWord.equals(wordOrLetter)) {
                for (int i = 0; i < corectLetter.length; i++) {
                    corectLetter[i] = true;
                }
            }
        }
    }
}
