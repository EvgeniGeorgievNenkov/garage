package garage;

import java.util.ArrayList;

public class Parking {
	private String ime;
	private static final int mesta=4;
	private int broqch;
	private ArrayList<Kola>list;
	
	public Parking(String ime) {
		this.ime=ime;
		this.list=new ArrayList<>();
		this.broqch=0;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBroqch() {
		return broqch;
	}

	public void setBroqch(int broqch) {
		this.broqch = broqch;
	}

	public ArrayList<Kola> getList() {
		return list;
	}

	public void setList(ArrayList<Kola> list) {
		this.list = list;
	}
	
	//метод за вкарване
	public void vkarva(Kola k) {
		if(broqch<mesta) {
			list.add(k);
			broqch++;
		}
		else {
			System.out.print("Nqma mqsto");
		}
	}
	
	//метод за вкарване на регистрираната кола
	public void garirva() {
		while(broqch<mesta) {
			list.add(Kola.registraciq());
			broqch++;
		}
	}
	
	
	public String toString() {
		String x=getIme();
		for(int i=0;i<list.size();i++) {
			x=x+list.get(i);
		}
		return x;
	}
	

}
