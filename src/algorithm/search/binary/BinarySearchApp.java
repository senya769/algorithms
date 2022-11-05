
package algorithm.search.binary;

public class BinarySearchApp {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binary_search(arr,6));
    }

    public static Integer binary_search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = (left + right)/2;
            int element = arr[mid];
            if(element == target){
                return mid;
            }
            if(element < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return null;
    }
}

