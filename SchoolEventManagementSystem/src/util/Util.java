package util;

/**
 * Created by spartans on 8/3/17.
 */
public class Util {
    private static Util util = null;
    private Util(){}

    public static Util getInstance(){
        if(util == null){
            util = new Util();
        }
        return util;
    }

    public boolean notNull(Object value){
        return value != null;
    }
}
