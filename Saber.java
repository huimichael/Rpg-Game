public class Saber extends Character {
    public Saber(String name) {
        super(name, (int)(Math.random()*5) + 16, (int)(Math.random()*4) + 15, 45);    
    }
    public void attack (Character c){
        boolean special = false;
        if ((int)(Math.random() * 4) == 0) {
            special = true;
        }
        if (special == true) {
            this.setStr(this.getStr() * 2);
            System.out.println("SABER SPECIAL ATK");
        }
            super.attack(c);
            this.setStr(this.getStr()/2);
            special = false;
    }
}