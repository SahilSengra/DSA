import java.util.Scanner;

public class B_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find : ");
        int item = sc.nextInt();
        int [] arr= {23,45,56,78,89,100};
        int size = arr.length;
        int result = BinarySearch(arr,0,size-1,item);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("the value "+ item+ " found at index : "+result);

    }
    public static int BinarySearch(int arr[],int left,int right,int item){
        if(right>=left){
            int mid = (left+right)/2;

            if (arr[mid] == item){
                return mid+1;
            }
            if(arr[mid]>item)
                return BinarySearch(arr, left, mid-1, item);
            else
                return BinarySearch(arr, mid+1, right, item);
        }
        else
            return -1;
    }
}
