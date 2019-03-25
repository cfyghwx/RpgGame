import Controller.GameController;
import Enemys.Enemy;
import Enemys.EnemyA;
import Enemys.Factory.EnemyFactory;
import People.Career.emei;
import People.Career.shaolin;
import People.Role;
import Skill.Skill;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        emei e=new emei();
//        shaolin s=new shaolin();
//        String username="Ï¼Ö®ÇðÊ«ÓðÁ¹ÁË";
//        Role r=Role.getRole(username,s);
//        System.out.println(r.toString());
//        r.setCurrenthp(10);
//        System.out.println(r.attack(r.getRoleSkill().get(0)));
        GameController gameController=new GameController();
        gameController.gogame();

    }
}
