public class Bubble_Sort{
    public static void main(String[] args){
        int arr[] = {9,8,7,7,5,1};
        int length = arr.length;
        System.out.println("Unsorted Array");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<length ; i++){
            for(int j=1; j<length; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("\nSorted Array");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}