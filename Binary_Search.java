public class Binary_Search {
    public static int search(int array[], int target){
        int length = array.length;
        int low = 0;
        int high = length-1;
        while(low<=high){
            int mid = low + (high - low) /2;
            if(target > array[mid]){
                low = mid + 1;
            }
            
            if(target < array[mid]){
                high = mid - 1;
            }

            if(target == array[mid]){
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] array={28, 37, 44, 66};
        int target = 66;
        int result = search(array, target);

        if(result != -1 ){
            System.out.println(target + " found at index " + result);
        }
        else{
        System.out.println(target + "Not found in the givn array");
        }
    }
}
