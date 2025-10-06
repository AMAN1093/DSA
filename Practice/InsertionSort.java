package Practice;

class insertionSort {
    public static int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
        }
        return nums; 
    }
    public static int secondLargest(int nums[]){
        int secLargest= nums[nums.length-2];
        return secLargest;
    }

    public static void main(String args[]){
        int nums[]= {4, 2, 7, 5, 9, 1};
        System.out.println("the initial elemets of the array is :");
        for(int i=0 ;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int result[] = sortArray(nums);
        System.out.println("the sorted array is :");
        for( int i =0 ;i< result.length;i++){
            System.out.print(result[i]+", ");
        }
        System.out.println();

        int secondlargest = secondLargest(nums);
        System.out.println("the second largest element of the array is : "+ secondlargest);

    }
}
