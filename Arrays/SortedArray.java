package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr []={1,2,7,4,5};
        System.out.println(unSortedIndex(arr));

    }
    public static boolean sortedDescendingOrder(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    //3. Check Array is Strictly Increasing
    // [1,2,2,3] -> false
    
    public static boolean sortedOrStrictlyIncreasing(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    // 5. Find First Unsorted Position
    public static int unSortedIndex(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return i-1;
            }
        }
        return -1;
    }
// 6. Check if Array Can Become Sorted by Swapping One Pair
public static void swapUnsorted(int arr[])
{
    
    while (!sortedOrStrictlyIncreasing(arr)) {
        int unsL=unSortedIndex(arr);
    int unsR=unSortedIndexRight(arr);
    int temp=arr[unsL];
    arr[unsL]=arr[unsR];
    arr[unsR]=temp;

    }
    
}
public static int unSortedIndexRight(int arr[])
{
    for(int i=arr.length-1;i>1;i++)
    {
        if(arr[i]<arr[i-1])
        {
            return i;
        }
    }
    return -1;
}
}
