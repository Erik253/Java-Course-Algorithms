
public class TestaExcecao {

	public static void main(String[] args) {

		System.out.println("Inicio main");
		m1();

	}// main

	private static void m1() {
		System.out.println("Inicio M1");
		m2();

		System.out.println("Fim M1");

	}// m1

	private static void m2() {
		System.out.println("Inicio M2");

		int[] nums = new int[5];

		for (int i = 0; i < 6; i++) { // Estouro da array de proposito

			try {

				nums[i] = 2 * i;
				System.out.println("Nums [" + i + "] = " + nums[i]);

			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Problema: ArrayIndexOutOfboundsException :(");
				System.out.println(e); //printing a variavel do tipo ArrayIndexOutOfBoundsException
			} // catch

		} // for

		System.out.println("Fim M2");

	}// m2

}// class
