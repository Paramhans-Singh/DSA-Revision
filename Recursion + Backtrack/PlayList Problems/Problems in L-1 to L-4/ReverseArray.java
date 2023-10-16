public class ReverseArray {
    public static void reverse(int i, int arr[]){
        int n = arr.length;

        if(i>=n/2)
        return;
        
        swap(i,n-i-1, arr);
        reverse(i+1, arr);
      } 

      public static void swap(int left, int right, int arr[]){
       int temp = arr[left];
       arr[left] = arr[right];
       arr[right]= temp; 
      }
      public static void main (String[] args){
          int arr[]= {1,2,3,4};

          for(int ele : arr){
            System.out.print(ele+" ");
          }

         reverse(0, arr);

         System.out.println();
         
          for(int ele : arr){
            System.out.print(ele+" ");
          }
      }
}
