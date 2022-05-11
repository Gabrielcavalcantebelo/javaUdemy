package fundamentos;
//nao entendi nada

public class Temperatura {
	
    public static void main(String[] args) {
	// (f - 32) x 5/9 = C 
     final double FATOR = 5.0 / 9.0;	
     final double AJUSTE = 32; 
    	
    	double fahrenheit = 212;
    	double celsius = (fahrenheit - AJUSTE) * FATOR;	
    	
    	fahrenheit = 212; 
    	celsius = (fahrenheit - AJUSTE) * FATOR; 
    	
    	System.out.println("A temperatura é  " + celsius + " C");
    	
	}
}
