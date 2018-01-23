package leonardo.scherer.excalculadoradoamor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaNome extends AppCompatActivity {

    private EditText etSeuNome2;
    private EditText etNomeCrush2;
    private Button btnCalculoNome;
    private static final String TAG = "logTela1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_nome);

        Log.d(TAG, "entrou na tela 1");
        etSeuNome2 = (EditText) findViewById(R.id.et_seunome2);
        etNomeCrush2= (EditText) findViewById(R.id.et_nomecrush2);
        btnCalculoNome = (Button) findViewById(R.id.btn_calculonome);

        btnCalculoNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "entrou na tno clique");

                if(!etSeuNome2.getText().toString().isEmpty() &&
                        !etNomeCrush2.getText().toString().isEmpty()){
                    Log.d(TAG, "entrou no if");
                    Crush c = new Crush();



                    //tvResposta.setText("Chances com o Crush: "+c.gerarNumeroRandomico()+"%");

                    Toast.makeText(
                            getBaseContext(),
                            "Chances com o crush: " + c.gerarNumeroRandomico() +"%",
                            Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(
                            getBaseContext(),
                            "Erro! Dados em branco!!",
                            Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
