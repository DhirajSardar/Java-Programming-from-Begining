public class floor {
    public static void main(String[] args) {
        int array[]={1,2,3,5,6,7,10};
        // we have to apply the binary search for finding the floor and ceiling
       // int n= args.length-1
       int ans= binarySearch(array,8);
        System.out.println(ans);
    }
    static int binarySearch(int arr[],int target) {
        int start =0;
        int end = arr.length - 1;
        int mid = start+ (end + start) / 2;
        for (start=0;start<=end;start++)
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        return mid;
    }

}
