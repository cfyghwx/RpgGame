package People.State;

import People.Role;

public class Health implements State{


    @Override
    public int doATK(Role role) {
        return role.getAtk();
    }
}
