package practise;
public class MAINS{
	public static void main(String [] args) {
		CaesarBreaker cb=new CaesarBreaker();
		String message="Aal uttx hm aal Qtct Fhljha pl Wbdl. Pvxvxlx!";
		System.out.println(cb.decryptTwoKeys(message));
		CaesarCipher cc=new CaesarCipher();
		System.out.println(cc.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?",15));
	}
}