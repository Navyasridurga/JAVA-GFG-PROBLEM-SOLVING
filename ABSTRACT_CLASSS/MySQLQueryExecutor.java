abstract class QueryExecutor{
    abstract void connect();
    abstract void execute();
    abstract String getQueryType();
    void disconnect(){
        System.out.println("Connection closed");
    }
}
public class MySQLQueryExecutor extends QueryExecutor {
    void connect(){
        System.out.println("Connected to Mysql");

    }
    void execute(){
        System.out.println("Executing select query");
    }
    String getQueryType(){
        return  "SELECT";
        
    }
    public static void main(String args[]){
        MySQLQueryExecutor m1=new MySQLQueryExecutor();
        m1.connect();
        m1.execute();
        System.out.println(m1.getQueryType());
        m1.disconnect();
    }
    
}
