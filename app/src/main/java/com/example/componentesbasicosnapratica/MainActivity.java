package com.example.componentesbasicosnapratica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView textoResultado2;
    private TextView textoResultado;
    private TextView textoResultadoemail;
    private RadioButton checkPortaDE;
    private RadioButton checkPortaDD;
    private RadioButton checkPortaTE;
    private RadioButton checkPortaTD;
    private RadioButton checkTampaT;
    private RadioButton checkCapo;
    public RadioGroup radioGroup1;
    public RadioGroup radioGroup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
        textoResultadoemail = findViewById(R.id.textResultadoemail);
        textoResultado2 = findViewById(R.id.textResultado2);
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);

        //CheckBox
        checkPortaDE = findViewById(R.id.checkPortaDE);
        checkPortaDD = findViewById(R.id.checkPortaDD);
        checkPortaTE = findViewById(R.id.checkPortaTE);
        checkPortaTD = findViewById(R.id.checkPortaTD);
        checkTampaT = findViewById(R.id.checkTampaT);
        checkCapo = findViewById(R.id.checkCapo);


    }


    public void RadioButton() {

        String texto = "";
        if (checkPortaDE.isChecked())
        {
            String portaSelecionada = checkPortaDE.getText().toString();
            texto = portaSelecionada;
        }
        if (checkPortaDD.isChecked());
        {
            String portaSelecionada = checkPortaDD.getText().toString();
            texto = portaSelecionada;
        }
        if (checkPortaTE.isChecked()) {
            String portaSelecionada = checkPortaTE.getText().toString();
            texto = portaSelecionada;
        }
        if (checkPortaTD.isChecked())
        {
            String portaSelecionada = checkPortaTD.getText().toString();
            texto = portaSelecionada;
        }
        if (checkTampaT.isChecked()) {
            String portaSelecionada = checkTampaT.getText().toString();
            texto = portaSelecionada;
        }
        if (checkCapo.isChecked()) {
            String portaSelecionada = checkCapo.getText().toString();
            texto = portaSelecionada;
        }
        textoResultado2.setText(" Local: " + texto);
    }





    public void enviar(View view) {

        RadioButton();

        EditText campoNome = findViewById(R.id.editNome);
        TextView textoResultado = findViewById(R.id.textResultado);
        String nome = campoNome.getText().toString();
        textoResultado.setText(" Carro : " + nome);

        EditText campoEmail = findViewById(R.id.editEmail);
        String email = campoEmail.getText().toString();
        TextView textoResultadoemail = findViewById(R.id.textResultadoemail);
        textoResultadoemail.setText(" Montadora : " + email);


    }


    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
        textoResultadoemail.setText("");
        textoResultado2.setText("");
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();

    }
    public  void buttonPorta(View view) {
        radioGroup2.clearCheck();

    }
    public  void  buttonPorta1(View view) {
        radioGroup1.clearCheck();
    }


}




