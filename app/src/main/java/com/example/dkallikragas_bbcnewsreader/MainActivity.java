package com.example.dkallikragas_bbcnewsreader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyHTTPRequest req = new MyHTTPRequest();
        req.execute("http://feeds.bbci.co.uk/news/world/us_and_canada/rss.xml");

        Toolbar myToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
    }

    public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }

    public Toolbar getSupportActionBar() {
        return supportActionBar;
    }

    private class MyHTPRequest extends ASyncTask< String, Integer, String >{

        public String doInBackground(String, Integer, String){

            publishProgress(...values: 25);
            publishProgress(...values: 50);
            publishProgress(...values: 75);
            return "Done";
        }

        public void onProgressUpdate(Integer){

        }

        public void onPostExecute(String fromDOInBackground) { Log.i( tag: "HTTP", fromDoInBackground); }

        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(false);
        XmlPullParser xpp = factory.newPullParser();
        xpp.setInput( response , inputEncoding "UTF-8");
    }

    protected void findViewByID(int theListView) {

        ListView myList = findViewByID(R.id.theListView);
    }

    private class MyListAdapter extends BaseAdapter {

        public int getCount() {
            MenuBuilder elements;
            return elements.size(); }

        public Object getItem(int position) { return "This is row:" + position; }

        public long getItemId(int position) { return position; }

        public View getView(int position, View old, ViewGroup parent)

        {

            View newView = old;
            LayoutInflater inflater = getLayoutInflater();

            if(newView == null) {
                newView = inflater.inflate(R.layout.row_layout, parent, attachToRoot false)
            }

            TextView tView = newView.findViewById(R.id.textGoesHere);
            tView.setText( getItem(position).toString() );

            return newView;
        }
        setOnClickHandler( click -> elements.add("Top Story") );

)
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ListView myList = findViewById(R.id.theListView);
        myList.setAdapter( myAdapter = new myListAdapter() );

        myList.setOnItemLongClisckListener( (p,b, pos, id) -> {
            AlertDialogue.Builder alertDialogueBuilder = new AlertDialogue.Builder( content this )
            alertDiologueBuilder.setTitle("Top News Stories")

                    .setMessage("Do you want to add this story to your list?")

                    .setPositiveButton( text: "Yes", (clis=ck, arg) -> {
                elements.add("add to list");
                myAdapter.notifyDataSetChanged();
            })

            .setNegativeButton( text: "No", (click, arg) -> {})

            ,setView(getLayoutInflater().inflate(R.layout.row_layout, null null) )
            .create().show();
            return true;

            onCreate(savedInstanceState:Bundle) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_my);
                Toolbar myToolbar = (Toolbar)findViewById(R.id.toolbar);
                setSupportActionBar(myToolbar); }

            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu items for use in the action bar
                MenuInflater inflater = getMenuInflater();
                inflater.inflate(R.menu.main_activity_actions, menu);
                return true;
            }
        }
    }

    Toast.makeText(MainActiviyty.this, "Checkbox is " + b, Toast.LENGTH_LONG).show();
        Snackbar.make(theEdit, text: "Checkbox is " + b, Snackbar.LENGTH_LONG)
            .setAction( text: "Undo adding to top stories list", click -> compoundButton.setChecked( !b ))
            .show();

    private class MyHTTPRequest {
    }
        Snackbar.setAction("Add to top stories", clickListener)
}