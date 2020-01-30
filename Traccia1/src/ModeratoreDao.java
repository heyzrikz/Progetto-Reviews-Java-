import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeratoreDao extends 	ConnessioneDao{
	
	public boolean verificaAccesso(String username_moderatore,String password_moderatore) throws Exception{
		   Connection con=getConnection();
		  try{ 
			   String select="SELECT * FROM public.moderatore WHERE id_moderatore=? AND password_moderatore=? ;";
			   PreparedStatement CercaModeratore=con.prepareStatement(select);
		   CercaModeratore.setString(1, username_moderatore);
		   CercaModeratore.setString(2, password_moderatore);
		   ResultSet rs= CercaModeratore.executeQuery();
		   if(!rs.next()==false){
			   rs.close();
			  return true;}else return false;
		  }catch(Exception e){
			   System.err.println("Errore select");
			   return false;}}

	public boolean verificaPresenzaId(String username_moderatore) throws Exception{
		   Connection con=getConnection();
		  try{ 
			   String select="SELECT * FROM public.moderatore WHERE id_moderatore=? ;";
			   PreparedStatement CercaModeratore=con.prepareStatement(select);
		   CercaModeratore.setString(1, username_moderatore);
		   ResultSet rs= CercaModeratore.executeQuery();
		   if(!rs.next()==false){
			   rs.close();
			  return true;}else return false;
		  }catch(Exception e){
			   System.err.println("Errore select");
			   return false;}}
	


public void inserisciModeratoreDb(String nome,String cognome,String id,String password) throws Exception{
	   Connection con=getConnection();
	   try{
	PreparedStatement UpdateUtente=con.prepareStatement("INSERT INTO public.moderatore( id_moderatore, nome_moderatore , cognome_moderatore, password_moderatore) VALUES (?, ?, ?, ?);");
	UpdateUtente.setString(1, id);
	UpdateUtente.setString(2, nome);
	UpdateUtente.setString(3, cognome);
	UpdateUtente.setString(4, password);
	UpdateUtente.executeUpdate();}catch(SQLException sqe){
		System.err.println(sqe);}}	

}
