package leonardo.scherer.excalculadoradoamor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaCabelo extends AppCompatActivity {

    private Button btnCalculoCabelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cabelo);

        btnCalculoCabelo = (Button) findViewById(R.id.btn_calculocabelo);

        btnCalculoCabelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Crush c = new Crush();
                Toast.makeText(
                        getBaseContext(),
                        "Chances com o crush: " + c.gerarNumeroRandomico() +"%",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
