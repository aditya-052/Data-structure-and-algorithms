import java.util.Scanner;

public class SelectionSort {

    public static int[] Sorting(int[] array){
        int sort=0;
        
        while(sort<array.length-1){
            int minIndex=sort;
            for(int i=sort+1;i<array.length;i++){
                if(array[i]<array[minIndex]){
                    minIndex=i;
                }
            }
            int temp= array[sort];
            array[sort]=array[minIndex];
            array[minIndex]=temp;
            sort++;
            System.out.println(array);
                
            }
            return array;
        }
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of the array :");
            int n=sc.nextInt();
            int[] array=new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++){
                int item=sc.nextInt();
                array[i]=item;
            }          
                 int[] result=Sorting(array);
                for(int i=0;i<result.length;i++){
        
        System.out.print(array[i]+" ");
        sc.close();
    }
}
    
}

