package leonardo.scherer.excalculadoradoamor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaIdade extends AppCompatActivity {

    private Button btnCalculoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_idade);

        btnCalculoIdade = (Button) findViewById(R.id.btn_calculoidade);

        btnCalculoIdade.setOnClickListener(new View.OnClickListener() {
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
