
public class TestConditional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int age = 20;
		int quantityPeoples = 1;

		if (age >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantityPeoples >= 2)
				System.out.println("Você pode entrar pois está acompanhado.");
			else
				System.out.println("Infelizmente você não pode entrar.");
		}

	}
}
