import java.util.Scanner;
public class Game
{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Item estus = new Item();
        Item ember = new Item();
        System.out.println("Welcome, pick your class!");
        System.out.println("Saber, Lancer, or Archer");
        Character char1 = null;
        String input = in.nextLine(); // the next() method returns a String
        if(input.equals("Saber")){
            System.out.println("What is your name?");
            char1 = new Saber(in.nextLine());
            System.out.println("Your Mission is to Defeat the the 3 Bosses");
            System.out.println();
        }
        if(input.equals("Lancer")){
            System.out.println("What is your name?");
            char1 = new Lancer(in.nextLine());
            System.out.println("Your Mission is to Defeat the 3 Bosses");
            System.out.println();
        }
        if(input.equals("Archer")){
            System.out.println("What is your name?");
            char1 = new Archer(in.nextLine());
            System.out.println("Your Mission is to Defeat the 3 Bosses");
            System.out.println();
        }        

        Boss[] enemy = new Boss[3];
        enemy[0] = new Boss("Pontiff Sulyvahn");

        System.out.println("Battle 1! Are you ready?");
        while (char1.getHp() >= 0 && enemy[0].getHp() >= 0) {
            System.out.println("What would you like to do?");
            System.out.println("1 = Attack");
            System.out.println("2 = Use Item");
            input = in.nextLine();
            if (input.equals("1")){
                char1.attack(enemy[0]);
                if (enemy[0].getHp() <= 0) {
                    System.out.println("You Win!");
                    break;
                }else enemy[0].attack(char1);
                if (char1.getHp() <= 0) {
                    System.out.println("You Died");
                    break;
                }
            }
            if (input.equals("2")){
                System.out.println("What Item Would You Like to Use?");
                System.out.println("1 = Estus");
                System.out.println("2 = Ember");
                System.out.println("3 = Cancel");
                input = in.nextLine();
                if (input.equals("1")){
                    estus.useEstus(char1);
                }
                if (input.equals("2")){
                    ember.useEmber(char1);
                }
                if(input.equals("3")){
                    System.out.println("Nothing Happened...");
                }
            }
        }

        if (enemy[0].getHp() <= 0){
            System.out.println("You Approach A Bonfire");
            System.out.println("Would you like to Rest?");
            System.out.println("1 = Yes");
            System.out.println("2 = No");
            input = in.nextLine();
            if(input.equals("1")){
                char1.setHp(char1.getMHP() + 5);
                char1.setStr(char1.getMATK() + 5);
                char1.setDef(char1.getMDEF() + 5);
                char1.setMHP(char1.getHp());
                char1.setMATK(char1.getStr());
                char1.setMDEF(char1.getDef());
                System.out.println("Name : " + char1.getName());
                System.out.println("Health = " + char1.getHp());
                System.out.println("Strength = " + char1.getStr());
                System.out.println("Defense = " + char1.getDef());
            }
            if(input.equals("2")){
                System.out.println("Nothing changed...");
            }
            System.out.println("You Approach the Next Boss");
            System.out.println();
            enemy[1] = new Boss("Abyss Watchers");
            System.out.println("Battle 2! Begin");
            while (char1.getHp() >= 0 && enemy[1].getHp() >= 0) {
                System.out.println("What would you like to do?");
                System.out.println("1 = Attack");
                System.out.println("2 = Use Item");
                input = in.nextLine();
                if (input.equals("1")){
                    char1.attack(enemy[1]);
                    if (enemy[1].getHp() <= 0) {
                        System.out.println("You Win!");
                        break;
                    }else enemy[1].attack(char1);
                    if (char1.getHp() <= 0) {
                        System.out.println("You Died");
                        break;
                    }
                }
                if (input.equals("2")){
                    System.out.println("What Item Would You Like to Use?");
                    System.out.println("1 = Estus");
                    System.out.println("2 = Ember");
                    System.out.println("3 = Cancel");
                    input = in.nextLine();
                    if (input.equals("1")){
                        estus.useEstus(char1);
                    }
                    if (input.equals("2")){
                        ember.useEmber(char1);
                        if(input.equals("3")){
                            System.out.println("Nothing Happened...");
                        }
                    }
                }
            }

            if (enemy[0].getHp() <= 0 && enemy[1].getHp() <= 0){
                System.out.println("You Approach A Bonfire");
                System.out.println("Would you like to Rest?");
                System.out.println("1 = Yes");
                System.out.println("2 = No");
                input = in.nextLine();
                if(input.equals("1")){
                    char1.setHp(char1.getMHP() + 5);
                    char1.setStr(char1.getMATK() + 5);
                    char1.setDef(char1.getMDEF() + 5);
                    char1.setMHP(char1.getHp());
                    char1.setMATK(char1.getStr());
                    char1.setMDEF(char1.getDef());
                    System.out.println("Name : " + char1.getName());
                    System.out.println("Health = " + char1.getHp());
                    System.out.println("Strength = " + char1.getStr());
                    System.out.println("Defense = " + char1.getDef());
                }
                if(input.equals("2")){
                    System.out.println("Nothing changed...");
                }
                System.out.println("You Approach the Next Boss");
                System.out.println();
                enemy[2] = new Boss("The Nameless King");
                System.out.println("Battle 2! Begin");
                while (char1.getHp() >= 0 && enemy[2].getHp() >= 0) {
                    System.out.println("What would you like to do?");
                    System.out.println("1 = Attack");
                    System.out.println("2 = Use Item");
                    input = in.nextLine();
                    if (input.equals("1")){
                        char1.attack(enemy[2]);
                        if (enemy[2].getHp() <= 0) {
                            System.out.println("You Win!");
                            break;
                        }else enemy[2].attack(char1);
                        if (char1.getHp() <= 0) {
                            System.out.println("You Died");
                            break;
                        }
                    }
                    if (input.equals("2")){
                        System.out.println("What Item Would You Like to Use?");
                        System.out.println("1 = Estus");
                        System.out.println("2 = Ember");
                        System.out.println("3 = Cancel");
                        input = in.nextLine();
                        if (input.equals("1")){
                            estus.useEstus(char1);
                        }
                        if (input.equals("2")){
                            ember.useEmber(char1);
                        }
                        if(input.equals("3")){
                            System.out.println("Nothing Happened...");
                        }
                    }
                }
            }
            if(char1.getHp()<=0){
                System.out.println("You Lost Try Again");
            }
            if(enemy[0].getHp() <= 0 && enemy[1].getHp() <= 0 && enemy[2].getHp() <= 0){
                System.out.println("Congrats, You Beat the Game!");
            }
        }
    }
}