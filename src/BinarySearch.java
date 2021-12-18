public  class BinarySearch {
    public static void main(String[] args) {
        int [] array = {7,8,9,21,45,78};
        int ans = binarysearch(array,8);
        System.out.println("The index of target is :"+ans);
    }
    // this is the function for the binary search
    static  int binarysearch(int []arr,int target){
        int start = 0;
         int end = arr.length-1;
         int mid = start+(end-start)/2;
         while (start<=end){
             if (target<arr[mid]){
                 end = mid -1;
             }
             if (target>arr[mid]){
                 start = mid+1;
             }
             else {
                 return mid;
             }
         }
   return -1;
    }
}