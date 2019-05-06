package bd.gov.nctb.nctbtextbookoffline;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){


            case R.id.aboutus:
                Toast.makeText(this,"about us",Toast.LENGTH_SHORT).show();
                Intent i0=new Intent(this,About_Us.class);
                startActivity(i0);
                return true;


            case R.id.share:
                Toast.makeText(this,"Share this app",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(Intent.ACTION_SEND);
                startActivity(Intent.createChooser(i2,"share this app"));


                return true;


        }

        return super.onOptionsItemSelected(item);
    }








    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
     b=(Button) findViewById(R.id.first);
     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(getApplicationContext(),"primary education",Toast.LENGTH_LONG).show();
             Intent i = new Intent(MainActivity.this,PrimaryClass.class);
             startActivity(i);

         }
     });

    }

}
