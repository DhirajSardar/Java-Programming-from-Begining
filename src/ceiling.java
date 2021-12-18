public class ceiling {
    public static void main(String[] args) {
        int [] array = {7,8,9,21,45,78};
        int ans = ceiling1(array,11);
        System.out.println("The index of  ceiling of target is :"+ans);
    }
    // this is the function for the binary search
    static  int ceiling1(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while (start<=end){
            if (target<arr[mid]){
                end = mid -1;
            }
             else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
    }

