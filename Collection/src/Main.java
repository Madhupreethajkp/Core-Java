
import java.util.ArrayList;
import java.util.*;

class Player{
	private String name;
	private String country;
	private String skill;
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s", name,country,skill);
	}
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
class PlayerBO{
	void displayAllPlayerDetails(ArrayList Player) {
		System.out.println("Player Details");
		for(int i=0;i<Player.size();i++) {
			System.out.println(Player.get(i).toString());
			
		}
		
		
	}
}
public class Main {
	public static void main(String[] args) {
		ArrayList<Player> al=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
System.out.println("Enter number of players");
int n=sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++) {
System.out.println("Enter the player name");
String name=sc.nextLine();
System.out.println("Enter the country name");
String country=sc.nextLine();
System.out.println("Enter the skill");
String skill=sc.nextLine();

Player p=new Player(name,country,skill);
al.add(p);

}
PlayerBO pb=new PlayerBO();
pb.displayAllPlayerDetails(al);


	}


}
