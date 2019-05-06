package bd.gov.nctb.nctbtextbookoffline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CLASS1ENGLISH extends AppCompatActivity {
    PDFView p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1_english);

        p=(PDFView) findViewById(R.id.pdfView);
        p.fromAsset("class1english.pdf").load();

    }
}
