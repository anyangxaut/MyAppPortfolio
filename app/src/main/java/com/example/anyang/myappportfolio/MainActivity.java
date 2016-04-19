package com.example.anyang.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void btnApp1(View view){
        Toast.makeText(this, "This button will launch SPOTIFY STREAMER!", Toast.LENGTH_SHORT).show();
    }

    public void btnApp2(View view){
        Toast.makeText(this, "This button will launch SCOPES APP!", Toast.LENGTH_SHORT).show();
    }

    public void btnApp3(View view){
        Toast.makeText(this, "This button will launch LIBRARY APP!", Toast.LENGTH_SHORT).show();
    }

    public void btnApp4(View view){
        Toast.makeText(this, "This button will launch BUILD IT BIGGER!", Toast.LENGTH_SHORT).show();
    }

    public void btnApp5(View view){
        Toast.makeText(this, "This button will launch XYZ READER!", Toast.LENGTH_SHORT).show();
    }

    public void btnApp6(View view){
        Toast.makeText(this, "This button will launch MY OWN APP!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
