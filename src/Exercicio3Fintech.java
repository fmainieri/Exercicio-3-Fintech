import java.util.Scanner;
public class Exercicio3Fintech {
	public static void main(String[] args) {
		
		float [] [] Acoes = new float [4] [7];
		float [] Media = new float [4];
		float [] Maior = new float [4]; //{0,0,0,0};
		float [] Menor = new float [4];  //;{10,10,10,10};
	
		Scanner sc = new Scanner(System.in);
				
		for (int linha = 0; linha <= Acoes.length -1; linha++ ) {
		
			for (int coluna = 0; coluna <= Acoes[0].length -1; coluna++) {
				System.out.print("Digite o valor da ação da semana " + (linha +1) + " e dia " + (coluna +1)+" :");
				Acoes [linha] [coluna] = (float) sc.nextDouble();
				
				// Faz a somatoria das ações da semana
				Media [linha] = Media [linha] + Acoes [linha][coluna];
				
				//Verifica se é o maior valor de ação da semana
				if (Acoes[linha][coluna] > Maior [linha] || coluna == 0) {
					Maior[linha] = Acoes [linha][coluna];
				}
				
				//Verifica se é o Menor valor de ação da semana
				if (Acoes[linha][coluna] < Menor [linha] || coluna == 0) {
					Menor [linha] = Acoes [linha][coluna];
				}
				
			}
		}
		
		for (int linha = 0; linha <= Acoes.length -1; linha++ ) {
			System.out.println("=============================");
			System.out.println("Media das ações da semana " + (linha+1) +" :" + Media[linha]/7);
			System.out.println("Valor da Maior ação da semana " + (linha+1) +" :" + Maior[linha]);
			System.out.println("Valor da Menor ação da semana " + (linha+1) +" :" + Menor[linha]);
			System.out.println("");
		}
		
		float mediames = (Media[0]/7 + Media[1]/7 + Media[2]/7 + Media[3]/7)/4;
		System.out.println("=============================");
		System.out.println("Media das ações no mes :" + mediames);
	}
}
