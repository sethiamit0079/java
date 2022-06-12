package generics;

public class bubblesort {
	public static void main(String[] args) {
		int arr[]= {0,1,2,7,4,6,3};
		int flag = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				flag=0;
				if(arr[j]>arr[j+1]) {
					flag=1;
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
