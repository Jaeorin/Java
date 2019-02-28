package report_190227;

class Team{
	
	public Team(String name) {
		this.name = name;
	}
	
	String name;
	String player[] = new String[4];

	public void getPlayer(int number, String name) {
		player[number] = name;
	}
	
	public void infomation() {
		System.out.println("Team name : " + name);
		System.out.println();
		for(int count=0; count<player.length; count++) {
			System.out.println("name   : " + player[count] + " (number " + (count+1) + ")");
			System.out.println();
		}
	}

}
