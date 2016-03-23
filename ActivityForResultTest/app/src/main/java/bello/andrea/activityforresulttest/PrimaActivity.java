package bello.andrea.activityforresulttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class PrimaActivity extends Activity {

    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prima_activity_layout);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimaActivity.this, SecondaActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            TextView textView = (TextView)findViewById(R.id.textview);

            if(resultCode == RESULT_OK){
                String dato = data.getExtras().getString(getString(R.string.chiave_per_dato));
                textView.setText(dato);
            } else if(resultCode == RESULT_CANCELED){
                textView.setText(getString(R.string.testo_annullamento_seconda_activity));
            }
        }
    }
}
