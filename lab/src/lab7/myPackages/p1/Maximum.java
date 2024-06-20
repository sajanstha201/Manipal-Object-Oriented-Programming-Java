package lab7.myPackages.p1;
public class Maximum {
	public static int max(int x,int y,int z) {
		if(x>y&&x>z)

			return x;

		else if(y>x&&y>z)

			return y;

		else

			return z;

	}

	public static double max(double x,double y,double z) {

		if(x>y&&x>z)

			return x;

		else if(y>x&&y>z)

			return y;

		else

			return z;

	}

	public static int max(int arr[]) {

		int i;

		int temp=arr[0];

		for(i=0;i<arr.length;i++)

			if(arr[i]>temp)

				temp=arr[i];

		return temp;

	}

	public static int max(int arr[][]) {

		int i,j,temp=arr[0][0];

		for(i=0;i<arr.length;i++) 

			for(j=0;j<arr[i].length;j++)

				if(arr[i][j]>temp)

					temp=arr[i][j];

		return temp;

	}

}