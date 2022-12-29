package FromVSCodeJava;

import java.util.*;

public class collectionProblem {
    public static void main(String[] args) {
//        m1();
        m2();
        m3();
    }

    private static void m3() {
        // List<Integer> ls= new ArrayList<>();
    }

    //find duplicate char from two arrays or from duplicate character from 2 string
    public static void m1(){
        String a = "tes";
        String b = "true";

        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        List<Character> ls1 = new ArrayList<Character>();

        for(int i=0; i<cha.length; i++){
            for(int j=0; j<chb.length; j++) {
                if(cha[i]==chb[j]){
                    ls1.add(cha[i]);
                }
            }
        }
        System.out.println(ls1);
    }

    public static void m2(){
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
