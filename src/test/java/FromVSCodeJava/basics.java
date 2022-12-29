package FromVSCodeJava;

public class basics {
    public static void main(String[] args) {
        basics m = new basics();
        m.m1();
        m2();
    }

    public void m1(){
        System.out.println("test 2");
        System.out.println("========");
    }

    public static void m2(){
        String t = "RUSHI";
         char[] ch= t.toCharArray();

         for(int i=ch.length-1; i>=0; i--){
             System.out.print(ch[i]);
         }
    }

    public static void m3(){

    }
}
