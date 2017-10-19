import java.util.Scanner;

public class Game {
    private int score = 5;

    public void whoWin(Player player, Stakan stakan){
        if (player.resultPlayer == stakan.setStakan()){
            System.out.println("Вы выйграли!!!");
            score = score + 1;
        }else {
            System.out.println("Вы проиграли :с");
            score = score - 2;
        }
    }
    public int getScore(){
        return this.score;
    }
    public void gameOver(){
        System.out.println("Ваш счет = " + score);
    }

    public static void main(String[] args) {
        boolean q = true;
        Scanner scanner = new Scanner(System.in);
        String choice = new String();
        Player player = new Player();
        Stakan stakan = new Stakan();
        Game game = new Game();
        while (q == true) {
            player.playerMakeChoice();
            game.whoWin(player, stakan);
            System.out.println("Хотите сыграть еще?(Да/Нет)");
            choice = scanner.next();
            if (choice.equals("Да") | choice.equals("да")){
                q = true;
            }if (choice.equals("Нет") | choice.equals("нет")){
                q = false;
                game.gameOver();
            }
            if (game.score <= 0){
                q = false;
                System.out.println("Вы проиграли, у вас нет больше очков");
                game.gameOver();
            }
        }

    }
}
