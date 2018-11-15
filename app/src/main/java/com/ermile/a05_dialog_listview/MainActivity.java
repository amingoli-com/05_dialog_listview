package com.ermile.a05_dialog_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button dialog , listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        dialog=findViewById ( R.id.btn_dialog );
        dialog.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity ( new Intent ( MainActivity.this,Dialog.class ) );
            }
        } );

        listview=findViewById ( R.id.btn_listview );
        listview.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                startActivity ( new Intent ( MainActivity.this , ListView.class ) );
            }
        } );


    }
}
