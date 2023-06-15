import java.sql.*;
public class connTest {

    public static void main(String args[]) throws Exception{

        String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_Ristorante";
        String user = "freedb_Lillo";
        String pw = "JXa#57@@UThE6*k";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,user,pw);
        System.out.println("Connessione riuscita");
        con.close();
    }
}  