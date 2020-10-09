package net.eu5.calibos.handcourt;

import android.os.Bundle;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Chapterpage extends AppCompatActivity {

CardView chapter1,chapter2,chapter3,chapter4,chapter5,chapter5a,chapter6,chapter7,chapter8,chapter9,chapter9a,chapter10,chapter11,chapter12,chapter13,chapter14,chapter15,chapter16,chapter17,chapter18,chapter19,chapter20,chapter20a,chapter21,chapter22,chapter23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapterpage);
        chapter1=findViewById (R.id.chapter1);
        chapter2=findViewById (R.id.chapter2);
        chapter3=findViewById (R.id.chapter3);
        chapter4=findViewById (R.id.chapter4);
        chapter5=findViewById (R.id.chapter5);
        chapter5a=findViewById (R.id.chapter5a);
        chapter6=findViewById (R.id.chapter6);
        chapter7=findViewById (R.id.chapter7);
        chapter8=findViewById (R.id.chapter8);
        chapter9=findViewById (R.id.chapter9);
        chapter9a=findViewById (R.id.chapter9a);
        chapter10=findViewById (R.id.chapter10);
        chapter11=findViewById (R.id.chapter11);
        chapter12=findViewById (R.id.chapter12);
        chapter13=findViewById (R.id.chapter13);
        chapter14=findViewById (R.id.chapter14);
        chapter15=findViewById (R.id.chapter15);
        chapter16=findViewById (R.id.chapter16);
        chapter17=findViewById (R.id.chapter17);
        chapter18=findViewById (R.id.chapter18);
        chapter19=findViewById (R.id.chapter19);
        chapter20=findViewById (R.id.chapter20);
        chapter20a=findViewById (R.id.chapter20a);
        chapter21=findViewById (R.id.chapter21);
        chapter22=findViewById (R.id.chapter22);
        chapter23=findViewById (R.id.chapter23);

        chapter1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter3.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter5.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter5a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter6.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter7.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter8.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter9a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter10.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter11.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter12.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter13.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter14.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter15.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter16.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter17.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter18.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter19.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter20.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter20a.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter21.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter22.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
        chapter23.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
    }

 @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate (R.menu.main2,menu);
        MenuItem menuItem=  menu.findItem (R.id.search);
        SearchView searchView=(SearchView) menuItem.getActionView ();
        searchView.setQueryHint ("Search Here ...");
        searchView.setOnQueryTextListener (new SearchView.OnQueryTextListener () {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText (getApplicationContext (),s+" ",Toast.LENGTH_LONG).show ();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return true;
            }
        });
        return true;
    }
}
