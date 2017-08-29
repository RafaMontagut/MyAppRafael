package rdma.myapprafael;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario, etClave;
    private Button botonEnvioDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etClave = (EditText) findViewById(R.id.etClave);
        botonEnvioDatos= (Button) findViewById(R.id.botonEnvioDatos);
        botonEnvioDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Datos","Usuario" + etUsuario.getText());
                Log.i("Datos","Contraseña" + etClave.getText());
            }
        });

    }
}
