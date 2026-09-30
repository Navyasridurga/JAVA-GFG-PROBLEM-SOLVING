public class API {
    public static void main(String args[]){
        API_Config a1=new API_Config();
        a1.setapiName("Gemini api");
        a1.setapiKey("navya123");
        a1.setrequestLimit(0);
        System.out.println(a1.getapiName());
        System.out.println(a1.getapiKey());
        System.out.println(a1.getrequestLimit());

    }
    
}
