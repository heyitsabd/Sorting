import java.util.Scanner;

public class BubbleSort{
    static int i=0;
    static int temp;
    static void printArray(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size:- ");
        int s=sc.nextInt();
        int[] array=new int[s];
        System.out.println("Enter the array elements:- ");
        for( i=0;i<s;i++){
            array[i]=sc.nextInt();
        }
        for(i=0;i<s-1;i++){
            for(int j=0;j<s-i-1;j++){
        if(array[j]>array[j+1]){
            temp=array[j+1];
            array[j+1]=array[j];
            array[j]=temp;
        }
    }
    }
    printArray(array);
    }
}