package com.example.eva1_8_eventos_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
TextView txtViewNombre, txtViewApellido;
EditText plntxtNombre, plntxtApellido;
RadioGroup rdGrpidioma;
RadioButton rdbtningles, rdbtnespañol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewNombre = findViewById(R.id.txtViewNombre);
        txtViewApellido = findViewById(R.id.txtViewApellido);
        plntxtNombre = findViewById(R.id.plntxtNombre);
        plntxtApellido = findViewById(R.id.plntxtApellido);
        rdGrpidioma = findViewById(R.id.rdGrpidioma);
        rdGrpidioma.setOnCheckedChangeListener(this);
        rdbtnespañol = findViewById(R.id.rdbtnespañol);
        rdbtningles = findViewById(R.id.rdbtningles);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
if (i == R.id.rdbtnespañol){
    txtViewNombre.setText(R.string.txt_vw_nom);
    plntxtNombre.setHint(R.string.edt_vw_nom);
    txtViewApellido.setText(R.string.txt_vw_Ape);
    plntxtApellido.setHint(R.string.edt_vw_Ape);
    rdbtnespañol.setText(R.string.rd_btn_es);
    rdbtningles.setText(R.string.rd_btn_in);

}else{
    if (i == R.id.rdbtningles){
        txtViewNombre.setText(R.string.txt_vw_nom_en);
        plntxtNombre.setHint(R.string.edt_vw_nom_en);
        txtViewApellido.setText(R.string.txt_vw_Ape_en);
        plntxtApellido.setHint(R.string.edt_vw_Ape_en);
        rdbtnespañol.setText(R.string.rd_btn_es_en);
        rdbtningles.setText(R.string.rd_btn_in_en);
    }
}
    }
}