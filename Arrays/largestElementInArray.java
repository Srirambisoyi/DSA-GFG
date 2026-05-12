package Arrays;

public class largestElementInArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,4,5324,5,555,5,55555};
        System.out.println(findGreatestElment(arr));
    }
    public static int findGreatestElment(int arr[])
    {
        int num=0;
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
