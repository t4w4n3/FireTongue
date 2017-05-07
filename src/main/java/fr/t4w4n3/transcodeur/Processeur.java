package fr.t4w4n3.transcodeur;

public interface Processeur {
	public String sortSteps(String in);
	public Message process(Message message);
}
