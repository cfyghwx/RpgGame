package Equipment.Weapon;

import Equipment.Equipment;

public class Weapon extends Equipment {
    protected int Atk = 0;

    protected String name;

    //����¼ģʽ
    Weapon saveState(){
        Weapon weapon = new Weapon();
        weapon.setAtk(getAtk());
        weapon.setName(getName());
        return weapon;
    }

    public void getWeapon(String username){
        System.out.println(username + "ʹ��" + getName() + "���й���");
    }

    @Override
    public int getAtk() {
        return Atk;
    }

    @Override
    public void setAtk(int atk) {
        Atk = atk;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
