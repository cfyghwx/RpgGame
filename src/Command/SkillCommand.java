package Command;

import Skill.Skill;

public class SkillCommand implements Command{
    private Skill skill;

    public SkillCommand(Skill skill){
        this.skill = skill;
    }

    @Override
    public void execute(String username) {
        skill.getSkill(username);
    }
}
