/*
QUESTION :: Implement Linear Search Algorithm
PRACTICE :: Searching Algo.
 */

public class linear_search{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
      
        System.out.print("Enter the size of basic_package.array :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the elements of array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\tYou entered : ");
        printArray(arr);

        System.out.print("\nEnter the element you want to search in the basic_package.array :: ");
        int key = sc.nextInt();
  
        System.out.println(key+" is found at index: "+linearSearch(arr, key));    
    }   
  
  public static void printArray(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + "   ");
    }
}    
