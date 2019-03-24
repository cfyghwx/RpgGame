package People.State;

import People.Role;

public class binsi implements State {
    @Override
    public int doATK(Role role) {
        return (int)(role.getAtk()*1.2);
    }
}
