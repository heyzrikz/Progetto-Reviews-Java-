import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Controller{
      //VARIABILI
	Utente user_loggato=new Utente();
	Utente user_registrato=new Utente();
	Attivita attivita_registrata=new Attivita();
	Attivita attivita_cercata=new Attivita();
	Attivita attivita_propria_selezionata=new Attivita();
	Recensione recensione_cercata=new Recensione();
	Recensione recensione_segnalata_cercata=new Recensione();
	Moderatore admin_loggato=new Moderatore();
	ArrayList<Attivita> elenco_attivita= new ArrayList<Attivita>();
	ArrayList<Recensione> elenco_recensioni=new ArrayList<Recensione>();
	ArrayList<Recensione> elenco_recensioni_segnalate=new ArrayList<Recensione>();
	 JLabel lblNomeAttivita , lblNomeAttivitaScelta, lblPosizioneAttivita, lblViaAttivita,lblSottocategoriaAttivita,lblSottocategoria_2_Attivita;
     JTextArea txtDescrizione,txtSegnalazione;
     JLabel lblImmagineAttivita,lblMediaAttivita,lblTitoloRecensione,lblUsernameRecensione,lblDataRecensione;
     JLabel lblTitoloSegnalazione,lblUsernameSegnalazione;
     JTextArea txtRecensione;
     JTable tabella_recensioni,tabella_attivita,tabella_proprie_attivita,tabella_segnalazioni;
     String immagine_scelta="null";
	File immagine_file;
	JTextArea descrizione_da_modificare;
	JTextField nome_da_modificare, via_da_modificare;
	String posizione_cercata;
	String categoria_cercata;
	String sottocategoria_cercata;
	Date data=new Date();
	
	
	public static void main(String[] args) {
		Controller ctrl=new Controller();
		Home home_menu=new Home(ctrl);
		home_menu.setVisible(true);
		

	}
	//VARIABILI DAO
	RecensioneDao dao_recensione=new RecensioneDao();
	AttivitaDao dao_attivita=new AttivitaDao();
	UtenteDao dao_utente=new UtenteDao();
	SegnalazioneDao dao_segnalazione=new SegnalazioneDao();
	ModeratoreDao dao_admin=new ModeratoreDao();
   //VARIABILI FRAME
 Home home_menu=new Home(this);
 RegistrazioneFrame registration= new RegistrazioneFrame(this);
 MenuPrincipaleProprietario main_menu_owner=new MenuPrincipaleProprietario(this);
 MenuPrincipaleUtente main_menu_user=new MenuPrincipaleUtente(this);
 AggiungiAttivitaFrame attivita_frame=new AggiungiAttivitaFrame(this);
 AttivitaAggiuntaRiuscita attivita_aggiunta_riuscita_frame= new AttivitaAggiuntaRiuscita(this);
 AttivitaAggiuntaFallita attivita_aggiunta_fallita_frame=new AttivitaAggiuntaFallita(this);
 CercaAttivitaFrame search_activity=new CercaAttivitaFrame(this);
 AggiungiRecensioneFrame add_review=new AggiungiRecensioneFrame(this);
 ErroreAggiungiRecensioneDialog err_add_review=new ErroreAggiungiRecensioneDialog(this);
 RecensioneAggiuntaDialog dialog_add_review=new RecensioneAggiuntaDialog(this);
 CercaRecensioneFrame search_review=new CercaRecensioneFrame(this);
 ErroreRisultatoNonTrovatoDialog err_result_not_found=new ErroreRisultatoNonTrovatoDialog(this);
 SceltaSottocategoriaRistoranteFrame subcategory_choice_ristorante= new SceltaSottocategoriaRistoranteFrame(this);
 SceltaSottocategoriaAlloggioFrame subcategory_choice_alloggio= new SceltaSottocategoriaAlloggioFrame(this);
 SceltaSottocategoriaAttrazioneFrame subcategory_choice_attrazione=new  SceltaSottocategoriaAttrazioneFrame(this);
 MostraAttivita mostra_attivita=new MostraAttivita(this);
 MostraRecensioni mostra_recensioni=new MostraRecensioni(this);
 MostraSegnalazioni mostra_segnalazioni=new MostraSegnalazioni(this);
 VisualizzaRecensioneFrame visualizza_recensione=new VisualizzaRecensioneFrame(this);
 MostraProprieAttivita mostra_proprie_attivita=new MostraProprieAttivita(this);
 ModificaAttivita modifica_attivita=new ModificaAttivita(this);
 LoginModeratore login_admin=new LoginModeratore(this);
 MenuPrincipaleModeratore main_menu_admin=new MenuPrincipaleModeratore(this);
 VisualizzaSegnalazione visualizza_segnalazione=new VisualizzaSegnalazione(this);
 AggiungiModeratore add_admin=new AggiungiModeratore(this);
    //VARIABILI CLASSI NORMALI
 Utente user =new Utente();
 Attivita activity= new Attivita();
 Recensione review=new Recensione();
 Segnalazione report=new Segnalazione();
 Moderatore admin=new Moderatore();
    //ALTRE VARIABILI
 int count_codice=0;
 
 

 public void setVisibleRegistrazione(boolean visibilità){
	 registration.setVisible(visibilità);
 }
 public void setVisibleHome(boolean visibilità){
	 home_menu.setVisible(visibilità);
 }
 public void setVisibleMenuPrincipaleProprietario(boolean visibilità){
	 main_menu_owner.setVisible(visibilità);
 }
 public void setVisibleMenuPrincipaleUtente(boolean visibilità){
	 main_menu_user.setVisible(visibilità);
 }
 public void setVisibleAggiungiAttivitaFrame(boolean visibilità){
	 attivita_frame.setVisible(visibilità);
 } 
 public void setVisibleAttivitaAggiuntaRiuscita(boolean visibilità){
	 attivita_aggiunta_riuscita_frame.setVisible(visibilità);
 }
 public void setVisibleAttivitaAggiuntaFallita(boolean visibilità){
	 attivita_aggiunta_fallita_frame.setVisible(visibilità);
 }
 public void setVisibleCercaAttivitaFrame(boolean visibilità){
	 search_activity.setVisible(visibilità);
 }
 public void setVisibleAggiungiRecensioneFrame(boolean visibilità){
	 add_review.setVisible(visibilità);
 }
 public void setVisibleErroreAggiungiRecensioneDialog(boolean visibilità){
	 err_add_review.setVisible(visibilità);
 }
 
 public void setVisibleRecensioneAggiuntaDialog(boolean visibilità){
	 dialog_add_review.setVisible(visibilità);
 }
 public void setVisibleCercaRecensioneFrame(boolean visibilità){
	 search_review.setVisible(visibilità);
 }
 public void setVisibleErroreRisultatoNonTrovatoDialog(boolean visibilità){
	 err_result_not_found.setVisible(visibilità);
 }
 public void setVisibleSceltaSottocategoriaRistoranteFrame(boolean visibilità){
	 subcategory_choice_ristorante.setVisible(visibilità);
 }
 public void setVisibleSceltaSottocategoriaAlloggioFrame(boolean visibilità){
	 subcategory_choice_alloggio.setVisible(visibilità);
 }
 public void setVisibleSceltaSottocategoriaAttrazioneFrame(boolean visibilità){
	 subcategory_choice_attrazione.setVisible(visibilità);
 }
 public void setVisibleMostraAttivita(boolean visibilità){
	 mostra_attivita.setVisible(visibilità);
 }
 public void setVisibleMostraRecensioni(boolean visibilità){
	 mostra_recensioni.setVisible(visibilità);
 }
 public void setVisibleVisualizzaRecensioneFrame(boolean visibilità){
	 visualizza_recensione.setVisible(visibilità);
 }
 public void setVisibleMostraProprieAttivita(boolean visibilità){
	 mostra_proprie_attivita.setVisible(visibilità);
 }
 public void setVisibleModificaAttivita(boolean visibilità){
	 modifica_attivita.setVisible(visibilità);
 }
 public void setVisibleLoginModeratore(boolean visibilità){
	 login_admin.setVisible(visibilità);
 } 
 public void setVisibleMenuPrincipaleModeratore(boolean visibilità){
	 main_menu_admin.setVisible(visibilità);
 }
 public void setVisibleMostraSegnalazioni(boolean visibilità){
	 mostra_segnalazioni.setVisible(visibilità);
 }
 public void setVisibleVisualizzaSegnalazione(boolean visibilità){
	 visualizza_segnalazione.setVisible(visibilità);
 }
 public void setVisibleAggiungiModeratore(boolean visibilità){
	 add_admin.setVisible(visibilità);
 }
 
 public void setUtenteAcceduto(String nickname , String password){
	 user.setNickname(nickname);
	 user.setPassword(password);
	 user_loggato=user;
 }
 public void setUtenteRegistrato(String nome , String cognome , String nickname , String password, boolean moderatore){
	 user.setNome(nome);
	 user.setCognome(cognome);
	 user.setNickname(nickname);
	 user.setPassword(password);
	 user.setModeratore(moderatore);
	 user_registrato=user;
 }
 @SuppressWarnings("deprecation")
public boolean gestisciEccezioniRegistrazione(JLabel asterisco_nome , JLabel asterisco_cognome , JLabel asterisco_username,JLabel asterisco_password ,JLabel asterisco_conf_password , JTextField nome,JTextField cognome,JTextField username, JPasswordField password,JPasswordField conf_password,JLabel err_password_diverse,JLabel err_min_password){
		if(nome.getText().length()==0){
			asterisco_nome.setVisible(true);
		}else asterisco_nome.setVisible(false);
		if(cognome.getText().length()==0){
			asterisco_cognome.setVisible(true);
		}else asterisco_cognome.setVisible(false);
		if(username.getText().length()==0){
			asterisco_username.setVisible(true);
		}else asterisco_username.setVisible(false);
		if(password.getText().length()==0){
			asterisco_password.setVisible(true);
		}else asterisco_password.setVisible(false);
		if(conf_password.getText().length()==0){
			asterisco_conf_password.setVisible(true);
		}else asterisco_conf_password.setVisible(false);
		if(!password.getText().equals(conf_password.getText())){
			err_password_diverse.setVisible(true);
			return false;
		} else err_password_diverse.setVisible(false);
		if(nome.getText().length()!=0 && cognome.getText().length()!=0 && username.getText().length()!=0 && password.getText().length()!=0 && conf_password.getText().length()!=0 && minCaratteri(password,err_min_password)==true){
			return true;
		}else return false;
	

	}
 
 @SuppressWarnings("deprecation")
public boolean gestisciEccezioniAggiungiModeratore(JLabel asterisco_nome , JLabel asterisco_cognome , JLabel asterisco_username,JLabel asterisco_password  , JTextField nome,JTextField cognome,JTextField username, JPasswordField password,JLabel err_min_password){
		if(nome.getText().length()==0){
			asterisco_nome.setVisible(true);
		}else asterisco_nome.setVisible(false);
		if(cognome.getText().length()==0){
			asterisco_cognome.setVisible(true);
		}else asterisco_cognome.setVisible(false);
		if(username.getText().length()==0){
			asterisco_username.setVisible(true);
		}else asterisco_username.setVisible(false);
		if(password.getText().length()==0){
			asterisco_password.setVisible(true);
		}else asterisco_password.setVisible(false);
		if(nome.getText().length()!=0 && cognome.getText().length()!=0 && username.getText().length()!=0 && password.getText().length()!=0 &&  minCaratteri(password,err_min_password)==true){
			return true;
		}else return false;
	

	}
 @SuppressWarnings("deprecation")
public boolean minCaratteri(JPasswordField password,JLabel errore_min_password){
	 if(password.getText().length()<8){
		errore_min_password.setVisible(true);
		 return false;
	 }else
		 errore_min_password.setVisible(false);
		 return true;
 }
 
 public void setDefaultRegistrazioneFrame( JTextField nome,JTextField cognome,JTextField username, JPasswordField password,JPasswordField conf_password,JLabel asterisco_nick,JLabel asterisco_nome,JLabel asterisco_cognome, JLabel asterisco_password,JLabel asterisco_conferma_password,JLabel errore_nick,JLabel errore_min_password){
	 nome.setText("");
	 cognome.setText("");
	 username.setText("");
	 password.setText("");
	 conf_password.setText("");
     asterisco_nick.setVisible(false);	
     asterisco_nome.setVisible(false);
     asterisco_cognome.setVisible(false);
     asterisco_password.setVisible(false);	
     asterisco_conferma_password.setVisible(false);
     errore_nick.setVisible(false);
     errore_min_password.setVisible(false);
 }
 
 public void setDefaultAggiungiModeratoreFrame( JTextField nome,JTextField cognome,JTextField username, JPasswordField password,JLabel asterisco_nick,JLabel asterisco_nome,JLabel asterisco_cognome, JLabel asterisco_password,JLabel errore_nick,JLabel errore_min_password,JLabel moderatore_aggiunto){
	 nome.setText("");
	 cognome.setText("");
	 username.setText("");
	 password.setText("");
     asterisco_nick.setVisible(false);	
     asterisco_nome.setVisible(false);
     asterisco_cognome.setVisible(false);
     asterisco_password.setVisible(false);	
     errore_nick.setVisible(false);
     errore_min_password.setVisible(false);
     moderatore_aggiunto.setVisible(false);
 }
 
 
 
@SuppressWarnings("deprecation")
public boolean gestisciEccezioniHome(JLabel asterisco_username , JLabel asterisco_password , JTextField username , JPasswordField password){
		if(username.getText().length()==0){
			asterisco_username.setVisible(true);
		}else asterisco_username.setVisible(false);
		if(password.getText().length()==0){
			asterisco_password.setVisible(true);
		}else asterisco_password.setVisible(false);
		if(username.getText().length()!=0 && password.getText().length()!=0 ){
			return true;
		}else return false;

	}
 
 public void setDefaultHome(JTextField username , JPasswordField password){
	 username.setText("Inserisci Username");
	 password.setText("");
 }
 
 public boolean gestisciEccezioniAggiungiAttivita(JLabel asterisco_nome ,JTextField nome_attivita, JLabel asterisco_via ,JTextField via_attivita, JLabel asterisco_descrizione,JLabel asterisco_immagine,JTextArea descrizione_attivita){
	 if(!immagine_scelta.equals("null")){
		  asterisco_immagine.setVisible(false);
	  }else asterisco_immagine.setVisible(true);
	 if(nome_attivita.getText().length()==0){
			asterisco_nome.setVisible(true);
		}else asterisco_nome.setVisible(false);
		if(via_attivita.getText().length()==0){
			asterisco_via.setVisible(true);
		}else asterisco_via.setVisible(false);
		if(descrizione_attivita.getText().length()==0){
			asterisco_descrizione.setVisible(true);
		}else asterisco_descrizione.setVisible(false);
		if(nome_attivita.getText().length()!=0 && via_attivita.getText().length()!=0 && descrizione_attivita.getText().length()!=0 && !immagine_scelta.equals("null")){
			return true;
		}else return false;

}
 
 public boolean verificaUsernameInUso() throws Exception{
	 if(dao_utente.verificaInserimentoDbUtente(user_registrato.getNickname())){
		 return true;
	 }else return false;
 }
 
 public void inserisciUtente() throws Exception{
		dao_utente.inserisciUtenteDb(user_registrato.getNome(), user_registrato.getCognome(), user_registrato.getNickname(), user_registrato.getPassword(), user_registrato.isModeratore());
	}
 public boolean CercaUtenteNelDatabase() throws Exception{
	 if(dao_utente.verificaAccesso(user_loggato.getNickname(), user_loggato.getPassword())==true){
		 return true;
	 }else return false;
 }
 public void verificaTipologiaDiUtente() throws Exception{
  if(dao_utente.verificaSeAccountProprietario(user_loggato.getNickname())==true){	
	  setVisibleMenuPrincipaleProprietario(true);
  }else {
	  setVisibleMenuPrincipaleUtente(true);}
 }

	 
 
 


 public String generaCodiceAttivita() throws NumberFormatException, Exception{
	 count_codice=Integer.parseInt(dao_attivita.getCodiceAttivitaDb());
	 count_codice=count_codice+1;
	 String contatore_stringa=String.valueOf(count_codice);
	 return contatore_stringa;
	
 }
 
 
 
 
 
 
public String sceltaSottocategoria(JComboBox<String> categoria , JComboBox<String> ristorante , JComboBox<String> alloggio , JComboBox<String> attrazione){
	String sottocategoria="";
	if(categoria.getSelectedIndex()==0){
		sottocategoria=ristorante.getSelectedItem().toString();
	    return sottocategoria;
	}else if(categoria.getSelectedIndex()==1){
		sottocategoria=alloggio.getSelectedItem().toString();
		return sottocategoria;
	}else if(categoria.getSelectedIndex()==2){
		sottocategoria=attrazione.getSelectedItem().toString();
		return sottocategoria;
	}
	return sottocategoria;
	
}
public void attivitaRegistrata(String nome_attivita , String posizione_attivita , String via_attivita , String categoria_attivita, String sottocategoria_attivita, String sottocategoria_attivita_2 , String descrizione_attivita,String codice_attivita){
	 activity.setNome_attivita(nome_attivita);
	 activity.setPosizione_attivita(posizione_attivita);
	 activity.setVia_attivita(via_attivita);
	 activity.setCategoria_attivita(categoria_attivita);
	 activity.setSottocategoria_attivita(sottocategoria_attivita);
	 activity.setSottocategoria_attivita_2(sottocategoria_attivita_2);
	 activity.setDescrizione_attivita(descrizione_attivita);
	 activity.setCodice_attivita(codice_attivita);
	 attivita_registrata=activity;
}

public boolean verificaPresenzaAttivita() throws Exception{
	if(dao_attivita.verificaAggiuntaAttivita(attivita_registrata.getNome_attivita(),attivita_registrata.getPosizione_attivita())==false){
		setVisibleAttivitaAggiuntaFallita(true);
		setVisibleAggiungiAttivitaFrame(false);
		setVisibleAttivitaAggiuntaRiuscita(false);
		return false;
	}else {
		setVisibleAttivitaAggiuntaFallita(false);
		setVisibleAggiungiAttivitaFrame(false);
		setVisibleAttivitaAggiuntaRiuscita(true);
		return true;}
 }



public void inserisciAttivitaDatabase() throws Exception{
	
	dao_attivita.InserisciAttivita(attivita_registrata.getNome_attivita(), attivita_registrata.getPosizione_attivita(), attivita_registrata.getVia_attivita(), attivita_registrata.getCategoria_attivita(), attivita_registrata.getSottocategoria_attivita(), attivita_registrata.getSottocategoria_attivita_2(), attivita_registrata.getDescrizione_attivita(), attivita_registrata.getCodice_attivita(), user_loggato.getNickname(),immagine_file);
	
}

public void setDefaultTxtAggiungiAttivitaFrame(JTextField nome_attivita , JTextField via_attivita , JTextArea descrizione_attivita,JLabel asterisco_immagine){
	nome_attivita.setText("Inserisci Nome Attivit\u00E0");
	via_attivita.setText("Inserisci Citt\u00E0 e Via Attivit\u00E0");
	descrizione_attivita.setText("Inserisci qui la descrizione della tu\u00E0 attivit\u00E0...");
	asterisco_immagine.setVisible(false);
	
}
public ArrayList<Attivita> getElencoAttivita(String posizione , String categoria) throws Exception{
	elenco_attivita.clear();
	elenco_attivita.addAll(dao_attivita.getElencoAttivitaDb(posizione, categoria));
	return elenco_attivita;
	
}
public void cercaAttivita(String posizione , String categoria , String nome) throws Exception{
	attivita_cercata=dao_attivita.cercaAttivitaDb(posizione, categoria, nome);
}

public void setLabelAggiungiRecensioneFrame(JLabel nome,JLabel posizione , JLabel via, JLabel sottocategoria,JLabel sottocategoria_seconda,JTextArea descrizione,JLabel immagine){
	 lblNomeAttivitaScelta=nome;
    lblPosizioneAttivita=posizione;
     lblViaAttivita=via;
     lblSottocategoriaAttivita=sottocategoria;
     lblSottocategoria_2_Attivita=sottocategoria_seconda;
    txtDescrizione=descrizione;
    lblImmagineAttivita=immagine;
}
public void getLabelAttivita(){
	lblNomeAttivitaScelta.setText(attivita_cercata.getNome_attivita());
			lblPosizioneAttivita.setText(attivita_cercata.getPosizione_attivita());
			 lblViaAttivita.setText(attivita_cercata.getVia_attivita());
			 lblSottocategoriaAttivita.setText(attivita_cercata.getSottocategoria_attivita());
		 lblSottocategoria_2_Attivita.setText(attivita_cercata.getSottocategoria_attivita_2());
		 txtDescrizione.setText(attivita_cercata.getDescrizione_attivita());
}

public void getImmagineAttivita() throws Exception{
	 ImageIcon imageIcon = new ImageIcon(dao_attivita.getImmagineDb(attivita_cercata.getCodice_attivita()));
	 ImageFileFiltrer resize_image=new ImageFileFiltrer();
	 Image img=imageIcon.getImage();
	 imageIcon=new ImageIcon(resize_image.getScaledImage(img, 456, 255));
	 lblImmagineAttivita.setIcon(imageIcon);
	
}

public boolean gestisciAsterischiAggiungiRecensione(JLabel asterisco_titolo , JLabel asterisco_recensione , JTextField titolo , JTextArea recensione){
	if(titolo.getText().length()==0){
		asterisco_titolo.setVisible(true);
	}else asterisco_titolo.setVisible(false);
	if(recensione.getText().length()==0){
		asterisco_recensione.setVisible(true);
	}else asterisco_recensione.setVisible(false);
	if(titolo.getText().length()!=0 && recensione.getText().length()!=0 ){
		return true;
	}else return false;

}
public String generaCodiceRecensione() throws NumberFormatException, Exception{
	 count_codice=Integer.parseInt(dao_recensione.getCodiceRecensioneDb());
	 count_codice=count_codice+1;
	 String contatore_stringa=String.valueOf(count_codice);
	 return contatore_stringa;}

public String generaCodiceSegnalazione() throws NumberFormatException, Exception{
	 count_codice=Integer.parseInt(dao_segnalazione.getCodiceSegnalazioneDb());
	 count_codice=count_codice+1;
	 String contatore_stringa=String.valueOf(count_codice);
	 return contatore_stringa;
	
}
public void inserisciRecensione(String codice_recensione ,String titolo_recensione , String descrizione_recensione , int voto) throws Exception{
	
	review.setTitolo_recensione(titolo_recensione);
	review.setDescrizione_recensione(descrizione_recensione);
	review.setVoto(voto);
	review.setUsername_utente(user_loggato.getNickname());
	review.setCodice_attivita(attivita_cercata.getCodice_attivita());
	review.setData(data);
	java.sql.Date data_sql= new java.sql.Date (data.getTime());
	dao_recensione.inserisciRecensioneDb(codice_recensione, titolo_recensione, descrizione_recensione, voto, user_loggato.getNickname(), attivita_cercata.getCodice_attivita(),data_sql);
	
}
public boolean verificaAggiuntaRecensione() throws Exception{
	 if(dao_recensione.verificaInserimentoDbRecensione(user_loggato.getNickname(),attivita_cercata.getCodice_attivita())){
		 return true;
	 }else return false;
}

public String scegliImmagine(){
	String scelta;
	JButton open= new JButton();
	JFileChooser fc = new JFileChooser();
	fc.setCurrentDirectory(new java.io.File("C:/Users/lenovo/Desktop"));
    fc.setDialogTitle("Hello world");
    fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fc.setFileFilter(new ImageFileFiltrer());
if(fc.showOpenDialog(open)== JFileChooser.APPROVE_OPTION){
	System.out.println("You choose:"+fc.getSelectedFile().getAbsolutePath());
	scelta=fc.getSelectedFile().getAbsolutePath();
	immagine_scelta=scelta;
	File f=new File(scelta);
	immagine_file=f;
	return scelta;}else {
	immagine_scelta="null";
	return null;}}

public ImageIcon resizeIcon(ImageIcon foto){
	ImageFileFiltrer resize_image=new ImageFileFiltrer();
	 Image img=foto.getImage();
	 foto=new ImageIcon(resize_image.getScaledImage(img, 456, 255));
	 return foto;}

public void gestisciVisiblitaMenu(){
	try {
		if(dao_utente.verificaSeAccountProprietario(user_loggato.getNickname())==true){
			setVisibleMenuPrincipaleProprietario(true);
			setVisibleMenuPrincipaleUtente(false);
		}else{		
			setVisibleMenuPrincipaleProprietario(false);
			setVisibleMenuPrincipaleUtente(true);	
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public boolean gestisciSceltaSottocategoria(String posizione,String categoria){
	if(dao_attivita.verificaCategoriaAttivitaNelDb(posizione, categoria)){
		posizione_cercata=posizione;
		categoria_cercata=categoria;
		if(categoria.equals("Ristorante")){
			setVisibleSceltaSottocategoriaRistoranteFrame(true);
			setVisibleSceltaSottocategoriaAlloggioFrame(false);
			setVisibleSceltaSottocategoriaAttrazioneFrame(false);
		}else
				if(categoria.equals("Alloggio")){
					setVisibleSceltaSottocategoriaRistoranteFrame(false);
					setVisibleSceltaSottocategoriaAlloggioFrame(true);
					setVisibleSceltaSottocategoriaAttrazioneFrame(false);
				}else if(categoria.equals("Attrazione")){
					setVisibleSceltaSottocategoriaRistoranteFrame(false);
					setVisibleSceltaSottocategoriaAlloggioFrame(false);
					setVisibleSceltaSottocategoriaAttrazioneFrame(true);
				}return true;
				}else return false;}

public void setElencoAttivita(String sottocategoria) throws Exception{
	sottocategoria_cercata=sottocategoria;
	elenco_attivita.clear();
		elenco_attivita.addAll(dao_attivita.getElencoAttivita(posizione_cercata, sottocategoria_cercata));
	}

public void setElencoProprieAttivita() throws Exception{
	elenco_attivita.clear();
	elenco_attivita.addAll(dao_attivita.getElencoProprieAttivitaDb(user_loggato.getNickname()));
}


public void setElencoRecensioni(String nome_attivita){
	setVisibleMostraAttivita(false);
	for(Attivita elemento:getElencoAttivita()){
	if(elemento.getNome_attivita().equals(nome_attivita)){
		try {elenco_recensioni.clear();
			elenco_recensioni.addAll(dao_recensione.getElencoRecensioni(elemento.getCodice_attivita()));
			attivita_cercata=elemento;
		} catch (Exception e) {
			e.printStackTrace();
		}}}}


public void setElencoSegnalazioni() throws Exception{
	elenco_recensioni_segnalate.clear();
	elenco_recensioni_segnalate.addAll(dao_segnalazione.getElencoRecensioniSegnalateDb());
	
}

public ArrayList<Attivita> getElencoAttivita(){
	return elenco_attivita;}

public ArrayList<Recensione> getElencoRecensioni(){
	return elenco_recensioni;}

public void setTabellaRecensioni(JTable tabella_da_aggiungere){
	tabella_recensioni=tabella_da_aggiungere;}

public JTable getTabellaRecensioni(){
	return tabella_recensioni;}

public JTable getTabellaRecensioniSegnalate(){
	return tabella_segnalazioni;
}

public void setTabellaAttivita(JTable tabella_da_aggiungere){
	tabella_attivita=tabella_da_aggiungere;}

public void setTabellaProprieAttivita(JTable tabella_da_aggiungere){
	tabella_proprie_attivita=tabella_da_aggiungere;
}

public void setTabellaSegnalazioni(JTable tabella_da_aggiungere){
	tabella_segnalazioni=tabella_da_aggiungere;
}

public JTable getTabellaProprieAttivita(){
	return tabella_proprie_attivita;
}

public JTable getTabellaAttivita(){
	return tabella_attivita;}

public void aggiungiTabellaAttivita(JTable tabella_da_aggiungere){
	DefaultTableModel model =(DefaultTableModel) tabella_attivita.getModel();
	removeAllItems(tabella_da_aggiungere);
	for(Attivita elemento:elenco_attivita){
		model.addRow(new Object[]   {elemento.getNome_attivita(),elemento.getVia_attivita(),resizeIcon(elemento.getImmagine_attivita())});}
     if(model.getRowCount()==0){
    	 setVisibleMostraAttivita(false);
    	 setVisibleErroreRisultatoNonTrovatoDialog(true);}}

public void aggiungiTabellaProprieAttivita(JTable tabella_da_aggiungere, JLabel lblErrore, JLabel lblCorretto){
	DefaultTableModel model =(DefaultTableModel) tabella_proprie_attivita.getModel();
	removeAllItems(tabella_da_aggiungere);
	lblErrore.setVisible(false);
	lblCorretto.setVisible(true);
	for(Attivita elemento:elenco_attivita){
		model.addRow(new Object[]   {elemento.getCodice_attivita(),elemento.getNome_attivita(),elemento.getVia_attivita(),resizeIcon(elemento.getImmagine_attivita())});}
     if(model.getRowCount()==0){
    	 setVisibleMostraProprieAttivita(false);
    	 setVisibleMenuPrincipaleProprietario(true);
    	 lblCorretto.setVisible(false);
    	 lblErrore.setVisible(true);}else{ 
    		 setVisibleMenuPrincipaleProprietario(false);
    		 setVisibleMostraProprieAttivita(true);
     }}

public void aggiungiTabellaRecensioni(JTable tabella_da_aggiungere){
	DefaultTableModel model =(DefaultTableModel) tabella_recensioni.getModel();
	for(Recensione elemento:elenco_recensioni){
		model.addRow(new Object[]   {elemento.getCodice_recensione(),elemento.getTitolo_recensione(),elemento.getDescrizione_recensione(),elemento.getVoto()});}
	 if(model.getRowCount()==0){
    	 setVisibleMostraRecensioni(false);
    	 setVisibleErroreRisultatoNonTrovatoDialog(true);}}

public void aggiungiTabellaSegnalazioni(JTable tabella_da_aggiungere){
	DefaultTableModel model =(DefaultTableModel) tabella_segnalazioni.getModel();
	removeAllItems(tabella_da_aggiungere);
	for(Recensione elemento:elenco_recensioni_segnalate){
		model.addRow(new Object[] {elemento.getCodice_recensione(),elemento.getTitolo_recensione(),elemento.getDescrizione_recensione()});}
	  if(model.getRowCount()==0){
	    	 setVisibleMostraSegnalazioni(false);
	    	 }
}
	
	
	
	


public void removeAllItems(JTable tabella){
	DefaultTableModel model =(DefaultTableModel) tabella.getModel();
	int rowCount = model.getRowCount();
	for (int i = rowCount-1; i >= 0; i--) {
	    model.removeRow(i);}}

public void setLabelMostraRecensioni(JLabel nome,JLabel media){
	lblMediaAttivita=media;
	lblNomeAttivita=nome;
	
}
public void getLabelMostraRecensioni(){
	lblNomeAttivita.setText(attivita_cercata.getNome_attivita());
	lblMediaAttivita.setText(Float.toString(attivita_cercata.getMedia()));
	
}


public void setRecensioneSelezionata(String codice_recensione){
	setVisibleMostraRecensioni(false);
	for(Recensione elemento:elenco_recensioni){
		if(elemento.getCodice_recensione().equals(codice_recensione)){
				recensione_cercata=elemento;
				setVisibleVisualizzaRecensioneFrame(true);}}}

public void setSegnalazioneSelezionata(String codice_recensione){
	setVisibleMostraRecensioni(false);
	for(Recensione elemento:elenco_recensioni_segnalate){
		if(elemento.getCodice_recensione().equals(codice_recensione)){
				recensione_segnalata_cercata=elemento;
				setVisibleVisualizzaSegnalazione(true);}}}

public void setLabelVisualizzaRecensioneSelezionata(JLabel titolo_recensione,JTextArea descrizione_recensione,JLabel username_utente,JLabel data_recensione){
	lblTitoloRecensione=titolo_recensione;
	txtRecensione=descrizione_recensione;
	lblUsernameRecensione=username_utente;
	lblDataRecensione=data_recensione;
}

public void setLabelVisualizzaSegnalazioneSelezionata(JLabel titolo_recensione,JTextArea descrizione_recensione,JLabel username_utente){
	lblTitoloSegnalazione=titolo_recensione;
	txtSegnalazione=descrizione_recensione;
	lblUsernameSegnalazione=username_utente;
	
}




public void getLabelVisualizzaRecensioneSelezionata(){
	lblTitoloRecensione.setText(recensione_cercata.getTitolo_recensione());
	txtRecensione.setText(recensione_cercata.getDescrizione_recensione());
    lblUsernameRecensione.setText(recensione_cercata.getUsername_utente());	
    lblDataRecensione.setText(recensione_cercata.getData().toString());
}

public void getLabelVisualizzaSegnalazioneSelezionata(){
	lblTitoloSegnalazione.setText(recensione_segnalata_cercata.getTitolo_recensione());
	txtSegnalazione.setText(recensione_segnalata_cercata.getDescrizione_recensione());
    lblUsernameSegnalazione.setText(recensione_segnalata_cercata.getUsername_utente());	
}

public void setTextModificaAttivita(JTextField nome , JTextField via ,JTextArea descrizione){
	nome_da_modificare=nome;
	via_da_modificare=via;
	descrizione_da_modificare=descrizione;
}

public void setPropriaAttivitaSelezionata(String codice_attivita){
	try {
		attivita_propria_selezionata=dao_attivita.getPropriaAttivitaDb(codice_attivita);
	} catch (Exception e) {
		e.printStackTrace();}}

public void getTextModificaAttivita(){
	nome_da_modificare.setText(attivita_propria_selezionata.getNome_attivita());
	via_da_modificare.setText(attivita_propria_selezionata.getVia_attivita());
	descrizione_da_modificare.setText(attivita_propria_selezionata.getDescrizione_attivita());
}


public boolean gestisciEccezioniModificaAttivita(String nome_modificato,String via_modificata,String descrizione_modificata){
	if(nome_modificato.length()==0 || via_modificata.length()==0 || descrizione_modificata.length()==0){
		return false;
	}
	try {
		if(dao_attivita.verificaModificaAttivita(nome_modificato, attivita_propria_selezionata.getPosizione_attivita(),attivita_propria_selezionata.getCodice_attivita())){
			return true;
		}else return false;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}}

public void modificaAttivitaSelezionata(String nome_modificato,String via_modificata, String descrizione_modificata){
	try {
		dao_attivita.modificaAttivitaDb(nome_modificato, via_modificata, descrizione_modificata, attivita_propria_selezionata.getCodice_attivita());
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public boolean verificaSegnalazione(){
	    UIManager.put("OptionPane.background",new Color(128, 0, 0));
		UIManager.put("Panel.background",new Color(128, 0, 0));
		UIManager.put("OptionPane.messageForeground",new Color(255, 215, 0));
	try {
		if(dao_segnalazione.verificaSegnalazione(recensione_cercata.getUsername_utente(),recensione_cercata.getCodice_recensione())==true){
			if(user_loggato.getNickname().equals(recensione_cercata.getUsername_utente())){
				JOptionPane.showMessageDialog(new JFrame(),"Non puoi segnalare una tua recensione");
				return false;
				}
			JOptionPane.showMessageDialog(new JFrame(),"Segnalazione effettuata con successo!");
			return true;
		}else {
			JOptionPane.showMessageDialog(new JFrame(),"Segnalazione effettuata con successo!");
			return false;}
	} catch (Exception e) {
		e.printStackTrace();
		return false;}}

public void inserisciSegnalazione(String codice_segnalazione) throws Exception{
	java.sql.Date data_recensione= new java.sql.Date (recensione_cercata.getData().getTime());
	dao_segnalazione.inserisciSegnalazioneDb(recensione_cercata.getCodice_recensione(), recensione_cercata.getTitolo_recensione(), recensione_cercata.getDescrizione_recensione(),recensione_cercata.getVoto(),recensione_cercata.getUsername_utente(), recensione_cercata.getCodice_attivita(), data_recensione ,codice_segnalazione);
	
}
public void setModeratoreAcceduto(String nickname , String password){
	 admin.setId(nickname);
	 admin.setPassword(password);
	 admin_loggato=admin;
}

public boolean cercaModeratoreNelDatabase() throws Exception{
	 if(dao_admin.verificaAccesso(admin_loggato.getId(), admin_loggato.getPassword())==true){
		 return true;
	 }else return false;
}
@SuppressWarnings("deprecation")
public boolean gestisciEccezioniLoginModeratore(JLabel asterisco_username , JLabel asterisco_password , JTextField username , JPasswordField password){
		if(username.getText().length()==0){
			asterisco_username.setVisible(true);
		}else asterisco_username.setVisible(false);
		if(password.getText().length()==0){
			asterisco_password.setVisible(true);
		}else asterisco_password.setVisible(false);
		if(username.getText().length()!=0 && password.getText().length()!=0 ){
			return true;
		}else return false;

	}

public boolean verificaPresenzaSegnalazioni(JLabel lblnotFound, JLabel lblFound) throws Exception{
	    
if(dao_segnalazione.verificaPresenzaSegnalazioni()==true){
	lblnotFound.setVisible(false);
	lblFound.setVisible(true);
	return true;}else{
		lblnotFound.setVisible(true);
		lblFound.setVisible(false);
		return false;
	}
}

public void eliminaSegnalazione() throws Exception{
	dao_segnalazione.eliminaSegnalazioneDb(recensione_segnalata_cercata.getCodice_recensione());
	}

public void eliminaRecensione() throws Exception{
	dao_recensione.eliminaRecensioneDb(recensione_segnalata_cercata.getCodice_recensione());
	
}
public boolean verificaIdModeratoreInUso(String id) throws Exception{
	if(dao_admin.verificaPresenzaId(id)==true){
		return true;
	}else return false;}

public void inserisciModeratore(String id,String nome,String cognome,String password) throws Exception{
	System.out.println("ole: "+id);
	dao_admin.inserisciModeratoreDb(id, nome,cognome, password);
}




}
