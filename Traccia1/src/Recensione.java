
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recensione {
	Date data=new Date();
private String username_utente;
private String codice_attivita;
private String codice_recensione;
private String titolo_recensione;
private String descrizione_recensione;
private int voto;
DateFormat formato_data=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
java.sql.Date data_sql=new java.sql.Date(data.getTime());

public String getUsername_utente() {
	return username_utente;
}
public void setUsername_utente(String username_utente) {
	this.username_utente = username_utente;
}
public String getCodice_attivita() {
	return codice_attivita;
}
public void setCodice_attivita(String codice_attivita) {
	this.codice_attivita = codice_attivita;
}
public String getCodice_recensione() {
	return codice_recensione;
}
public void setCodice_recensione(String codice_recensione) {
	this.codice_recensione = codice_recensione;
}
public String getTitolo_recensione() {
	return titolo_recensione;
}
public void setTitolo_recensione(String titolo_recensione) {
	this.titolo_recensione = titolo_recensione;
}
public String getDescrizione_recensione() {
	return descrizione_recensione;
}
public void setDescrizione_recensione(String descrizione_recensione) {
	this.descrizione_recensione = descrizione_recensione;
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public Date getData() {
	return data_sql;
}
public void setData(java.sql.Date data) {
	this.data_sql = data;
}


	
}
