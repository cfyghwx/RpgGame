package Skill;

public abstract class Skill {
	 public int Atk = 0;

	 public int exp = 0;

	 public String name = "";

	public int useSkill() {
		int hurt = Atk*(exp/10+1);
		exp += 1;
		return hurt;
	}

	public void getSkill(String username) {
		System.out.println(username + "สนำรมห" + name);
	}

}
