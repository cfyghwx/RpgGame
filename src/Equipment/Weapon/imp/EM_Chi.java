package Equipment.Weapon.imp;

import Equipment.Weapon.Weapon;

public class EM_Chi extends Weapon {
    public EM_Chi(){
        this.name = "��ü��";
        this.Atk = 200;
    }

    @Override
    public String toString() {
        return name;
    }
}
