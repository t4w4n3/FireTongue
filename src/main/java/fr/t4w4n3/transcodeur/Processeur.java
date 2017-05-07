package fr.t4w4n3.transcodeur;

public interface Processeur {
	public Object sortSteps(Object in);
	public Message process(Message message);
}
