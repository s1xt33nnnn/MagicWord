public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        MagicWord magic = new MagicWord();

        while (!gameOver){
            System.out.println(magic);
            System.out.print("Enter word or letter you only have 10 fails (words is a instant loose): ");
            String s = Input.readString();
            magic.shoot(s);
            System.out.println("Attemps: " + magic.getAttemps());
            System.out.println("Fails: " + magic.getFails());
            if (magic.wins()){
                System.out.println(magic);
                System.out.println("You WIN!");
                gameOver = true;
            }   else {
                    if (magic.looses()){
                    System.out.println("You loose. The hiden word was: " + magic.getHiddenWord());
                    gameOver = true;
                }
            }
        }

        }
    }

