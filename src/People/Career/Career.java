package People.Career;

import Equipment.Weapon.imp.SL_gun;
import People.Role;
import Skill.Skill;

import java.util.List;

public interface Career {

    Void getMpdescription();

    Role addshuxing(Role role);

    List<Skill> getSkilllistl();

}
