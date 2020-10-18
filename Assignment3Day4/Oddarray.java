public class Oddarray {
    public static void main(String args[])
    {
        int arr[]={1,6,2,8,9};
        System.out.println("Odd elemnets of the array are:");
        for(int i=0;i<5;i++)
        {
            if(arr[i]%2!=0)
                System.out.print(arr[i]+" ");
        }
    }
}
