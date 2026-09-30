public class UserAccount {
    private String userName;
    private String  password;

    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPasswrd(String password){
        if(password.length()>=8){
            this.password=password;

        }
        else{
            System.out.println("Password too short");
        }
        
    }
    public String getPasswrd(){
        return password;

    }
    
}