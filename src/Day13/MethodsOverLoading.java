package Day13;

public class MethodsOverLoading {
    public static void main(String[] args) {
        String result = ContactString("cydeo","School");
        System.out.println(result);
        result = ContactString("Java","Programming","Language");
        System.out.println(result);

    }
    public static String ContactString(String str1,String str2){
        return str1+" "+str2;

    }

    public static String ContactString (String str1,String str2,String str3){
        return str1+" "+str2+" "+str3+" ";

}
    public static String ContactString (String str1,String str2,String str3,String str4){
        return str1+" "+str2+" "+str3+" "+str4;

    }
}