public class Player {
    String charactername;
    int health;
    int score;
    int money;

    public Player(String startingName,int startinghealth,int startingscore,int startingmoney){
        charactername=startingName;
        health=startinghealth;
        score=startingscore;
        money=startingmoney;
        System.out.println(charactername + " has spawned into the game!");
    }
    public static void main(String[] args){
        Player player1= new Player("babumon",150,100,1000);

        System.out.println("------states-------"+"\nhealth:"+ player1.health +"\nscore:"+ player1.score +"\nmoney:"+ player1.money);
    }

}
