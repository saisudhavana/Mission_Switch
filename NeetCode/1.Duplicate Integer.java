///BruteForce
class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
     HashMap<Integer,Integer>  map = new HashMap<Integer,Integer>();
         boolean b =false;
           for(int i=0;i<nums.length;i++)
           {
                if(!map.containsKey(nums[i]))
                {
                    map.put(nums[i],1);
                }
                else 
                {
                  b=true;
                    break;
                }
           }
                 
          
          return b;
    }
}
///Optimized

class Solution {
    public boolean hasDuplicate(int[] arr) 
    {
        boolean b = false;
     Arrays.sort(arr);

     for(int i=0;i<arr.length-1;i++)
     {
        if(arr[i]==arr[i+1])
        {
            b=true;
            break;
        }
     }
     return b;
    }
}
