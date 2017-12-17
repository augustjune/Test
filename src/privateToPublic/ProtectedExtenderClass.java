package privateToPublic;

public class ProtectedExtenderClass extends WithProtectedMethodClass{

    public void publicProtectedMethod(){
        protectedMethod();
    }
}
