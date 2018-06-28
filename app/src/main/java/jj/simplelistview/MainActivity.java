package jj.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        listView = (ListView) findViewById( R.id.Listview );

        //Datos a mostrar, en forma de Arraylist
        List<String > names= new ArrayList<String>( );
        names= new ArrayList<String>();
        names.add( "Alejandro" );
        names.add( "Manolo" );
        names.add( "Benito" );
        names.add( "Bartolo" );
        names.add( "Javier" );

        //Adaptador, la forma visual en que mostraremos los datos

        ArrayAdapter<String>adapter=new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, names );

        //Enlazamos el adaptador con nuestro ListView
        listView.setAdapter(adapter);

    listView.setOnClickListener( new AdapterView.OnItemClickListener() {
        @Override

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, "Clicked: "+names.get( position ), Toast.LENGTH_LONG).show();

        }
    } );


    }
}
