import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RecensioneDao extends ConnessioneDao{

	public boolean verificaInserimentoDbRecensione(String username , String codice_attivita) throws Exception{
		   Connection con=getConnection();
		  try{ 
			   String select="SELECT * FROM public.recensione WHERE username_utente=? AND codice_attivita=?;";
			   PreparedStatement cercaRecensione=con.prepareStatement(select);
		   cercaRecensione.setString(1, username);
		   cercaRecensione.setString(2, codice_attivita);
		   ResultSet rs= cercaRecensione.executeQuery();
		   if(!rs.next()==false){
			   rs.close();
			  return false;
			   
		  }
		   else return true;
		  }catch(Exception ex){
			   System.err.println("Errore Verifica Inserimento Recensione db");
			   return true;
		   
		   }}
	public void inserisciRecensioneDb(String codice_recensione,String titolo_recensione ,String descrizione_recensione , int voto ,String username_utente , String codice_attivita,Date data_recensione) throws Exception{
		   Connection con=getConnection();
		   try{
		PreparedStatement addReview=con.prepareStatement("INSERT INTO public.recensione( codice_recensione , titolo_recensione , descrizione_recensione , voto , username_utente, codice_attivita, data_recensione) VALUES (?, ?, ?, ?, ? ,?,?);");
		addReview.setString(1, codice_recensione);
		addReview.setString(2, titolo_recensione);
		addReview.setString(3, descrizione_recensione);
		addReview.setInt(4, voto);
		addReview.setString(5, username_utente);
		addReview.setString(6, codice_attivita);
		addReview.setDate(7, data_recensione);
		addReview.executeUpdate();}catch(SQLException sqe){
			sqe.printStackTrace();
			
		}}
	 public String getCodiceRecensioneDb()throws Exception{
			Connection con=getConnection();
			String ultimo_codice="0";
			PreparedStatement ultimo_codice_inserito=con.prepareStatement("SELECT codice_recensione FROM public.recensione ORDER BY CAST(codice_recensione AS integer) ASC;;");
			ResultSet rs = ultimo_codice_inserito.executeQuery();
			while(rs.next()){
					ultimo_codice=rs.getString("codice_recensione");
			}
			return ultimo_codice;	
		}	
	 
	 public ArrayList<Recensione> getElencoRecensioni(String cod_attivita) throws Exception{
		 Connection con= getConnection();
		 try {
			PreparedStatement elenco=con.prepareStatement("SELECT * FROM public.recensione WHERE codice_attivita=? ORDER BY voto DESC; ;");
			 ArrayList <Recensione> elencoRecensioni=new ArrayList<Recensione>();
			 elenco.setString(1, cod_attivita);
			 ResultSet rs= elenco.executeQuery();
			 while(rs.next()){
				Recensione r =new Recensione();
				r.setCodice_attivita(rs.getString("codice_attivita"));
				r.setCodice_recensione(rs.getString("codice_recensione"));
				r.setDescrizione_recensione(rs.getString("descrizione_recensione"));
				r.setTitolo_recensione(rs.getString("titolo_recensione"));
				r.setVoto(rs.getInt("voto"));
				r.setUsername_utente(rs.getString("username_utente"));
				r.setData(rs.getDate("data_recensione"));
				 elencoRecensioni.add(r);
			 }
			 rs.close();
			 return elencoRecensioni;
		} catch (SQLException e) {
			System.err.println("Errore getElencoRecensioni");
			return null;}}
	 
	 public void eliminaRecensioneDb(String codice_recensione) throws Exception{
		 Connection con=getConnection();
		 PreparedStatement elimina= con.prepareStatement("DELETE FROM public.recensione WHERE codice_recensione=?;");
		 elimina.setString(1, codice_recensione);
		 elimina.executeUpdate();
		 
	 }
	
}
