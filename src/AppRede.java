import java.util.Scanner;

public class AppRede {

	public static void main(String[] args) {
		int[] maskbinario = { 0, 0, 0, 0 };
		Scanner sr = new Scanner(System.in);
		System.out.println("Qual a sua mask?");

		int maska = sr.nextInt();// mask = 22 exemplo

		int pos = 0;// posicao muda
		for (int i = 0; i < maskbinario.length; i++) {
			if (maska <= 8) {
				maskbinario[pos] = maska;
				break;

			} else if (maska > 8 && maska <= 32) {
				maska = maska - 8;
				maskbinario[pos] = 8;
				pos++;
			}

		}
		// elevar potencia
		for (int w = 0; w < maskbinario.length; w++) {
			maskbinario[w] = (int) Math.pow(2, maskbinario[w])-1;

		}

		System.out.println("Qual o seu ip?");
		Scanner sr1 = new Scanner(System.in);
		String ip = sr1.nextLine();

		int[] inteiros = { 0, 0, 0, 0 };

		inteiros[0] = Integer.parseInt(ip.substring(0, 3));
		inteiros[1] = Integer.parseInt(ip.substring(4, 7));
		inteiros[2] = Integer.parseInt(ip.substring(8, 11));
		inteiros[3] = Integer.parseInt(ip.substring(12, 15));

		// and logico

		int _1par = inteiros[0] & maskbinario[0];
		int _2par = inteiros[1] & maskbinario[1];
		int _3par = inteiros[2] & maskbinario[2];
		int _4par = inteiros[3] & maskbinario[3];
		System.out.print("Seu ip de rede é esse: ");

		System.out.print(_1par + "." + _2par + "." + _3par + "." + _4par);
	}

}
