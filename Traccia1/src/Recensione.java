
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recensione {
String username_utente;
String codice_attivita;
String codice_recensione;
String titolo_recensione;
String descrizione_recensione;
int voto;
DateFormat formato_data=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
Date data=new Date();
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
	return data;
}
public void setData(Date data) {
	this.data = data;
}


	
}
