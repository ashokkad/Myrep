package testproject;

public class Functions {

	public static void main(String[] args) {
		
		
		generaterandumno(35);

	}

public static void generaterandumno(int x){
	double d = Math.random()*10;
	x =(int)d ;
System.out.println(x);
}

}

