package Combat;

import Command.Invoker;
import Command.SkillCommand;
import Enemys.Enemy;
import People.Role;
import Skill.Skill;

public class CombatSystem extends AbstractCombat{
    public CombatSystem(Enemy enemy, Role role) {
        super(enemy, role);
    }

    @Override
    public int roleAttackEnemy(int AtkRole) {
        int hp = enemy.getHp();
        int hurt = AtkRole - enemy.getDef();
        if (hurt>0){
            enemy.setHp(hp - hurt);
        }
        if (enemy.getHp()>0){
            return 1;  //战斗继续
        }else {
            System.out.println("你杀死了对方！");
            return 0;  //敌人死亡，战斗结束
        }
    }

    @Override
    public int EnemyAttackRole(int AtkEnemy) {
        int hp = role.getHp();
        int hurt = AtkEnemy - role.getDef();
        if (hurt>0){
            role.setHp(hp - hurt);
        }
        if (role.getHp()>0){
            return 1;
        }else {
            System.out.println("对方杀死了你！");
            return 0;
        }
    }
}
