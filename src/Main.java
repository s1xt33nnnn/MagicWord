public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        MagicWord magic = new MagicWord();

        while (!gameOver){
            System.out.println(magic);
            System.out.print("Enter word or letter: ");
            String s = Input.readString();
            magic.shoot(s);
            System.out.println("Attemps: " + magic.getAttemps());
        }
    }
}
