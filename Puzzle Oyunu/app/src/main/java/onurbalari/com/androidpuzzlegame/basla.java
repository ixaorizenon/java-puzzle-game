package onurbalari.com.androidpuzzlegame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class basla extends AppCompatActivity{

    Button baslaa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basla);

        baslaa=findViewById(R.id.baslaa);

        baslaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mod = new Intent(getApplicationContext(),Mod.class);
                startActivity(mod);

                finish();
            }
        });

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.e("back key pressed","Back key pressed");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
/*
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertbox = new AlertDialog.Builder(basla.this);

                alertbox.setPositiveButton(getString(R.string.app_name), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                break;
        }
        return super.onKeyDown(keyCode, event);
    }

 */
}
