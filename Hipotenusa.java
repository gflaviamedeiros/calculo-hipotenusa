import java.util.Scanner;
import java.util.Random;

public class Hipotenusa{

	public static void main(String[] args) throws java.io.IOException{
		Scanner scanner = new Scanner(System.in);
		int catetoOposto, catetoAdjacente, cOposto2, cAdjacente2, valorMaximoTriangulo, maiorUnidadeMedida, opcao, verificarCatetos, quantidadeTriangulos;
		float hipotenusa, hipotenusa2;

		System.out.printf(" gerar triangulos imaginários aleatoriamente >> 1 \n inserir catetos para calculo de hipotenusa  >> 2 \n\n >> ");
		opcao = scanner.nextInt();

	  	switch(opcao){
		  	case 1:
		  		System.out.print("você deseja gerar catetos com no máximo quantas unidades de medida? ");
		  		maiorUnidadeMedida = scanner.nextInt();
		  		System.out.print("qual a quantidade de triangulos imaginários que você deseja criar? ");
		  		valorMaximoTriangulo = scanner.nextInt();

		  		if(maiorUnidadeMedida<1 | valorMaximoTriangulo<1){
		  			System.out.println("insira valores maiores ou iguais a 1.");
		  			main(args);
		  		}
		  		
		  		quantidadeTriangulos = 0;
		  		while(quantidadeTriangulos<valorMaximoTriangulo){
			  		verificarCatetos = 0;

			  		while(verificarCatetos == 0){
				  		catetoOposto = new Random().nextInt(maiorUnidadeMedida);
				  		catetoAdjacente = new Random().nextInt(maiorUnidadeMedida);
				  		
				  		if (catetoOposto > 0 & catetoAdjacente > 0) {
				  			cOposto2 = (int) Math.pow(catetoOposto, 2);
		  					cAdjacente2 = (int) Math.pow(catetoAdjacente, 2);
					        hipotenusa2 = (float) (cOposto2 + cAdjacente2);
					        hipotenusa = (float) Math.sqrt(hipotenusa2);

							System.out.println("\nH^2 = CO^2 + CA^2:");
							System.out.printf("H^2 = %d^2 + %d^2\n", catetoOposto, catetoAdjacente);
							System.out.printf("H^2 = %d + %d\n", cOposto2, cAdjacente2);
							System.out.printf("H^2 = %d + %d = %.2f\n", cOposto2, cAdjacente2, hipotenusa2);
							System.out.printf("H = %.2f\n\n", hipotenusa);
							verificarCatetos++;
						}
					}
					quantidadeTriangulos++;
				}
				catetoOposto=catetoAdjacente=cOposto2=cAdjacente2=0;
				break;

		  	case 2:
		  		System.out.printf("\nqual a quantidade de triangulos imaginários que você deseja criar? ");
		  		valorMaximoTriangulo = scanner.nextInt();

		  		if(valorMaximoTriangulo<1){
		  			System.out.printf("\ninsira valores maiores ou iguais a 1.");
		  			main(args);
		  		}

		  		quantidadeTriangulos = 0;
			  	while(quantidadeTriangulos<valorMaximoTriangulo){
					verificarCatetos = 0;
					while(verificarCatetos == 0){
						System.out.printf("\n\nCATETO OPOSTO: ");
				  		catetoOposto = scanner.nextInt();
				  		System.out.printf("\nCATETO ADJACENTE: ");
			  			catetoAdjacente = scanner.nextInt();
				  		if (catetoOposto > 0 & catetoAdjacente > 0) {
				  			cOposto2 = (int) Math.pow(catetoOposto, 2);
							cAdjacente2 = (int) Math.pow(catetoAdjacente, 2);
					        hipotenusa2 = (float) (cOposto2 + cAdjacente2);
					        hipotenusa = (float) Math.sqrt(hipotenusa2);

							System.out.printf("\n\nH^2 = CO^2 + CA^2:");
							System.out.printf("H^2 = %d^2 + %d^2\n", catetoOposto, catetoAdjacente);
							System.out.printf("H^2 = %d + %d\n", cOposto2, cAdjacente2);
							System.out.printf("H^2 = %d + %d = %.2f\n", cOposto2, cAdjacente2, hipotenusa2);
							System.out.printf("H = %.2f\n\n", hipotenusa);
							verificarCatetos++;
							quantidadeTriangulos++;
						} else {
							System.out.printf("\nvocê inseriu um valor inválido, tente novamente.\n\n\n");
						}
					}
				}
				break;

		  	default:
		  		System.out.println("o valor informado é inválido.");
		  		System.out.println("você deseja tentar novamente?");
		  		System.out.printf("TENTAR NOVAMENTE >> 0 \nENCERRAR >> Nº QUALQUER\n>>>>>>>>>>>>>>>>>>>>>>>");
		  		opcao = scanner.nextInt();
		  		if(opcao==0){
		  			main(args);
		  		}
	  	}
	}
}