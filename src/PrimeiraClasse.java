
public class PrimeiraClasse {
	
	public static void main(String[] args) {
		System.out.println("Calculando media --->  " + calcularMedia());
	}
	
	private static float calcularMedia() {
		float num1 = 10.0f;
		float num2 = 7.5f;
		float num3 = 8.0f;
		float num4 = 7.0f;
		
		float media = (num1 + num2 + num3 + num4) / 4;
		
		return media;
	}	
}
