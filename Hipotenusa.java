/*
	esse é um programa que calcula a hipotenusa de um triangulo
	apartir de números pseudoaleatórios atribuidos a seus catetos.
	co - cateto oposto, o2 - cateto oposto ao quadrado;
	ca - cateto adjacente, a2 - cateto adjacente ao quadrado.

	além disso, foi implementado um método para que esse processo possa
	ser repetido quantas vezes for determinado, através de uma verificação if.
	a determinação de vezes está em uma constante chamada fimCont.
	
	para usar isso, deve tirar os comentários abaixo, é óbvio.
	main(args) é chamado para repetir o algoritmo novamente até a condição if ser falsa.
*/
import java.util.Random;
public class Hipotenusa{
	/*
	private static int cont = 0;
	private static int fimCont = 5;
	*/
	public static void main(String[] args){
		final int max_c = 100;
		int co = new Random().nextInt(max_c);
		int ca =new Random().nextInt(max_c);
		int o2 = (int) Math.pow(co, 2); int a2 = (int) Math.pow(ca, 2);
		float h2 = (float) (o2 + a2);
		
		if (co == 0 || ca == 0) {
            main(args); //se um dos 2 catetos for igual a 0, não existe um triangulo.
        }

		float h1 = (float) Math.sqrt(h2);

		System.out.println("H^2 = CO^2 + CA^2:");
		System.out.printf("H^2 = %d^2 + %d^2\n", co, ca);
		System.out.printf("H^2 = %d + %d\n", o2, a2);
		System.out.printf("H^2 = %d + %d = %.2f\n", o2, a2, h2);
		System.out.printf("H = %.2f\n", h1);

	/*	contar();

		if (cont<fimCont) {
			System.out.printf("\n\n\n");
			main(args); // chama o método principal para refazer o processo.
		}*/		
	}
	/*
	public static void contar() {
        cont++;
    }*/
}