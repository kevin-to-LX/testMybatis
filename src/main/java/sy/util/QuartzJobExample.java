package sy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuartzJobExample {

    public void run(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "★★★★★★★★★★★");
    }
}