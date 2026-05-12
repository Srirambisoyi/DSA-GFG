package Arrays;

public class largestElementInArray {
    public static void main(String[] args) {
int[] arr = {-10, -3, -50, -1};
        System.out.println(findGreatestElment(arr));
    }
    public static int findGreatestElment(int arr[])
    {
        int num=Integer.MIN_VALUE;
        for(Integer i:arr)
        {
            if(i>num)
            {
                num=i;
            }
        }
return num;
    }
    
}
