package practise;

public class CaesarBreaker {
int  countLetters(String s) {
	int count[]=new int[26];
	int i;
	for(i=0;i<26;i++)
		count[i]=0;
	for(i=0;i<s.length();i++) {
		int index=s.charAt(i);
		if(index>='a'&&index<='z') {
			index-=97;
			count[index]++;
		}
		else if(index>='A'&&index<='Z') {
			index-=65;
			count[index]++;
		}
	}
	return maxIndex(count);
}
int  maxIndex(int values[]) {
	int i,max=0,index=0;
	for(i=0;i<26;i++) {
		if(values[i]>max) {
			index=i;
			max=values[i];
		}
	}
	return index;
}
String decrypt(String encrypted) {
	int key=getKey(encrypted);
	CaesarCipher cc=new CaesarCipher();
	return cc.encrypt(encrypted,26-key);
}
String halfOfString(String message,int start) {
	int i;
	String half="";
	for(i=start;i<message.length();i=i+2) 
			half+=Character.toString(message.charAt(i));
	return half;
}
int getKey(String s) {
	int max=countLetters(s);
	int key;
	if(max>=4)
		key=max-4;
	else
		key=26-4+max;
	return key;
}
String decryptTwoKeys(String encrypted) {

	String firstHalf=halfOfString(encrypted,0);
	String secondHalf=halfOfString(encrypted,1);
	int key1=getKey(firstHalf);
	int key2=getKey(secondHalf);
	System.out.println(key1+" "+key2);
	System.out.println(firstHalf+"\n"+secondHalf);
	CaesarCipher c=new CaesarCipher();
	String decrypted=c.encryptTwoKeys(encrypted, 26-key1,26- key2);
	return decrypted;
}

}
