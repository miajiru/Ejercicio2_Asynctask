package es.schooleando.ejercicio2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private Button botonDescarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonDescarga = (Button)findViewById(R.id.botonDescarga);
    }

    public void onClickBotonDescarga(View view) throws ExecutionException, InterruptedException {
        TareaDescarga task = new TareaDescarga();
        task.execute(10000);
        task.get();
        botonDescarga.setText("Descargado!");
        botonDescarga.setEnabled(false);

    }

}


