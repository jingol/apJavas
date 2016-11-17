package caveExplorer;

public class GameStartEvent implements Event {

	public static final String[] SEQ_1 = {
			"A spike-haired guy with orange pants flies up to you",
			"Have you arrived to save us from the treacherous Buu?",
			"We need your help."};
	public static final String[] SEQ_2 = {"Great, I will be busy meditating on my super yellow verson while"
			+ "you figure out where Buu is", "Kaaaa,maaaaay......","By the way, here's a map."};
	
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	
	public void play() {
		readSequence(SEQ_1);
		CaveExplorer.print("Will you help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes") < 0){
			CaveExplorer.print("Please say yes. I beg you!");
		}
		
		readSequence(SEQ_2);
		CaveExplorer.inventory.setMap(true);

	}


	public static void readSequence(String[] seq) {
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print("- - - Please press enter - - -");
			CaveExplorer.in.nextLine();
		}
		
	}

}
