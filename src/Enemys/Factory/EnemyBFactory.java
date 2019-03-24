package Enemys.Factory;

import Enemys.Enemy;
import Enemys.EnemyB;

public class EnemyBFactory implements Factory{
    @Override
    public Enemy CreateEnemy() { return new EnemyB(); }
}
