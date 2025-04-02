import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums=new Int();
        int target;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            num[i]=s.nextInt();
        }
        target=s.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((num[i]+num[j])==target && num[i]!=num[j])
                    System.out.print("["+i+","+j+"]");
            }
        }
    }
}
