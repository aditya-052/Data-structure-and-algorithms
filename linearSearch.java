import java.util.*;


public class linearSearch {

    public static int Searching(int number,int[] array){
        int index=0;
        while(index<array.length){
            if(number==array[index]){
                 return index;
             }
             else{
                 index++;
                
             }
        }
        return -1;
        
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
    for(int i=0;i<n;i++){
        System.out.print(array[i] +" ");
    }

    System.out.print("\nEnter the element you want to search in the Array : ");
    int num=sc.nextInt();
    int result=Searching(num,array);
    if(result!=-1){
        System.out.println("The index of element "+num+" is "+result);
    }
    else if(result==-1){
        System.out.println("Element not found in the array");
    
    }
    sc.close();
}
    
}