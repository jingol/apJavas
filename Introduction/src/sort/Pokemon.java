package sort;

public class Pokemon {
	
	private int level;
	private int hp;
	private boolean poisoned;
	private String name;

	public Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		hp = 100;
		this.poisoned = false;
		
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			Attack.attack(target);
			System.out.println("The attack hit");
		}
		else{
			System.out.println("The attack missed");
		}
	}
	
	public void iChooseYou(){
		System.out.print(name);
	}
	
	public  String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		this.hp = newHP;
	}
	
	public int getHp(){
		return hp;
	}
	
	public void setPoisoned(boolean b){
		this.poisoned = b;
	}
	
	public void lapse(){
		if(this.poisoned){
			hp -= 15;
		}
	}
}
