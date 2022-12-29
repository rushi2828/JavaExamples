package FromVSCodeJava;

public class StringProblems {
    public static void main(String[] args) {
//        m1();
//        m2();
//        m3();
    //    m4();
    //    m5();

//        m6("ab@cd#fg");
        // m7("I Am Not String");
        m8();
    }

    private static void m8() {
        String str = "Automation Testing" ;
        char[] ch = str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i]==' '){
                
            }
            System.out.print(ch[i]);
        }
    }

    //Find duplicate element from given string
    public static void m1() {
        String s = "rushikesh";
        int count;
        char[] sc = s.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            count = 1;
            for (int j = i + 1; j < sc.length; j++) {
                if (sc[i] == sc[j] && sc[i] != ' ') {
                    count++;
                    sc[j] = '0';
                }
            }
            if (count > 1 && sc[i] != '0') {
                System.out.print(sc[i] + "=" + count);
                System.out.println();
                System.out.println("=======");
            }
        }
    }

    //reverse string with StringBuilder
    public static void m2() {
        StringBuilder t = new StringBuilder("rushikesh");
        String rev = t.reverse().toString();
        System.out.println(rev);
    }

    //remove duplicate char from another String
    public static void m3(){
        String a = "test two";
        String b = "beol wne" ;
        int count;
        String ua = a.replace(" ", "");
        String ub = b.replace(" ", "");

        char[] ch_a = ua.toCharArray();
        char[] ch_b = ub.toCharArray();

        for(int i=0; i<ch_a.length; i++){
            count=1;
            for (int j=i+1; j<ch_b.length; j++){
                if(ch_a[i]==ch_b[j]){
                    count++;
                    ch_b[j]=0;
                }
                if(count>1 && ch_a[i] !=0){
                    System.out.print(ch_a[i]);
                    System.out.println();
                }
            }
        }
   }

    // Remove special character from given string.
    public static void m4(){
        String str = "ab@cd#ef%gh*";
        System.out.println("With special char--> "+str);
        String strNew = str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println("Without special char--> "+strNew);
        }    

    /*
     * Input = "This is a string";
     * output= "sihT si a gnirts";
     * */
    public static void m5(){
        String str = "This is a string";
        System.out.println("input String--->"+str);
        String[] starr =str.split(" ");
        String reverseWord="";
    
        for(String s: starr){
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            reverseWord += sb.toString()+ " ";            
        }
        System.out.println("output String-->"+reverseWord);
    }

    // Reverse String without special character i.e place of the special char is as it is after revesing the string
    public static void m6(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            if(!Character.isAlphabetic(ch[i])){
                i++;
            }
            else if(!Character.isAlphabetic(ch[j])) {
                j--;
            }
            else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        String rev = new String(ch);
        System.out.println("Original String: "+str);
        System.out.println("Reverse String : "+rev);
        }

        static void m7(String str){
//            String str = "I Am Not String";
            System.out.println("Input String->"+str);
            char[] ch = str.toCharArray();

            int size = ch.length;
            char[] resultArray = new char[size];

            for(int i=0 ; i<size; i++){
                if(ch[i] == ' '){
                    resultArray[i] = ' ';
                }
            }
            int j = resultArray.length-1;

            for (int i=0; i<ch.length; i++){
                if(ch[i]!=' '){
                    if(resultArray[j] == ' '){
                        j--;
                    }
                    resultArray[j] = ch[i];
                    j--;
                }
            }
            System.out.println("Reverse string-->" +String.valueOf(resultArray));
        }
        /*
public static void revString(){
        
String str = "I am Sharan 3595";
System.out.println("input String--->"+str);
String[] starr =str.split(" ");
String reverseWord="";
String reverseWord1="";

//output- I ma narahS 3953
for(String s: starr){
StringBuilder sb = new StringBuilder(s);
sb.reverse();
reverseWord += sb.toString();            
}
Sysout(reverseWord); 

//output- 3593 Sharan am I
for(int i=starr.length()-1; i>=0; i--){
StringBuilder sb = new StringBuilder(starr[i]);
sb.reverse();
reverseWord1 += sb.toString();
}
Sysout(reverseWord1);
        
        */
}
