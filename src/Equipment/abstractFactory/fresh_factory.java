package Equipment.abstractFactory;

import Equipment.Clothes.Clothes;
import Equipment.Clothes.imp.freshClothes;
import Equipment.Weapon.Weapon;
import Equipment.Weapon.imp.freshWeapon;

public class fresh_factory implements AbstractFactory{
    @Override
    public Weapon CreateWeapon() {
        return new freshWeapon();
    }

    @Override
    public Clothes CreateClothes() {
        return new freshClothes();
    }
}
