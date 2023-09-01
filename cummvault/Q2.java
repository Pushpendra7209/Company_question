// Longest increasing subsequence

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int arr[] = {50 ,3 , 10 , 7 , 40 , 80};
        System.out.println(LIC(arr, arr.length));
    }
    public static int LIC(int arr[],int n){
        int lis[] = new int[n];
        for(int i=0; i<n; i++)
        {
            lis[i] = 1;
        }
        for(int i=1;  i<n; i++){
            for(int j = 0; j<i; j++){
                if(arr[i] > arr[j] && lis[i] < lis[i] +1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0; 
        for(int i = 0; i<n; i++)
        {
            if(lis[i] > max)
            {
                max = lis[i];
            }
        }
        return max;
    }
}
