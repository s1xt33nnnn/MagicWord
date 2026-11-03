public class MagicWord {
    private static final String[] WORDS = {"Gladiador","Estreno","Magnitud"};
    private int attemps;
    private String hiddenWord;
    private boolean[] corectLetter;

    public MagicWord() {
        int a = (int)(Math.random()*WORDS.length);
        attemps = 0;
        hiddenWord = WORDS[a];
        corectLetter = new boolean[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); i++){
            corectLetter[i] = false;
        }
    }

    public

}
