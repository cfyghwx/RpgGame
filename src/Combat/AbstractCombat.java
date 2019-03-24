package Combat;

import Enemys.Enemy;
import People.Role;

public abstract class AbstractCombat {
    //�н���ģʽ
    protected Enemy enemy;
    protected Role role;

    public AbstractCombat(Enemy enemy,Role role){
        this.enemy = enemy;
        this.role = role;
    }

    public abstract int roleAttackEnemy(int AtkRole);

    public abstract int EnemyAttackRole(int AtkEnemy);
}
