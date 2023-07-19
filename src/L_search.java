import java.util.Scanner;

public class L_search {
    public static void main(String[] args) {
        int[] arr = {10,5,15,21,-3,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to Search : ");
        int item = sc.nextInt();
        System.out.println("Number Entered is "+item);
        LinearSearch(arr,item);
    }
    private static void LinearSearch(int []arr,int item){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item){
                System.out.println(item +" Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
