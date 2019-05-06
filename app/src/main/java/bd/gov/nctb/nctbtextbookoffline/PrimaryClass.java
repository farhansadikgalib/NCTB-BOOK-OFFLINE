package bd.gov.nctb.nctbtextbookoffline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrimaryClass extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_class);
        b1= (Button) findViewById(R.id.class1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"CLASS ONE",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(PrimaryClass.this,CLASSONEBANGLA_V.class);
                startActivity(i);
            }
        });

        b2=(Button) findViewById(R.id.class2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CLASS TWO",Toast.LENGTH_SHORT).show();
                Intent i2= new Intent(PrimaryClass.this,CLASSTWOBANGLA_V.class);
                startActivity(i2);
            }
        });

        b3=(Button) findViewById(R.id.class3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CLASS THREE",Toast.LENGTH_SHORT).show();
                Intent i3= new Intent(PrimaryClass.this,CLASSTHREEBANGLA_V.class);
                startActivity(i3);
            }
        });

        b4=(Button) findViewById(R.id.class4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CLASS FOUR",Toast.LENGTH_SHORT).show();
                Intent i4= new Intent(PrimaryClass.this,CLASSFOURBANGLA_V.class);
                startActivity(i4);
            }
        });

        b5=(Button) findViewById(R.id.class5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"CLASS FIVE",Toast.LENGTH_SHORT).show();
                Intent i5= new Intent(PrimaryClass.this,CLASSFIVEBANGLA_V.class);
                startActivity(i5);
            }
        });

    }
}
