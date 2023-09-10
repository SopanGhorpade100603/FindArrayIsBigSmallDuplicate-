import java.util.*;
public class ArrayIsSmallBigDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element in array");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Select your choice");
        System.out.println("1.Bigest number in array");
        System.out.println("2.Smallest number in array");
        System.out.println("3.Duplicate element in array");
        int choice=sc.nextInt();
        if(choice==1){
            int Bigest = BigestElement(arr);
            System.out.println("the Bigest element is "+Bigest);
        }
        else if(choice==2){
            int Smallest = SmallestElement(arr);
            System.out.println("the Smallest element is "+Smallest);
        }
        else if(choice==3){
            int Duplicate = Duplicateelement(arr);
            System.out.println("Duplicate element is "+Duplicate);
        }
    }
    public static int BigestElement(int[] arr) {
        int Bigest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Bigest) {
                Bigest = arr[i];
            }
        }
        return Bigest;
    }

    public static int SmallestElement(int[] arr) {
        int Smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< Smallest) {
                Smallest = arr[i];
            }
        }
        return Smallest;
    }
    public static int  Duplicateelement(int[] arr) {
        int Duplicate = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    Duplicate = arr[i];

                }
            }
        }
        return Duplicate;
    }
}
