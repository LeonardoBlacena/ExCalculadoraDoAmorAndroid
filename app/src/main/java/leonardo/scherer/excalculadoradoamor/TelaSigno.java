package leonardo.scherer.excalculadoradoamor;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class TelaSigno extends AppCompatActivity {
    private Spinner signoCrush;
    private Spinner signo;
    private Button btnCalculoSigno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_signo);

        signoCrush = (Spinner) findViewById(R.id.sp_signo4);
        signo= (Spinner) findViewById(R.id.sp_signo3);
        btnCalculoSigno = (Button) findViewById(R.id.btn_calculosigno);

        btnCalculoSigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Crush c = new Crush();

                c.setSignocrush(signoCrush.getSelectedItem().toString());
                c.setSigno(signo.getSelectedItem().toString());

                AlertDialog.Builder msg = new AlertDialog.Builder(TelaSigno.this);
                msg.setTitle("Conexão com seu crush:");
                msg.setMessage(c.verificarSigno());
                msg.setNeutralButton("OK",null);
                msg.show();
            }
        });

    }
}
