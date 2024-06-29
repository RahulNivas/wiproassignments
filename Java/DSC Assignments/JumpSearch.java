
public class JumpSearch {
	
	static int jumpSearch(int[] arr,int x) {
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		for(int minstep = Math.min(step,n)-1;
				arr[minstep]<x;
				minstep=Math.min(step,n)-1) {
			prev = step;
			step+=(int)Math.floor(Math.sqrt(Math.sqrt(n)));
			if(prev>=n)
				return -1;
		}
		while(arr[prev]<x) {
			prev ++;
			if(prev == Math.min(step, n))
				return -1;
		}
		if(arr[prev]==x)
			return prev;
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4,5,6,44,52,66,85,93,100};
		int x=66;
		int result=jumpSearch(arr,x);
		System.out.println("\n Number: " + x + " at the index " + result);
		
	}

}