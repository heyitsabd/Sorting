public class Insertion_sort {
    static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array={7,6,3,5,2,1};
        for(int i=1;i<array.length;i++){    //Loop for unsorted part of array
            int current=array[i];
            int j=i-1;
            while(j>=0 && array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        printArray(array);
    }
}
