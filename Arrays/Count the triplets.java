import java.util.Arrays;

class Solutions {
    int countTriplet(int arr[], int n) {
        // code here
        
        Arrays.sort(arr);
        int res = 0;
        
        for(int i=0; i<n; i++) {
            
            int j=0, k=n-1;
            
            if(i == j) j++;
            if(i == k) k--;
            
            while(j<k) {
                
                if(arr[i] == arr[j] + arr[k]) {
                    res++;
                }
                
                if(arr[i] < arr[j]+arr[k]) {
                    k--;
                } else {
                    j++;
                }
                
                if(i == j) j++;
                if(i == k) k--;
            }
        }
        
        return res;
    }
}
