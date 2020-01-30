import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class SegnalazioneDao extends ConnessioneDao{
  
	 public String getCodiceSegnalazioneDb()throws Exception{
			Connection con=getConnection();
			String ultimo_codice="0";
			PreparedStatement ultimo_codice_inserito=con.prepareStatement("SELECT codice_segnalazione FROM public.segnalazione ORDER BY CAST(codice_segnalazione AS integer) ASC;;");
			ResultSet rs = ultimo_codice_inserito.executeQuery();
			while(rs.next()){
					ultimo_codice=rs.getString("codice_segnalazione");
			}
			return ultimo_codice;}	
	 
	 public boolean verificaSegnalazione(String username_utente,String codice_recensione) throws Exception {
		 Connection con=getConnection();
		 PreparedStatement verify=con.prepareStatement("SELECT * FROM public.segnalazione AS S JOIN public.recensione AS R ON S.codice_recensione=R.codice_recensione WHERE R.username_utente=? AND S.codice_recensione=?;");
		verify.setString(1, username_utente);
		verify.setString(2, codice_recensione);
		 ResultSet rs= verify.executeQuery();
		if(rs.next()==false){
			return true;
		}else return false; }
	
	public void inserisciSegnalazioneDb(String codice_recensione,String titolo_recensione ,String descrizione_recensione , int voto ,String username_utente , String codice_attivita,Date data_recensione,String codice_segnalazione) throws Exception{
		   Connection con=getConnection();
		   try{
		PreparedStatement addReport=con.prepareStatement("INSERT INTO public.segnalazione( codice_recensione ,codice_segnalazione) VALUES (?, ?);");
		addReport.setString(1, codice_recensione);
		addReport.setString(2, codice_segnalazione);
		
		addReport.executeUpdate();}catch(SQLException sqe){
			sqe.printStackTrace();}}
	
	 public boolean verificaPresenzaSegnalazioni() throws Exception {
		 Connection con=getConnection();
		 PreparedStatement verify_request=con.prepareStatement("SELECT * FROM public.segnalazione");
		 ResultSet rs= verify_request.executeQuery();
		if(rs.next()==false){
			return false;
		}else return true; }
	
		public ArrayList<Recensione> getElencoRecensioniSegnalateDb() throws Exception{
			 Connection con= getConnection();
		
					PreparedStatement elenca=con.prepareStatement("SELECT * FROM public.recensione AS R JOIN public.segnalazione AS S ON S.codice_recensione=R.codice_recensione");
					 ArrayList <Recensione> elencoRecensioniSegnalate=new ArrayList<Recensione>();
					 ResultSet rs= elenca.executeQuery();
					 while(rs.next()){
						Recensione r =new Recensione();
						r.setCodice_attivita(rs.getString("codice_attivita"));
						r.setCodice_recensione(rs.getString("codice_recensione"));
						r.setDescrizione_recensione(rs.getString("descrizione_recensione"));
						r.setTitolo_recensione(rs.getString("titolo_recensione"));
						r.setVoto(rs.getInt("voto"));
						r.setUsername_utente(rs.getString("username_utente"));
						r.setData(rs.getDate("data_recensione"));
					 elencoRecensioniSegnalate.add(r);
				} 
					 rs.close();
					 return elencoRecensioniSegnalate;}	
		
		public void eliminaSegnalazioneDb(String codice_recensione) throws Exception{
			Connection con= getConnection();
			PreparedStatement elimina=con.prepareStatement("DELETE FROM public.segnalazione WHERE codice_recensione=? ;");
			elimina.setString(1, codice_recensione);
			elimina.executeUpdate();
			
		}
}
