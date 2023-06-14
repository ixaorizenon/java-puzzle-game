package onurbalari.com.androidpuzzlegame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Mod extends AppCompatActivity {
    Button kolay,orta,zor;
    Intent zorluk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mod);

        kolay=findViewById(R.id.kolay);
        orta=findViewById(R.id.orta);
        zor=findViewById(R.id.zor);

        kolay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zorluk = new Intent(getApplicationContext(),MainActivity.class);
                zorluk.putExtra("row",3);
                zorluk.putExtra("col",2);
                zorluk.putExtra("piecesNumber",6);

                startActivity(zorluk);
                finish();
            }
        });



        orta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zorluk = new Intent(getApplicationContext(),MainActivity.class);
                zorluk.putExtra("row",4);
                zorluk.putExtra("col",3);
                zorluk.putExtra("piecesNumber",12);

                startActivity(zorluk);
                finish();

            }
        });

        zor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zorluk = new Intent(getApplicationContext(),MainActivity.class);
                zorluk.putExtra("row",5);
                zorluk.putExtra("col",4);
                zorluk.putExtra("piecesNumber",20);

                startActivity(zorluk);
                finish();
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent zrluk = new Intent(getApplicationContext(),basla.class);

            startActivity(zrluk);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
