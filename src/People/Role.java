package People;

import Equipment.Clothes.Clothes;
import Equipment.Weapon.Weapon;
import People.Career.Career;
import Skill.Skill;

import java.util.List;

public class Role {

    String Rolename;

    int hp;

    int mp;

    int Atk;//攻击力

    int def;//防御力

    int exp;//经验值

    int level;//等级

    int strength;//力量

    int intl;//智力

    int speed;//敏捷

    Career RoleCareer;

    Weapon RoleWeapon;

    Clothes RoleClothes;

    List<Skill> RoleSkill;



}
