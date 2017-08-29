package rdma.myapprafael;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity  {

    private Button botonCambiarActividad;  //Se crea la variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        botonCambiarActividad = (Button) findViewById(R.id.botonCambiarActividad);
        botonCambiarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loadActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(loadActivity);
            }
        });


    }
}
