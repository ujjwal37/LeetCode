class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i : sticks)
            pq.add(i);
        
            int costsum = 0;
        while(pq.size()>1){
            
            int n1 = pq.poll();
            int n2 = pq.poll();
        
            costsum += n1+n2;
            pq.add(n1+n2);   
        }
        
        return costsum;
        
    }
}