package fr.t4w4n3.transcodeur;

public abstract class Codeur implements Processeur {
	protected Message messageIn;
	protected Message messageOut;
	protected Key key;
	
	public Codeur (Key key){
		this.key = key;
	}
	public Codeur (){
	}
	
	
}