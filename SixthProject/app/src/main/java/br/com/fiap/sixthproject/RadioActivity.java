package br.com.fiap.sixthproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by MaaaXSantos on 3/27/16.
 */
public class RadioActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rgCores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        rgCores = (RadioGroup)findViewById(R.id.radioGroup);
        rgCores.setOnCheckedChangeListener(this);

        //criar novo radioButton
        RadioButton rbBranco = new RadioButton(this);
        rbBranco.setText("Branco");

        rgCores.addView(rbBranco);
        //rgCores.removeViewAt(0); remove o primeiro elemento (indice 0)
    }

    public void qualCor(View v){
        int corId = rgCores.getCheckedRadioButtonId();

        RadioButton rbCor = (RadioButton)findViewById(corId);

        String nomeCor = rbCor.getText().toString();

        Log.i("ViewActivity", "Cor Selecionada: " + nomeCor);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton cor = (RadioButton)findViewById(checkedId);

        String nomeCor = cor.getText().toString();

        Log.i("ViewActivity", "Cor Selecionada: " + nomeCor);
    }
}
