
class ExemploB {
	
	int passageiros;
	int capacidade;
	int mpg;
	
	int range(){
		return mpg * capacidade;
	}
}

class retMeth{
	
	public static void main(String[] args) {
		
		ExemploB b = new ExemploB();
		ExemploB bb = new ExemploB();
		
		int range1 , range2;
		
		//atribui valores a campos de minivan
		b.passageiros = 7;
		b.capacidade = 16;
		b.mpg = 21;
		
		bb.passageiros = 2;
		bb.capacidade = 14;
		bb.mpg = 12;
		
		range1 = b.range();
		range2 = bb.range();
		
		System.out.println(" Minivan pode carregar " + b.passageiros + " com  distancia de " + range1 + " kilometros");
		System.out.println(" SportCar pode carregar " + bb.passageiros + " com distancia de " + range2 + " kilometros");	
	}
}

	



