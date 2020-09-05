public class Item{
    private int estus = 4;
    private int estusHeal = 20;
    private int ember = 1;
    private int str;
    private int def;
    private int hp;
    private int maxHp;
    private int maxAtk;
    private int maxDef;
    public int getHp () {
        return hp;
    }

    public void setHp (int hp){
        this.hp = hp;
    }

    public int getStr () {
        return str;
    }

    public void setStr (int str) {
        this.str = str;
    }

    public int getDef (){
        return def;
    }

    public void setDef (int def){
        this.def = def;
    }

    public int getMHP (){
        return maxHp;
    }    

    public int getMATK (){
        return maxAtk;
    }    

    public int getMDEF (){
        return maxDef;
    }

    public void setMHP (int maxHp){
        this.maxHp = maxHp;
    }

    public void setMATK (int maxAtk){
        this.maxAtk = maxAtk;
    }

    public void setMDEF (int maxDef){
        this.maxDef = maxDef;
    }

    public void useEstus(Character c){
        if (c.getMHP() == c.getHp()){
            System.out.println("Your Hp is full");
        }else if (estus > 0){
            c.setHp(c.getHp() + estusHeal);
            c.setDef(c.getDef() + 3);
            c.setStr(c.getStr()+3);
            if (c.getMHP() < c.getHp()){
                c.setHp(c.getMHP());
            }
            estus--;
            System.out.println("Name : " + c.getName());
            System.out.println("Health = " + c.getHp());
            System.out.println("Strength = " + c.getStr());
            System.out.println("Defense = " + c.getDef());
            System.out.println("You have " + estus + " Estus left");
            System.out.println();
        }else if(estus == 0) System.out.println("You Have No Estus");
    }

    public void useEmber(Character c){
        if(ember > 0){
            c.setHp(c.getMHP() * 2);
            c.setStr(c.getMATK() * 2);
            System.out.println(c.getName() + "'s Hp "+c.getHp());
            System.out.println(c.getName() + "'s Atk "+c.getStr());
            System.out.println(c.getName() + "'s Def "+c.getDef());
            ember--;
            System.out.println("You have " + ember+ " embers left");
            System.out.println();
        }else System.out.println("You Have No Embers");
    }
}
