
package com.motorola.examples;

class VehicleRange {
	int passageiros;
	int capacidade;
	int mpg;

	int range(){
		return mpg * capacidade;
	}

	public static void main(String[] args) {
		VehicleRange minivan = new VehicleRange();
		VehicleRange sportCar = new VehicleRange();

		int range1, range2;

		//atribui valores a campos de minivan
		minivan.passageiros = 7;
		minivan.capacidade = 16;
		minivan.mpg = 21;

		sportCar.passageiros = 2;
		sportCar.capacidade = 14;
		sportCar.mpg = 12;

		range1 = minivan.range();
		range2 = sportCar.range();

		System.out.println(" Minivan pode carregar " + minivan.passageiros + " com  distancia de " + range1 + " kilometros");
		System.out.println(" SportCar pode carregar " + sportCar.passageiros + " com distancia de " + range2 + " kilometros");
	}
}

	



