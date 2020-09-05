public class Character {
    private int str;
    private int def;
    private int hp;
    private String name;
    private int attackStat;
    private int oppdefenseStat;
    private int maxHp;
    private int maxAtk;
    private int maxDef;
    public Character(String charName, int str, int def, int hp) {
        /*str = (int)(Math.random()*14) + 3;
        def = 20 - str;
        name = charName;
        hp = 20;*/
        name = charName;
        this.str = str;
        this.def = def;
        this.hp = hp;
        maxHp = hp;
        maxAtk = str;
        maxDef = def;
        System.out.println("Name : " + charName);
        System.out.println("Health = " + hp);
        System.out.println("Strength = " + str);
        System.out.println("Defense = " + def);
        System.out.println("--------------------------------");
    }

    public int getHp () {
        return hp;
    }

    public String getName() {
        return name;
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

    public void attack (Character opp) {
        attackStat = (int)(Math.random() * str) + 2;
        oppdefenseStat = (int)(Math.random() * opp.def) + 2;
        /*attackStat = str;
        oppdefenseStat = opp.def;*/
        System.out.println(name + "'s ATK:" + attackStat);
        System.out.println(opp.name + "'s DEF:" + oppdefenseStat);
        if (attackStat > oppdefenseStat) {
            opp.hp -= attackStat - oppdefenseStat;
        }
        System.out.println(opp.name + "'s Current Health = " + opp.hp);
        System.out.println("---------------");
    }

    public void LevelUp (Character c){
        hp = maxHp + 5;
        str = maxAtk +5;
        def = maxDef + 5;
    }
}