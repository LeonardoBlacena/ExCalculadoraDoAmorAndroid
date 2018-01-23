package leonardo.scherer.excalculadoradoamor;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_botao;
    private Button btnTesteNome;
    private Button btnTesteSigno;
    private Button btnTesteCapilar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_botao = (Button) findViewById(R.id.btn_botao);
        btnTesteNome = (Button) findViewById(R.id.btn_testenome);
        btnTesteSigno = (Button) findViewById(R.id.btn_telasigno);
        btnTesteCapilar = (Button) findViewById(R.id.btn_testecapilar);

        btnTesteNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, TelaNome.class);
                startActivity(it);

            }
        });

        btnTesteSigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, TelaSigno.class);
                startActivity(it);

            }
        });


        btnTesteCapilar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, TelaCabelo.class);
                startActivity(it);
            }
        });




    }//fecha on create


}
