public class Lancer extends Character {
    public Lancer(String name) {
        super(name, (int)(Math.random()*8) + 15, (int)(Math.random()*9) +11, 45);    
    }
    public void attack (Character c) {
        boolean special = false;
        if ((this.getHp()) <= 15) {
            special = true;
        }
        if (special == true) {
            System.out.println("LANCER SPECIAL ATK");
            super.attack(c);
        }
        super.attack(c);
        special = false;
    }
}