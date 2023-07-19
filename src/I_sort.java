public class I_sort {

    public static void insertionSort(int[] arr){

        int n = arr.length;
        for(int i =1;i <n; i++){
            int temp = arr[i];
            int j = i -1;

            while(j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,4,20,24,2,10};

        insertionSort(arr);

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
