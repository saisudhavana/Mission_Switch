class Solution {
    public boolean isAnagram(String s, String t)
     {
        boolean b = false;
         char s1[] = s.toCharArray();
         char t1[] = t.toCharArray();
         Arrays.sort(s1);
         Arrays.sort(t1);
         if(Arrays.equals(s1,t1))
          b=true;

          return b;
    }
}
