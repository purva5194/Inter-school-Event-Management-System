/**
 * Created by spartans on 7/30/17.
 */
public class Parent implements User{

    public String parentName;

    public  Parent(String name){
        setUserName(name);
    }

    @Override
    public String getUserName() {
        return this.parentName;
    }

    @Override
    public void setUserName(String name) {
        this.parentName = name;
    }
}
