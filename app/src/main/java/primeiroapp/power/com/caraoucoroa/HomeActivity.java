package primeiroapp.power.com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class HomeActivity extends Activity {


    private ImageButton jogada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        jogada= (ImageButton) findViewById(R.id.btn_jogada);

        jogada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),JogadaActivity.class);

                Random jogada = new Random();
                int tela=jogada.nextInt(3)+1;

                    intent.putExtra("desenhoMoeda",tela);


                startActivity(intent);



            }
        });



    }
}
