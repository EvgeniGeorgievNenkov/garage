package garage;

import java.util.Comparator;
import java.util.Scanner;

public class Kola implements Comparator<Kola>{
	public int compare(Kola o1, Kola o2) {
		int rez=o1.marka.compareTo(o2.marka);
		return rez;
		//ако го правя с Comparable
		//public int compareTo(Kola o){
		//int rez=this.marka.compareTo(o.marka);
		//return rez;
	}
	
	private String marka;
	private int godina;
	
	public Kola(String marka, int godina) {
		this.marka=marka;
		this.godina=godina;
		
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	
	//правя метод за регистрация
	public static Kola registraciq() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Dai marka");
		String marka=scan.nextLine();
		System.out.print("Dai godina");
		int godina=scan.nextInt();
		return new Kola(marka, godina);
	}
	
	
	
	public String toString() {
		return getMarka()+" "+getGodina();
	}

}
