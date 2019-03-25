package Equipment.Clothes;

import Equipment.Equipment;


public class Clothes extends Equipment {
    //备忘录模式，保存状态
    Clothes saveState(){
        Clothes clothes = new Clothes();
        clothes.setDef(getDef());
        clothes.setName(getName());
        return clothes;
    }

    public void levelup(){
        this.Def += 10;
    }
}
