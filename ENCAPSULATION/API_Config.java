public class API_Config {
    private String apiName;
    private String apiKey;
    private int requestLimit;
    public void setapiName(String apiName){
        this.apiName=apiName;
    }
    public void setapiKey(String apiKey){
        this.apiKey=apiKey;
    }
    public void setrequestLimit(int requestLimit){
        if(requestLimit>0){
            System.out.println("Accpet and store");

        }
        else if(requestLimit<=0){
            System.out.println("Invalid request limit");
        }
        else{
            System.out.println("Invalid value");
        }
        this.requestLimit=requestLimit;
    }
    public String getapiName(){
        return apiName;
    }
    public String getapiKey(){
        return apiKey;
    }
    public int getrequestLimit(){
        return requestLimit;
    }

    }
    

