class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int st =0, end=0, sum=0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        while((st<n|| end<n) && sum != s) {
            
            if(st<n && sum<s) {
                sum += arr[st];
                st++;
            } else {
                sum -= arr[end];
                end++;
            }
        }
        
        if(sum == s) {          // second condition for which while loop terminate
            res.add(end+1);
            res.add(st);
        } else {                // first condition for which while loop terminate
            res.add(-1);
        }
        
        return res; 
    }
}