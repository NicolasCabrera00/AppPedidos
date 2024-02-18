package Logica;

public class mainPrueba {
	
	public static String eliminarVocalesRodeadasPorConsonantes(String s) {
		
		if (s.length() < 3) {
			return s;
		}
		if (!esVocal(s.charAt(0)) && esVocal(s.charAt(1)) && !esVocal(s.charAt(2)) ) {
			
			return s.charAt(0) + eliminarVocalesRodeadasPorConsonantes(s.substring(1));
		}
	
			return s.charAt(0) + eliminarVocalesRodeadasPorConsonantes(resto(s));
	
		
	}
	private static String resto(String s) {
		return s.substring(1);
		 
	}
	
	
	public static boolean esVocal(char c) {
		
		String vocales = "aeiou";
		if (vocales.indexOf(c) == -1) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		

}
}
