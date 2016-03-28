package br.com.fiap.sixthproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by MaaaXSantos on 3/27/16.
 */
public class Exercicio extends Activity {

    private RadioGroup rg;
    private CheckBox ckBorda;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio);

        rg = (RadioGroup)findViewById(R.id.rgPizzaria);
        ckBorda = (CheckBox)findViewById(R.id.ckBorda);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

    }

    public void verificaTipoPizza(View v){
        switch (v.getId()){
            case R.id.rbMussarela:
                ckBorda.setEnabled(false);
                ckBorda.setChecked(false);
                break;

            case R.id.ckBorda:
                if(rg.getCheckedRadioButtonId() == R.id.rbMussarela){
                    ckBorda.setChecked(false);
                    ckBorda.setEnabled(false);
                }
                else {
                    ckBorda.setEnabled(true);
                }
                break;

            default:
                ckBorda.setEnabled(true);
                break;

        }
    }

    public void calculaValorPizza(View v){
        double vlrMussarela = 10.00;
        double vlrCalabresa = 15.00;
        double vlrPortuguesa = 20.00;
        double vlrBorda = 5.00;
        double resultado = 0.0;
        String saida;

        int tipoSelecionado = rg.getCheckedRadioButtonId();

        switch (tipoSelecionado){
            case R.id.rbMussarela:
                resultado = vlrMussarela;
                break;

            case R.id.rbCalabresa:
                resultado = vlrCalabresa + (ckBorda.isChecked() ? vlrBorda : 0);
                break;

            case R.id.rbPortuguesa:
                resultado = vlrPortuguesa + (ckBorda.isChecked() ? vlrBorda : 0);
                break;

            default:
                Toast.makeText(this, "Selecione um tipo de pizza!", Toast.LENGTH_LONG);
                break;
        }

        saida = String.valueOf(R.string.txtResultado) + String.valueOf(resultado);
        txtResultado.setText(saida);
    }

}
