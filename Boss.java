public class Boss extends Character{
    public Boss (String name) {
    super(name, (int)(Math.random()*5) + 18, (int)(Math.random()*6)+16, 100);
}
    public void attack(Character c){
        boolean passive = false;
        if (this.getHp() <= 30 && this.getHp() >= 15) {
            passive = true;
        }
        if (passive == true) {
            System.out.println("BOSS PASSIVE ACTIVE");
            this.setHp(this.getHp() + 2);
        }
        super.attack(c);
        passive = false;
    }
}