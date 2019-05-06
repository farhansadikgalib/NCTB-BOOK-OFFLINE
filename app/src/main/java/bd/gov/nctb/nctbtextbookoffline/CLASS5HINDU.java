package bd.gov.nctb.nctbtextbookoffline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CLASS5HINDU extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5_hindu);

        pdfView=(PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("Class-5 Hindu Religion and Moral Education.pdf").load();
    }
}
