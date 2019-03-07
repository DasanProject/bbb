package ssm.controller;

public class test {
    static boolean foo(char c){
        System.out.println(c);
     return  true;
    }
    public static void main(String[] args) {
       int i=0;
       for(foo('A');foo('B')&&(i<2);foo('C')){
           i++;
           foo('D');
       }
       String str1="hello";
       String str2="he"+new String("llo");
    }
}
