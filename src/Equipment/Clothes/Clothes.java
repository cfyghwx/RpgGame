package Equipment.Clothes;

import Equipment.Equipment;


public class Clothes extends Equipment {
    //����¼ģʽ������״̬
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
