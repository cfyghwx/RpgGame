package Equipment.abstractFactory;

import Equipment.Clothes.Clothes;
import Equipment.Clothes.imp.superiorClothes;
import Equipment.Weapon.Weapon;
import Equipment.Weapon.imp.SL_gun;

public class Sl_factory implements AbstractFactory{
    @Override
    public Weapon CreateWeapon() {
        return new SL_gun();
    }

    @Override
    public Clothes CreateClothes() {
        return new superiorClothes();
    }
}
