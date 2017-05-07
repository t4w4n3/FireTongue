package fr.t4w4n3.transcodeur;

public interface Transcodeur {

	public void setCodeur(Codeur codeur);

	public void setDecodeur(Decodeur decodeur);

	public Codeur getCodeur();

	public Decodeur getDecodeur();

}