package bd.gov.nctb.nctbtextbookoffline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CLASSFOURBANGLA_V extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classfourbangla__v);

        Button b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(CLASSFOURBANGLA_V.this,CLASS4BANGLA.class);
                startActivity(i);
            }
        });

        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(CLASSFOURBANGLA_V.this,CLASS4ENGLISH.class);
                startActivity(i2);
            }
        });

        b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3= new Intent(CLASSFOURBANGLA_V.this,CLASS4MATH.class);
                startActivity(i3);
            }
        });
        Button b4= (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4= new Intent(CLASSFOURBANGLA_V.this,CLASS4SCIENCE.class);
                startActivity(i4);
            }
        });

        Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5= new Intent(CLASSFOURBANGLA_V.this,CLASS4BANGLADESHB.class);
                startActivity(i5);
            }
        });

        b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6= new Intent(CLASSFOURBANGLA_V.this,CLASS4ISLAM.class);
                startActivity(i6);
            }
        });

        b7=(Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7= new Intent(CLASSFOURBANGLA_V.this,CLASS4HINDU.class);
                startActivity(i7);
            }
        });


    }
}