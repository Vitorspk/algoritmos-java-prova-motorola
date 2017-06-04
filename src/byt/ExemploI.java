package byt;

public class ExemploI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		
		for(int i=0; i< 10; i++){
			ch = (char) ('A' + i);
			System.out.print(ch);
			
			ch = (char) ((int) ch | 32); // agora ch é maiuscula.
			System.out.print(ch + " ");
		}
	}

}
