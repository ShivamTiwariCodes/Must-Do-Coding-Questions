class solutions {
    
    long maxSubarraySum(int arr[], int n){
        
        long sum=arr[0], res = arr[0];
        
        for(int i=1; i<n; i++) {
            
            sum = Math.max(sum+ (long)arr[i], (long)arr[i]);
            res = Math.max(res, sum);
        }
        
        return res;
    }
}
