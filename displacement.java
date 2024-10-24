import java.util.*;
public class displacement {
    public static float dis(String str){
        int x = 0;
        int y = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
                x++;
            }else{
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }
    public static void main(String[] args) {
        String path = "SdddN";
        System.out.println(path.substring(3,4));
        System.out.println(dis(path));
    }
}
