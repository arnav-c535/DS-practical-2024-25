import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int arr[]={10,15,20,30,35,45,50};

        System.out.println("Enter a searching element: ");

        int s=sc.nextInt();

        int found=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==s){
                System.out.println("Element found at index : "+i);
                found = 1;
                break;
            }
        }
        if(found!=1)
            System.out.println("Element not found");



    }
}