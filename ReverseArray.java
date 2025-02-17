class ReverseArray {
    static void reverse(int arr[], int n, int k)
    {
        for (int i = 0; i < n; i += k)
        {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            /*System.out.println(left); 0 3 6
            System.out.println(right); 2 5 7
            System.out.println(n); 8 8 8*/

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
                /*System.out.println(left); 1 4 7
                System.out.println(right);// 1 4 6 */
            }
        }
    }
    
    // Driver method
    public static void main(String[] args)
    {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int n = arr.length;
    
        reverse(arr, n, k);
    
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}