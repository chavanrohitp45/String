public class largest_string {
    public static String largest(String lst[]){
        String largest = lst[0];
        for(int i = 1;i<lst.length;i++){
            if(largest.compareTo(lst[i]) < 0){
                largest = lst[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String lst[] = {"apple", "mango", "zuava"};
        System.out.println(largest(lst));
    }
}
