
public class ExemploA {

	// TODO Auto-generated method stub

	void myMeth() {
		int i;

		for (i = 0; i < 10; i++) {
			if (i == 5)
				return;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ExemploA a = new ExemploA();
		a.myMeth();
	}

}
