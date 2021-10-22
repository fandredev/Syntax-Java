
public class TestConditional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int age = 11;
		int quantityPeoples = 13;
		boolean isAccompanied = quantityPeoples >= 2;

		if (age >= 18 || isAccompanied)
			System.out.println("Seja bem vindo!");
		else
			System.out.println("Infelizmente você não pode entrar.");

	}
}
