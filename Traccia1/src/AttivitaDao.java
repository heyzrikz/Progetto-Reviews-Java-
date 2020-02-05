import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class AttivitaDao extends ConnessioneDao{
	
 public byte[] getImmagineDb(String codice_attivita_cercata) throws Exception{
	Connection con=getConnection();
	 CallableStatement get = con.prepareCall("{?=CALL get_pic(?)}");    
	    get.setString(2, codice_attivita_cercata);
	    get.registerOutParameter(1, Types.BINARY);      
	    get.execute();
	    byte[] b = get.getBytes(1);
	    return b;}
 
 public boolean verificaCategoriaAttivitaNelDb(String posizione,String categoria) {
		try {
			Connection con= getConnection();
			 String select="SELECT * FROM public.attivita WHERE posizione_attivita=? AND categoria_attivita=?;";
			   PreparedStatement cercaAttivita=con.prepareStatement(select);
		   cercaAttivita.setString(1, posizione);
		   cercaAttivita.setString(2, categoria);
		   ResultSet rs= cercaAttivita.executeQuery();
		   if(!rs.next()==false){
			   rs.close();
			  return true;
		  }else return false;
		   
			} catch (Exception e) {
			e.printStackTrace();return false;}}
 
 public ArrayList<Attivita> getElencoAttivitaDb(String posizione , String categoria) throws Exception{
	 Connection con= getConnection();
	 try {
		PreparedStatement elencare_attivita=con.prepareStatement("SELECT * FROM public.attivita WHERE posizione_attivita=? AND categoria_attivita=? ");
		 ArrayList <Attivita> elenco_attivita=new ArrayList<Attivita>();
		 elencare_attivita.setString(1, posizione);
		 elencare_attivita.setString(2, categoria);
		 ResultSet rs= elencare_attivita.executeQuery();
		 while(rs.next()){
			Attivita a =new Attivita();
			a.setNome_attivita(rs.getString("nome_attivita"));
			a.setPosizione_attivita(rs.getString("posizione_attivita"));
			a.setVia_attivita(rs.getString("via_attivita"));
			a.setCategoria_attivita(rs.getString("categoria_attivita"));
			a.setSottocategoria_attivita(rs.getString("sottocategoria_attivita"));
			a.setSottocategoria_attivita_2(rs.getString("sottocategoria_seconda_attivita"));
			a.setDescrizione_attivita(rs.getString("descrizione_attivita"));
			a.setCodice_attivita(rs.getString("codice_attivita"));
			a.setUsername_utente(rs.getString("username_utente"));
			 elenco_attivita.add(a);
		 }
		 rs.close();
		 return elenco_attivita;
	} catch (SQLException e) {
		System.err.println("Errore getElencoAttività");
		return null;}}

	public Attivita cercaAttivitaDb(String posizione_attivita,String categoria_attivita ,String nome_attivita) throws Exception{
		Connection con= getConnection();
		PreparedStatement cerca_attivita=con.prepareStatement("SELECT * FROM public.attivita WHERE posizione_attivita=? AND categoria_attivita=? AND nome_attivita=?");
		cerca_attivita.setString(1, posizione_attivita);
		cerca_attivita.setString(2, categoria_attivita);
		cerca_attivita.setString(3, nome_attivita);
		ResultSet rs=cerca_attivita.executeQuery();
		Attivita a=new Attivita();
		while (rs.next()){
			a.setNome_attivita(rs.getString("nome_attivita"));
			a.setPosizione_attivita(rs.getString("posizione_attivita"));
			a.setVia_attivita(rs.getString("via_attivita"));
			a.setCategoria_attivita(rs.getString("categoria_attivita"));
			a.setSottocategoria_attivita(rs.getString("sottocategoria_attivita"));
			a.setSottocategoria_attivita_2(rs.getString("sottocategoria_seconda_attivita"));
			a.setDescrizione_attivita(rs.getString("descrizione_attivita"));
			a.setCodice_attivita(rs.getString("codice_attivita"));
			a.setUsername_utente(rs.getString("username_utente"));	}
		    return a;}
	
	public String getCodiceAttivitaDb()throws Exception{
		Connection con=getConnection();
		String ultimo_codice="0";
		PreparedStatement ultimo_codice_inserito=con.prepareStatement("SELECT codice_attivita FROM public.attivita ORDER BY CAST(codice_attivita AS integer) ASC;;");
		ResultSet rs = ultimo_codice_inserito.executeQuery();
		while(rs.next()){
				ultimo_codice=rs.getString("codice_attivita");}
		return ultimo_codice;}
	
	public boolean verificaAggiuntaAttivita(String nome_attivita,String posizione_attivita) throws Exception{
		Connection con=getConnection();
		try {
			PreparedStatement verAggiuntaAttivita=con.prepareStatement("SELECT * FROM public.attivita WHERE nome_attivita=? AND posizione_attivita=? ;");
			verAggiuntaAttivita.setString(1, nome_attivita);
			verAggiuntaAttivita.setString(2, posizione_attivita);
			ResultSet result= verAggiuntaAttivita.executeQuery();
			if(result.next()==false){
				return true;
			}else return false;
			} catch (SQLException e) {
			System.err.println("Problema verifica SQL");
			return false;}}	
	
	public void InserisciAttivita(String nome_attivita, String posizione_attivita ,String via_attivita ,String categoria_attivita, String sottocategoria_attivita, String seconda_sottocategoria_attivita, String descrizione_attivita, String codice_attivita,String codice_username,File immagine) throws Exception{
		 Connection con=getConnection();
		 try {
			 PreparedStatement InserisciAttivita=con.prepareStatement("CALL add_pic(?,?,?,?,?,?,?,?,?,?,?)");
			 InserisciAttivita.setString(1, nome_attivita);
			 InserisciAttivita.setString(2, posizione_attivita);
			 InserisciAttivita.setString(3, via_attivita);
			 InserisciAttivita.setString(4, categoria_attivita);
			 InserisciAttivita.setString(5, sottocategoria_attivita);
			 InserisciAttivita.setString(6, seconda_sottocategoria_attivita);
			 InserisciAttivita.setString(7, descrizione_attivita);
			 InserisciAttivita.setString(10, codice_attivita);
			 InserisciAttivita.setString(8, codice_username);
			 InserisciAttivita.setFloat(9, 0);
			 InserisciAttivita.setBinaryStream(11,new FileInputStream(immagine), (int)immagine.length());
			 InserisciAttivita.executeUpdate();
			 System.out.println("Attivita Aggiunta");
		} catch (SQLException sqe) {
			System.err.println("Problema inserimento SQL");
			 sqe.printStackTrace();
		}
		 }
	
	public ArrayList<Attivita> getElencoAttivita(String posizione,String sottocategoria) throws Exception{
		 Connection con= getConnection();
		 try {
			PreparedStatement elenco=con.prepareStatement("SELECT * FROM public.attivita WHERE (posizione_attivita=?) AND (sottocategoria_attivita=? OR sottocategoria_seconda_attivita=?) ");
			 ArrayList <Attivita> elencoAttivita=new ArrayList<Attivita>();
			 elenco.setString(1, posizione);
			 elenco.setString(2, sottocategoria);
			 elenco.setString(3, sottocategoria);
			 ResultSet rs= elenco.executeQuery();
			 while(rs.next()){
				Attivita a =new Attivita();
				a.setNome_attivita(rs.getString("nome_attivita"));
				a.setPosizione_attivita(rs.getString("posizione_attivita"));
				a.setVia_attivita(rs.getString("via_attivita"));
				a.setCategoria_attivita(rs.getString("categoria_attivita"));
				a.setSottocategoria_attivita(rs.getString("sottocategoria_attivita"));
				a.setSottocategoria_attivita_2(rs.getString("sottocategoria_seconda_attivita"));
				a.setDescrizione_attivita(rs.getString("descrizione_attivita"));
				a.setCodice_attivita(rs.getString("codice_attivita"));
				a.setMedia(rs.getFloat("media_voti"));
				ImageIcon immagine=new ImageIcon(getImmagineDb(rs.getString("codice_attivita")));
				a.setImmagine_attivita(immagine);
				 elencoAttivita.add(a);
			 }
			 rs.close();
			 return elencoAttivita;
		} catch (SQLException e) {
			System.err.println("Errore getElencoAttività");
			return null;}}
	
	public ArrayList<Attivita> getElencoProprieAttivitaDb(String username) throws Exception{
		 Connection con= getConnection();
	
				PreparedStatement elenco=con.prepareStatement("SELECT * FROM public.attivita WHERE username_utente=? ");
				 ArrayList <Attivita> elencoAttivita=new ArrayList<Attivita>();
				 elenco.setString(1, username);
				 ResultSet rs= elenco.executeQuery();
				 while(rs.next()){
					Attivita a =new Attivita();
					a.setNome_attivita(rs.getString("nome_attivita"));
					a.setPosizione_attivita(rs.getString("posizione_attivita"));
					a.setVia_attivita(rs.getString("via_attivita"));
					a.setCategoria_attivita(rs.getString("categoria_attivita"));
					a.setSottocategoria_attivita(rs.getString("sottocategoria_attivita"));
					a.setSottocategoria_attivita_2(rs.getString("sottocategoria_seconda_attivita"));
					a.setDescrizione_attivita(rs.getString("descrizione_attivita"));
					a.setCodice_attivita(rs.getString("codice_attivita"));
					a.setMedia(rs.getFloat("media_voti"));
					ImageIcon immagine=new ImageIcon(getImmagineDb(rs.getString("codice_attivita")));
					a.setImmagine_attivita(immagine);
					 elencoAttivita.add(a);
				 }
				 rs.close();
				 return elencoAttivita;
			} 
		
	
public Attivita getPropriaAttivitaDb(String codice_attivita) throws Exception{
	 Connection con= getConnection();
	 
			PreparedStatement cerca=con.prepareStatement("SELECT * FROM public.attivita WHERE codice_attivita=? ");
			 cerca.setString(1, codice_attivita);
			 ResultSet rs= cerca.executeQuery();
			 while(rs.next()){
				Attivita a =new Attivita();
				a.setNome_attivita(rs.getString("nome_attivita"));
				a.setPosizione_attivita(rs.getString("posizione_attivita"));
				a.setVia_attivita(rs.getString("via_attivita"));
				a.setCategoria_attivita(rs.getString("categoria_attivita"));
				a.setSottocategoria_attivita(rs.getString("sottocategoria_attivita"));
				a.setSottocategoria_attivita_2(rs.getString("sottocategoria_seconda_attivita"));
				a.setDescrizione_attivita(rs.getString("descrizione_attivita"));
				a.setCodice_attivita(rs.getString("codice_attivita"));
				a.setMedia(rs.getFloat("media_voti"));
				ImageIcon immagine=new ImageIcon(getImmagineDb(rs.getString("codice_attivita")));
				a.setImmagine_attivita(immagine);
				return a;
			 }
			 rs.close();
			 return null;
		}
public boolean verificaModificaAttivita(String nome_attivita,String posizione_attivita,String codice_attivita) throws Exception{
	Connection con=getConnection();
	
	
		PreparedStatement verAggiuntaAttivita=con.prepareStatement("SELECT * FROM public.attivita WHERE nome_attivita=? AND posizione_attivita=? ;");
		verAggiuntaAttivita.setString(1, nome_attivita);
		verAggiuntaAttivita.setString(2, posizione_attivita);
		ResultSet result= verAggiuntaAttivita.executeQuery();
		if(result.next()==false){
			return true;
		}else{if(result.getString("codice_attivita").equals(codice_attivita)){
			return true;}else return false;}}	

public void modificaAttivitaDb(String nome_modificato,  String via_modificata, String descrizione_modificata,String codice_attivita) throws Exception{
	Connection con=getConnection();
	PreparedStatement modifica=con.prepareStatement("UPDATE public.attivita SET nome_attivita=?, via_attivita=?, descrizione_attivita=? WHERE codice_attivita=?; ");
	modifica.setString(1, nome_modificato);
	modifica.setString(2, via_modificata);
	modifica.setString(3, descrizione_modificata);
	modifica.setString(4, codice_attivita);
	modifica.executeUpdate();
}

public void eliminaAttivitaDb(String codice_attività) throws Exception{
	Connection con=getConnection();
	PreparedStatement elimina = con.prepareStatement("DELETE FROM public.attivita WHERE codice_attivita=?");
	elimina.setString(1, codice_attività);
	elimina.executeUpdate();
	
	
}



}
	

	
	

