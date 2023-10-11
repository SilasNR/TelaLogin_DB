import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static String usuario = "root";
    private static String senha = "1234";
    private static String host = "localhos";
    private static String porta = "3306";
    private static String db = "db_pessoas";
    
    public static Connection obtemConexao (){
    try {
        Connection c = DriverManager.getConnection(
        "jdbc:mysql://" + host + ":" + porta + "/" + db + "?user = " + usuario +
                "&password = "+ senha + "&useTimezone = ture &serverTimezone = America/São_Paulo");
        return c;
        
    }catch (Exception e){
        e.printStackTrace();
        return null;
    }
    }
    
}
