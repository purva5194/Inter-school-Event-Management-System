/**
 * Created by spartans on 7/30/17.
 */
public class SchoolAdmin implements User {

    public String schoolName;

    public SchoolAdmin(String name){
        setUserName(name);
    }

    @Override
    public String getUserName() {
        return this.schoolName;
    }

    @Override
    public void setUserName(String name) {
        this.schoolName = name;
    }

}
