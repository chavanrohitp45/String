public class Upper {
    public static String upper(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i) == ' ' && str.length()-1 > i) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello i am rohit";
        System.out.println(upper(str));
    }
}
