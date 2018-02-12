
//first sort the array then take 3 pointers one to start one to end
//and keep moving them according to the conditions O(n2)
public class FindTripletWithGivenSum {
	
	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static boolean findTriplet(int[] arr,int sum){
		sort(arr);
		int l,r;
		for(int i=0;i<arr.length-2;i++){
			l=i+1;
			r=arr.length-1;
			while(l<r){
				if(arr[i]+arr[l]+arr[r]==sum){
					System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
					return true;
				}else if(arr[i]+arr[l]+arr[r]<sum)
					l++;
				else
					r--;
			}
		}
		
		return false;
	} 
	
	public static void main(String[] args) {
		int[] arr = {3,6,5,7,9,1,2,4};
		System.out.println(findTriplet(arr, 10));
	}

}
