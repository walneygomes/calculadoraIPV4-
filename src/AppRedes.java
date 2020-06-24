import java.util.Scanner;

public class AppRedes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 192.168.1.1/24
		// 255.255.255.0
		// ^
		// ______________
		// 192.168.1.0 ip da rede

		// 111111111111111111111111.00000000 = /24 32-24=8 21-32=/11

		/// Scanner sr= new Scanner(System.in);
		// int mask=sr.nextInt();//24
		// int subtracao;
		String[] maskBinario = { "", "", "", "" };
		int pos = 0;

		for (int i = 0; i < 32; i++) {

			if (maskBinario[pos].length() == 8) {
				pos++;
			}
			maskBinario[pos] += "1";

		}
		pos = 0;
		int count = 0;
		while (count < maskBinario.length) {
			if (maskBinario[pos].length() != 8) {
				int sub;
				sub = 8 - maskBinario[pos].length();
				for (int j = 0; j < sub; j++) {

					maskBinario[count] += "0";

				}
			}
			count++;
			pos++;

		}
		int valor = Integer.parseInt(maskBinario[1]);

		System.out.println(valor + "." + maskBinario[1] + "." + maskBinario[2] + "." + maskBinario[3]);

		System.out.println(192 & 255);

		System.out.println(168 & 255);

		System.out.println(1 & 255);

		System.out.println(64 & 64);

	}

	int[] maskbinario={0,0,0,0};
	Scanner sr = new Scanner(System.in);
	int maska = sr.nextInt();//22
	




}
