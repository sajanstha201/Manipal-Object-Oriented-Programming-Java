package practise;

public class CaesarCipher {
String encrypt(String input,int key) {
	String encrypted_value="";
	int i;
	String alphabetLower="abcdefghijklmnopqrstuvwxyz";
	String alphabetUpper=alphabetLower.toUpperCase();
	String alphabetOriginal=alphabetLower+alphabetUpper;
	alphabetLower=alphabetLower.substring(key)+alphabetLower.substring(0,key);
	alphabetUpper=alphabetUpper.substring(key)+alphabetUpper.substring(0,key);
	String alphabet=alphabetLower+alphabetUpper;
	for(i=0;i<input.length();i++) {
		if(input.charAt(i)>='a'&&input.charAt(i)<='z'||input.charAt(i)>='A'&&input.charAt(i)<='Z')
			encrypted_value+=Character.toString(alphabet.charAt(alphabetOriginal.indexOf(input.charAt(i))));
		else
			encrypted_value+=Character.toString(input.charAt(i));
	}
	return encrypted_value;
}
String encryptTwoKeys(String input,int key1,int key2) {
	String encrypted_value="";
	int i;
	String alphabetLower="abcdefghijklmnopqrstuvwxyz";
	String alphabetUpper=alphabetLower.toUpperCase();
	String alphabetOriginal=alphabetLower+alphabetUpper;
	
	
	alphabetLower=alphabetLower.substring(key1)+alphabetLower.substring(0,key1);
	alphabetUpper=alphabetUpper.substring(key1)+alphabetUpper.substring(0,key1);
	String alphabetkey1=alphabetLower+alphabetUpper;
	
	alphabetLower="abcdefghijklmnopqrstuvwxyz";
	alphabetUpper=alphabetLower.toUpperCase();
	alphabetLower=alphabetLower.substring(key2)+alphabetLower.substring(0,key2);
	alphabetUpper=alphabetUpper.substring(key2)+alphabetUpper.substring(0,key2);
	String alphabetkey2=alphabetLower+alphabetUpper;
	
	
	for(i=0;i<input.length();i++) {
		if(input.charAt(i)>='a'&&input.charAt(i)<='z'||input.charAt(i)>='A'&&input.charAt(i)<='Z') {
			if(i%2==0)
				encrypted_value+=Character.toString(alphabetkey1.charAt(alphabetOriginal.indexOf(input.charAt(i))));
			else
				encrypted_value+=Character.toString(alphabetkey2.charAt(alphabetOriginal.indexOf(input.charAt(i))));
				
		}

		else
			encrypted_value+=Character.toString(input.charAt(i));
	}
	return encrypted_value;
}
void testCaesar() {
	String message="";
	int key=0;
	String encrypted=encrypt(message,key);
	System.out.println("key is "+key+"\n"+encrypted);
}
}
