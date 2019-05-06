package bd.gov.nctb.nctbtextbookoffline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CLASSONEBANGLA_V extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classonebangla__v);

        Button b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(CLASSONEBANGLA_V.this,AMARBANGLABOI.class);
                startActivity(i);
            }
        });

        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(CLASSONEBANGLA_V.this,CLASS1ENGLISH.class);
                startActivity(i2);
            }
        });

        b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"প্রাথমিক গণিত",Toast.LENGTH_SHORT).show();
             Intent i3 = new Intent(CLASSONEBANGLA_V.this,Class1mathb.class);
             startActivity(i3);
            }
        });




    }
}
