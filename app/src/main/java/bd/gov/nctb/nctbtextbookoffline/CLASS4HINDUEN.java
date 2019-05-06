package bd.gov.nctb.nctbtextbookoffline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CLASS4HINDUEN extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class4_hinduen);
    pdfView=(PDFView)findViewById(R.id.pdfView);
    pdfView.fromAsset("Class - 4 Hindu EN.pdf");

    }
}
