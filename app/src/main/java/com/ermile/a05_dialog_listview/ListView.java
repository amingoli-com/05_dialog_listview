package com.ermile.a05_dialog_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {


    List<String> items;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_listview );
        listView = findViewById ( R.id.abclist );


        listDate ();
        refreshDisplay();


    }


    public void listDate(){
        items = new ArrayList <> (  );
        items.add ( "Qom" );
        items.add ( "Tehran" );
        items.add ( "Qossdsm" );
        items.add ( "Tesdfdhran" );
        items.add ( "Qossm" );
        items.add ( "qomi" );
        items.add ( "mahalat" );
        items.add ( "shiraz" );

    }

    private void refreshDisplay() {
        ArrayAdapter<String> adapter = new ArrayAdapter <String> ( this,android.R.layout.simple_expandable_list_item_1 );
        listView.setAdapter ( adapter );
    }
}
