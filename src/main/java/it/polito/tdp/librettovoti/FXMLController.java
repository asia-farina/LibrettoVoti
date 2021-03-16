package it.polito.tdp.librettovoti;

import java.time.LocalDate;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Libretto model;

    @FXML
    private TextField txtNomeEsame;
    
    @FXML
    private TextField txtVotoEsame;

    @FXML
    private DatePicker pickerDataEsame;

    @FXML
    private Label txtSegnalazioni;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void doAggiungi(ActionEvent event) {
    	String nome=txtNomeEsame.getText();
    	LocalDate data=pickerDataEsame.getValue();
    	String voto=txtVotoEsame.getText();
    	int voto1 = 0;
    	if (nome.compareTo("")==0 || data==null || voto.compareTo("")==0)
    	{
    		txtSegnalazioni.setText("ATTENZIONE: non hai compilato uno o più campi");
    		return ;
    	}
    	try {
    		voto1=Integer.parseInt(voto);
    	} catch (NumberFormatException e) {
    		txtSegnalazioni.setText("ATTENZIONE: il voto deve essere numerico");
    		txtVotoEsame.setText("");
    		return ;
    	}
    	if (voto1<18 || voto1>30)
    	{
    		txtSegnalazioni.setText("ATTENZIONE: il voto deve essere compreso tra 18 e 30");
    		txtVotoEsame.setText("");
    		return ;
    	}
    	Voto nuovoVoto=new Voto(nome, voto1, data);
    	if (model.setVoti(nuovoVoto)==false)
    	{
    		txtSegnalazioni.setText("ATTENZIONE: voto già inserito");
    		return ;
    	}
    	txtRisultato.setText(model.toString());	
    	txtSegnalazioni.setText("");
    	txtNomeEsame.setText("");
    	txtVotoEsame.setText("");
        pickerDataEsame.setValue(null);
    }

	public void setModel(Libretto model) {
		this.model = model;
	}
    

}
