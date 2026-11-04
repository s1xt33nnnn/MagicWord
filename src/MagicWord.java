import java.util.Arrays;

public class MagicWord {
    private static final int MAX_ATTEMPS = 10;
    private static final String[] WORDS = {"gladiador", "estreno", "magnitud","waterpolo", "estanque", "cabeza", "batalla"};
    private int fails;
    private String hiddenWord;
    private boolean[] corectLetter;
    private int attemps;

    public MagicWord() {
        int random = (int) (Math.random() * WORDS.length);
        attemps = 1;
        fails = 0;
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

    public String getHiddenWord(){
        return hiddenWord;
    }

    public boolean wins() {
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (!corectLetter[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean looses(){
        return  fails > MAX_ATTEMPS;
    }

    public void shoot(String wordOrLetter) {
        boolean acierto = false;
        if (wordOrLetter.length() == 1) {
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (wordOrLetter.toLowerCase().charAt(0) == hiddenWord.toLowerCase().charAt(i)) {
                    corectLetter[i] = true;
                    acierto = true;
                }
                }if (acierto = false){
                fails++;
            }
            }
         else {
            if (hiddenWord.equals(wordOrLetter)) {
                for (int i = 0; i < corectLetter.length; i++) {
                    corectLetter[i] = true;
                }
            } else {
                fails = MAX_ATTEMPS;
            }
        }
    }

    public int getFails() {
        return fails++;
    }
}
