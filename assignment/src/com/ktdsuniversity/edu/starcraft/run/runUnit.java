package com.ktdsuniversity.edu.starcraft.run;

import com.ktdsuniversity.edu.starcraft.unit.FirebatDAOImpl;
import com.ktdsuniversity.edu.starcraft.unit.GhostDAOImpl;
import com.ktdsuniversity.edu.starcraft.unit.MarineDAOImpl;
import com.ktdsuniversity.edu.starcraft.unit.MedicDAOImpl;

public class runUnit {
	
	public static void main(String[] args) {
		FirebatDAOImpl firebat = new FirebatDAOImpl();
		GhostDAOImpl ghost = new GhostDAOImpl();
		MarineDAOImpl marine = new MarineDAOImpl();
		MedicDAOImpl medic = new MedicDAOImpl();
		
		firebat.move();
		ghost.stop();
		marine.hold();
		medic.patrol();
		
	}
}
