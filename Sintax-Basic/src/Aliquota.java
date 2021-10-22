
public class Aliquota {
	public static void main(String[] args) {
		double salaryInitial = 2900.0;

		if (salaryInitial > 1900.0 && salaryInitial < 2800.0) {
			System.out.println("A sua aliquota é de 7%");
			System.out.println("Você pode deduzir até R$ 142");
		} else if (salaryInitial > 2800.0 && salaryInitial < 3751.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		} else {
			System.out.println("A sua aliquota é de 22.5%");
			System.out.println("Você pode deduzir até R$ 636");
		}
	}
}
