public class StringBuilder {

    public static void main(String[] args) {
        java.lang.StringBuilder sb;
        sb = new java.lang.StringBuilder("hello");
        System.out.println(sb);
//we can get char at
        char ch = sb.charAt(0);
        System.out.println(ch);
//we can set
        sb.setCharAt(0,'d');
        System.out.println(sb);
//we can insert
        sb.insert(2,'y');


//        we can delete
        sb.deleteCharAt(3);

        sb.append('g');
        System.out.println(sb);

       int length =  sb.length();
        System.out.println(length);




    }
}
