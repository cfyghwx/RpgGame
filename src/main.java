import People.Career.emei;
import People.Career.shaolin;
import People.Role;

public class main {
    public static void main(String args[]){
        emei e=new emei();
        shaolin s=new shaolin();
        String username="ϼ֮��ʫ������";
        Role r=Role.getRole(username,s);
        System.out.println(r.toString());

    }
}
