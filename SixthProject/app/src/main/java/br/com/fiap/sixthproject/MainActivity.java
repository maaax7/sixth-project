package br.com.fiap.sixthproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void check(View v){
        boolean var = ((CheckBox) v).isChecked();

        switch(v.getId()){
            case R.id.ckTeste:
                Log.i("ViewActivity", "Check 1:" + var);
                break;

            case R.id.ckTeste2:
                Log.i("ViewActivity", "Check 2: " + var);
                break;
        }

        Log.i("ViewActivity", "Valor: " + var);
    }
}
