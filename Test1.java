package garage;

public class Test1 {

	public static void main(String[] args) {
		
		Kola k1=new Kola("Mercedes", 1999);
		Kola k2=new Kola("Mazda", 2002);
		Kola k3=new Kola("Toyota", 1998);
		
		Parking p1=new Parking("Radomir");
		
		//вкарвам колите
		p1.vkarva(k1);
		p1.vkarva(k2);
		p1.vkarva(k3);
		
		p1.garirva();
		
		System.out.print(p1.toString());

	}

}
