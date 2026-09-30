abstract class APIClient {
    abstract void sendRequest();

    abstract String parseResponse();

}

public class GeminiApiClient extends APIClient {
    void sendRequest() {
        System.out.println("Sending request to gemini api");

    }

    String parseResponse() {
        return "gemini response parsed";
    }
     int   calculateResponseLength(String response){
        return response.length();
    }

    void showClientInfo() {
        System.out.println("API client is ready");
    }
   

    public static void main(String args[]) {
        GeminiApiClient g1 = new GeminiApiClient();
        g1.sendRequest();
        System.out.println(g1.parseResponse());
        String response =g1.parseResponse();
        System.out.println(g1.calculateResponseLength(response));
        g1.showClientInfo();
    }

}
