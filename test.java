public class test {
    static int ans(int[] arr, int target) {
        // First find the range
        int start = 0;
        // start with the box of 2
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]) {

            int temp = end+1; // This is a new start
            // end = previous end + (sizeof box)*2
            end = end+(end-start+1)*2;
            start= temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 30;
        System.out.println(ans(arr, target));
    }
}