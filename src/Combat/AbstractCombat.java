package Combat;

import Enemys.Enemy;
import People.Role;

public abstract class AbstractCombat {
    //中介者模式
    protected Enemy enemy;
    protected Role role;

    public AbstractCombat(Enemy enemy,Role role){
        this.enemy = enemy;
        this.role = role;
    }

    public abstract int roleAttackEnemy(int AtkRole);

    public abstract int EnemyAttackRole(int AtkEnemy);
}
