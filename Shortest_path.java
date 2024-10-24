public class Shortest_path {
    public static int path(String str){
        int x = 0;
        int y = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'N'){
                y++;
            }else if(ch == 'S'){
                y--;
            }else if(ch == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int dis = (int)(Math.sqrt((x*x) + (y*y)));
        return dis;

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(path(path));
    }
}
