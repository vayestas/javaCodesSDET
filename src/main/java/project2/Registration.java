package project2;

public class Registration {
    /*
    Create Registration Class in which you would have variables as
    email, userName and password that have an access scope only
    within its own class. After creating an object of the class user should
    be able to call methods and in each method separately pass values
    to set users email, username and password.
    Requirements:
    A. Valid email consider to be only yahoo
    B. Valid userName and password cannot be empty and should be of
    length larger than 6 characters. Also valid password cannot contain userName.
     */
    protected String email;
    protected String userName;
    protected String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    void printInfo(){
        System.out.println(email+" "+userName+" "+password);
    }
    public void printEmail(String email){

        if(email.contains("@yahoo")){
            this.email=email;
        }else{
            System.out.println("email is not valid");
        }
    }
    public void printUserName(String userName){
        if(!userName.isEmpty() && userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("username is not valid");
        }
    }
    public void printPassword(String password){
        if(!password.isEmpty() && password != userName
                && password.length()>6){
            this.password=password;
        }else{
            System.out.println("password is not valid");
        }
    }

    public static void main(String[] args) {
        Registration r=new Registration("javalover33@yahoo.com","edmj5","mountains88");
        r.printInfo();
    }
}
