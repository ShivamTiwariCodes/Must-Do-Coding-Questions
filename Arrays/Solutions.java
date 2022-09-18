public class Solutions {

    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=0, j=0;
        
        while(i<n && j<m) {
            
            if(arr1[i] <= arr2[j]) {
                i++;
            } else {
                long key = arr2[j];
                int k = j+1;
                
                while(k<m && arr2[k]<arr1[i]) {
                    arr2[k-1] = arr2[k];
                    k++;
                }
                arr2[k-1] = arr1[i];
                arr1[i] = key;
            }
        }
    }
}
