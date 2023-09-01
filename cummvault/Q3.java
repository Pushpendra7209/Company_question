
//no consecutive one should be in its binary number other wise check for next number
// example 6 = 1 1 0   ans = 8 = 1 0 0 0

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(answer(6));
    }
    
   public static int answer(int n)
   {
       String s = "    ";
       int a = n;
       while(n>0){
           s =n%2 + s;
           if(s.charAt(0)=='1' && s.charAt(0) == s.charAt(1)){
               return answer(a+1);
           }
           n /= 2;
       }
       return a;
   }
}
