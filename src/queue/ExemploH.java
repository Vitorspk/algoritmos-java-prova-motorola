package queue;

class ExemploH {

	char q[]; // este array contem a fila
	int putloc, getloc; // os indices put e get

	ExemploH(int size){
		q = new char[size]; //aloca memoria para a fila.
		putloc = getloc = 0;
	}

	// insere um caracter na fila
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}

	// obtem um caracter da fila.
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploH bigQ = new ExemploH(100);
		ExemploH smallQ = new ExemploH(4);
		char ch;
		int i;
		
		System.out.println("Using bigQ to store the alphabet.");
		
		//insere aluns numeros em bigQ
		for(i=0; i<26; i++)
			bigQ.put((char) ('A' + i));
		
		
		//recupera e exibe elementos de bigQ
		System.out.print("Contents of bigQ: ");
		for(i=0; i<26; i++){
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		System.out.println("\n");			
		System.out.println("Using smallQ to generate Erros: ");
		
		
		//Agora usa smallQ para gerar alguns Erros.
		for(i=0; i<5; i++){
			System.out.print("Attempting to store " + (char) ('Z' - i));
			
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		
		
		//mais erros em smallQ
		System.out.print("Contents of smallQ: ");
		for(i=0; i<5; i++){
			ch = smallQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
	}

}
