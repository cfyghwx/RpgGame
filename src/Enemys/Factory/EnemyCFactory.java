package Enemys.Factory;

import Enemys.Enemy;
import Enemys.EnemyC;

public class EnemyCFactory implements Factory{
    @Override
    public Enemy CreateEnemy() { return new EnemyC(); }
}
