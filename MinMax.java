//Papaefthymiou Kosmas
public class MinMax {
    
public static void main(String args[]) {
int nums[] = { 99, -10, 100123, 18, -978,
5623, 463, -9, 287, 49 };
int min, max,i;
//code for max
max=-1;
    for(i=0;i<10;i++)
    {
        if(nums[i]>=max)
        {
            max=nums[i];
        }
    }

  //code for min
  min=0;
   for(i=0;i<10;i++)
    {
        if(nums[i]<=min)
        {
            min=nums[i];
        }
    }
  
System.out.println("Min and max: " + min + " " + max);
}
}
