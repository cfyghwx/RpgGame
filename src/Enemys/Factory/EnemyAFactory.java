package Enemys.Factory;


import Enemys.Enemy;
import Enemys.EnemyA;

public class EnemyAFactory implements Factory {
    @Override
    public Enemy CreateEnemy() { return new EnemyA(); }
}
