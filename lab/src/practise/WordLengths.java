package practise;

public class WordLengths {
	public static void main(String [] args) {
		WordLengths a=new WordLengths();
		a.testCountWordLengths();
	}
	int count[];
	void testCountWordLengths() {
		String resource="  Laer. My necessaries are embark'd. Farewell And, sister, as the winds give benefit";
		count=new int[100];
		countWordLengths(resource,count);
		int index=indexOfMax(count);
		int i;
		System.out.println(index);
		for(i=1;i<count.length;i++) {
			System.out.println(i+" length: "+count[i]+"  word\n");
		}
	}
	int indexOfMax(int values[]) {
		int index=0;
		int max=-1,i;
		for(i=1;i<values.length;i++) {
			if(values[i]>max) {
				max=values[i];
				index=i;
			}
		}
		return index;
	}
void countWordLengths(String resource,int count[]) {
	int i;
	for(i=0;i<count.length;i++)
		count[i]=0;
	int length=0;
	for(i=0;i<resource.length();i++) {
		if(resource.charAt(i)==','&&resource.charAt(i+1)=='"') {
			length++;
			continue;
		}
		char ch=resource.charAt(i);
		if(ch==' '||ch==','||ch=='"'||ch=='.'){
			count[length]++;
			length=0;
			continue;
		}
		length++;
	}
	count[length]++;
}
}
