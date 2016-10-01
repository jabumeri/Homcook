package com.example.jabumeri.homcook;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        if(v.getId() == R.id.makemeal_button) {
            Intent i = new Intent(MainActivity.this,makeameal.class);
            startActivity(i);
        }
    }

    public void onButtonClick1(View v){
        if(v.getId() == R.id.buymeal_button) {
            Intent i = new Intent(MainActivity.this,buyameal.class);
            startActivity(i);
        }
    }

}
