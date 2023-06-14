package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String substring = s.substring(0,8);

//        System.out.println(substring);

//
        for (int i = 0; i < s.length();i++){
            System.out.print(s.charAt(i) + " ");
        }
//        System.out.println();
//
//        for (char ch : s.toCharArray()) {
//            System.out.print(ch + " ");
//        }
//        System.out.println();
//
//        int index2 = s.indexOf("o",7);
//        int index = s.lastIndexOf("o");
//        System.out.println(index);

//        if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
