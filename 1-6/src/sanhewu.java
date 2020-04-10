import com.sun.javaws.jnl.RContentDesc;

import java.util.Scanner;

public class sanhewu {
    public static void main(String[] args) {
        for(int x = 0;x < 100;x++){
            if(x % 3 == 0 || x % 5 == 0)
                continue;
            else{
                System.out.println(x);
            }
        }

    }
}
