package primeiroapp.power.com.caraoucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class JogadaActivity extends Activity {

    private ImageButton voltar;
    private ImageView telaJogada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogada);
        voltar=(ImageButton)findViewById(R.id.img_btn_voltar);
        telaJogada=(ImageView)findViewById(R.id.imagem_jogada);

        Bundle jogadaRecebida=getIntent().getExtras();
        int tela=jogadaRecebida.getInt("desenhoMoeda");



       if(tela==1){
            telaJogada.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.moeda_cara));

        }
        else{

            telaJogada.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.moeda_coroa));



        }





        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }


        });

    }
}
