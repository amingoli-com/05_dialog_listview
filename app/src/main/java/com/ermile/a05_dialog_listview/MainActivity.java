package com.ermile.a05_dialog_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button dialog , listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        dialog=findViewById ( R.id.btn_dialog );
        listview=findViewById ( R.id.btn_listview );

        if (dialog.getId () == R.id.btn_dialog){
            startActivity ( new Intent ( this,Dialog.class ) ); }
        if (listview.getId ()==R.id.btn_listview){
            startActivity ( new Intent ( this , ListView.class ) );
        }
    }
}
