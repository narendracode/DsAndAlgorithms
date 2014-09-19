public class BinarySearch{
   static int binarySearch(int[] arr,int key,int low, int high){
        int middle;
        if(low>high)
           return -1;
        middle = (low+high)/2;
        if(arr[middle]==key)
           return middle;

        if(arr[middle]>key)
           return (binarySearch(arr,key,low,middle-1));
        else
           return (binarySearch(arr,key,middle+1,high));

   }//binarySearch()
   public static void main(String[] args){
        int[] arr = {1,5,6,11,22,28,155,233,250,287,293,311,350,360,389,398,400,405,450,485,500,501,502,555,577,578,601,666,999};
        int result = binarySearch(arr,502,0,arr.length-1);
        System.out.println("Result:"+result);
   }
}
