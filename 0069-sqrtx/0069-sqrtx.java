class Solution {
    public int mySqrt(int x) {
         
         if(x<2) return x;
          long s=1,e=x;
          long ans=0;
         while(s<=e){
           long mid=(s+e)/2;
           long sq=mid*mid;
          if(sq==x){
            return (int) mid;
          }
          else if(sq<x){
            ans=mid;
            s= mid+1;
          }
          else{
            e=mid-1;
          }
         }
         return (int) ans;
    }
}