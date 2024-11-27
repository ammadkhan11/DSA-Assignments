public class Linear_Search {
    public static int search(int array[], int target){
        int length = array.length;
        for(int i = 0; i<length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array={98, 37, 44, 66};
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
