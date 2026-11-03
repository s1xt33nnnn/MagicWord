import java.util.Arrays;

public class MagicWord {
    private static final String[] WORDS = {"Gladiador","Estreno","Magnitud"};
    private int attemps;
    private String hiddenWord;
    private boolean[] corectLetter;

    public MagicWord() {
        int random = (int)(Math.random()*WORDS.length);
        attemps = 0;
        hiddenWord = WORDS[random];
        corectLetter = new boolean[hiddenWord.length()];
        for (int i = 0; i < corectLetter.length; i++){
            corectLetter[i] = false;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hiddenWord.length(); i++){
            if (corectLetter[i]){
                s = s + hiddenWord.charAt(i);
            }else {
                s = s + "_";
            }
        }
        return s;
    }

    public void shoot(String wordOrLetter){
        if (wordOrLetter.length() == 1){
            for (int i = 0; i < hiddenWord.length(); i++){
                if (){

                }
            }
        }else {

        }
    }
}
