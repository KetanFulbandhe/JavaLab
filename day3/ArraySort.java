
public class ArraySort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,3,1,4};
		System.out.println("Before sorting array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("After Sorting array:");
		//sorting logic
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//print sort array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
