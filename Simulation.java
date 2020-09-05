public class Simulation {
    public static void main (String [] arg) {
        //100 loops
        int win1 = 0;
        int win2 = 0;
        int turns = 0;
        double precent1 = 0.0;
        double precent2 = 0.0;
        int averageTurns = 0;
        for (int a = 1; a <= 100; a++) {
            System.out.println();
            Character char1 = new Saber("Mikoto");
            Character char2 = new Boss("SKTT1");
            while (char1.getHp() >= 0 && char2.getHp() >= 0) {                
                char1.attack(char2);
                turns++;
                if (char2.getHp() <= 0) {
                    System.out.println(char1.getName() +" is the winner!");
                    System.out.println("Turns: "+turns);
                    averageTurns += turns;
                    System.out.println("---------------");
                    win1++;
                    turns = 1;
                    break;
                }else char2.attack(char1); 
                turns++;
                if (char1.getHp() <= 0) {
                    System.out.println(char2.getName() +" is the winner!");
                    System.out.println("Turns: "+turns);
                    averageTurns += turns;
                    System.out.println("---------------");
                    turns = 1;
                    win2++;
                    break;
                }
            }
        }
        System.out.println("Average turns: "+ (double)(averageTurns/100));
        System.out.println("char1's Wins: "+ win1);
        System.out.println("char2's Wins: "+ win2);
    } 
}