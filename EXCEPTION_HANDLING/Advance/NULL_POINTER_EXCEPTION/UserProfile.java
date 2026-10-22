class UserProfile{
    void display(String name){
        System.out.println(name.toUpperCase());
    }
    public static void main(String args[]){
        UserProfile u1=new UserProfile();
        String name=null;
        
        try{
          u1.display(name);

            }
        
        
        catch(NullPointerException e){
            System.out.println("Username is missing");
        }
        finally{
            System.out.println("Profile check completed");
        }
    }
}

    
