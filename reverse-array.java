// reverse an array using two pointer, O(n) time complexity and in place reversal
public class MyClass {
    static void printArray(int[] arr){
        for(int i =0 ;i< arr.length;i++){
          System.out.print(arr[i]);
        }
      }
     static int[] reverseArray(int[] arr){
      int firstPointer = 0;
      int secondPointer = arr.length - 1;
      while(secondPointer > firstPointer){
          int temp = arr[firstPointer];
          arr[firstPointer] = arr[secondPointer];
          arr[secondPointer] = temp;
          firstPointer ++;
          secondPointer --;
      }
      return arr;
     }
    public static void main(String args[]) {
      int[] arr = {1,2,3,4};
      printArray(arr);
      System.out.println();
      int[] revArr = reverseArray(arr);
      printArray(revArr);
    }
}