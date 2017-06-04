package byt;

public class ExemploK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "This is a teste";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		//codifica a msg;
		for(int i=0; i < msg.length(); i++){
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		}
		
		System.out.print("Encoded message: ");
		System.out.println(encmsg);
		
		//decodifica a mensagem
		for(int i=0; i < msg.length(); i++)
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
				
				System.out.print("Decoded message: ");
				System.out.println(decmsg);
	}

}
