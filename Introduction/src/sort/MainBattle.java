package sort;

public class MainBattle {

	public static void main(String[] args) {
		 Pokemon raticate = new Pokemon("Raticate",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 raticate.iChooseYou(); 
		 bulbasaur.iChooseYou();
		 raticate.attack(bulbasaur, new Attack() {			
			public void attack(Pokemon target) {
				System.out.println("Super Fang is used!");
				int newHp = target.getHp()/2;
				target.setHP(newHp);
			}
		 });
		 
		 bulbasaur.attack(raticate, new Attack() {
			public void attack(Pokemon target) {
				System.out.println("Poison Poweder is used!");
				target.setPoisoned(true);
			}
		 }); 
		 
		 
	}
}
