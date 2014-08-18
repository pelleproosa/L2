package MAIN;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class realistobjekt implements Serializable{

	private List <rida> realist=new ArrayList<>();
	
	public realistobjekt(List <rida> realist){
		super();
		this.realist=realist;
		
	}

	public List <rida> getRealist() {
		return realist;
	}

	public void setRealist(List <rida> realist) {
		this.realist = realist;
	}
	
	
}
