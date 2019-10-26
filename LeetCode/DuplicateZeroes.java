class Solution {
     public void duplicateZeros(int[] arr) {
   Queue<Integer> q = new LinkedList<>();
     int n = arr.length; 
    for(int x : arr){
        if(x == 0){
            q.add(x);
            q.add(0); 
        }
        else{
            q.add(x);
        }
    }
    int i = 0; 
    while(i < n){
        arr[i] = q.poll(); 
        i++; 
			}
	}
}