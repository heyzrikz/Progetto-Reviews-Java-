import java.sql.Connection;
import java.sql.DriverManager;

public class ConnessioneDao {
	public Connection getConnection() throws Exception{
		try{
			String Driver="org.postgresql.Driver";
			String Url="jdbc:postgresql://localhost:5432/Reviews";
			String User="postgres";
			String Password="Ricardinho7";
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(Url,User,Password);
		return con;
		}catch(Exception e){
			System.err.println("Classe non trovata");}
		return null;
	   }
}
