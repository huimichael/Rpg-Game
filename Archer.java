public class Archer extends Character {
    public Archer (String name) {
        super(name, (int)(Math.random()*6) + 15, (int)(Math.random()*5)+14, 45);
    }
    public void attack (Character c){
        boolean special = false;

        if ((int)(Math.random()*5) == 0) {
            special = true;
        }
        if (special == true) {
            this.setStr(this.getStr() + 2);
            this.setHp(this.getHp() +2);
            System.out.println("ARCHER SPECIAL");
        }
            super.attack(c);  
            special = false;
    }
    }