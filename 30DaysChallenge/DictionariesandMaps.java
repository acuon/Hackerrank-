//

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Dictionary phone_dir = new Hashtable();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phone_dir.put(name,phone);    
        }
        //System.out.println(phone_dir.get("sam"));
        while(in.hasNext()){
            String s = in.next();
            //System.out.println(phone_dir.get(s));
            if(phone_dir.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s+"="+phone_dir.get(s));
            }
        }
        in.close();
    }
}
