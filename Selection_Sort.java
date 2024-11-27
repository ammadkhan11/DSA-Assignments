public class Selection_Sort{
    public static void main(String[] args){
        int arr[] = {96, 24, 51, 13, 11};
        int length = arr.length;
        System.out.println("Unsorted Array");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<length-1; i++){
            int min_ind=i;
            for(int j=i+1; j<length; j++){
                if(arr[min_ind]>arr[j]){
                    min_ind=j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nSorted Array");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}