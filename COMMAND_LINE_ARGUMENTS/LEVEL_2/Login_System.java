class Login_System{
    public static void main(String args[]){
        String userName=args[0];
        String role=args[1];
        if(role.equals("Developer")){
            System.out.println("Access Granted");
        }
        else{
            System.out.println("Acess Denied");~
        }
    }
}