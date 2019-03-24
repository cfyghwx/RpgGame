package Equipment.abstractFactory;

import Equipment.Clothes.Clothes;
import Equipment.Weapon.Weapon;

public interface AbstractFactory {
    Weapon CreateWeapon();

    Clothes CreateClothes();

}
