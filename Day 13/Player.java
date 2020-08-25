package Day14Pack;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Player {
	private int playerid;
	private String name;
	private int runs;
	private String countryname;

	public Player(int playerid, String name, int runs, String countryname) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.runs = runs;
		this.countryname = countryname;
	}

	public int getPlayerid() {
		return playerid;
	}

	public String getName() {
		return name;
	}

	public int getRuns() {
		return runs;
	}

	public String getCountryname() {
		return countryname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> plist = new ArrayList<Player>();
		plist.add(new Player(1,"Virat",20000,"India"));
		plist.add(new Player(1,"Sachin", 10000, "India"));
		plist.add(new Player(2,"Smith", 5000, "Austerlia"));
		plist.add(new Player(1,"Dhoni",18000,"India"));
		plist.add(new Player(1,"Dravid",6000,"India"));
		plist.add(new Player(1,"Shahid",0,"Pak"));
		plist.add(new Player(1,"Decock",75000,"S.Africa"));
		plist.add(new Player(1,"Raina",60000,"India"));
		plist.add(new Player(1,"Pointing",40000,"Aus"));
		plist.add(new Player(1,"Rohit",100000,"India"));
		
		System.out.println("India Player in list");
		plist.stream().filter(refcn->refcn.getCountryname().equals("India")).forEach(refcn->System.out.println(refcn.getName()));
		
		int score =(int)(plist.stream().filter(refs->refs.getRuns()>5000).count());
		System.out.println("Total Player with score > 5000 :"+score);
	}

}
