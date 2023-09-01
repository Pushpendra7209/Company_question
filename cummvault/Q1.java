// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// a b c b d
// a b c c d
// a b c d d
// a b c d e
import java.util.HashSet;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char ch [] = {'a','b','c','b','d'};
        System.out.println(Arrays.toString(result(ch)));
    }
    
    public static char[] result(char arr[])
    {
        while(true){
            int c = 0;
            int i = 0;
            HashSet<Character> hs = new HashSet<>();
            while(i<arr.length)
            {
                if(!hs.contains(arr[i])){
                    hs.add(arr[i]);
                }
                else{
                    char ch = arr[i];
                    c++;
                    while(i<arr.length)
                    {
                        if(arr[i] == ch){
                            arr[i] = (char)(arr[i]+1);
                        }
                        i++;
                    }
                }
                i++;
                
            }
            if(c == 0){
                break;
            }
        }
        return arr;
    }
}
