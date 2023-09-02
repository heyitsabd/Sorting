public class SelectionSort {
    static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={2,4,1,5,6};
        
        int len = array.length;
        for(int i=0;i<len-1;i++){
            int smallest=i;
            for(int j=len-(len-i);j<len;j++){
                if(array[j]<array[smallest]){
                smallest=j;
                }
            }
            int temp=array[i];
            array[i]=array[smallest];
            array[smallest]=temp;
        }
        printArray(array);
    }

}
