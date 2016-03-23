package bello.andrea.activityforresulttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seconda_activity_layout);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = ((EditText)findViewById(R.id.edittext)).getText().toString();

                Intent intent = new Intent();
                intent.putExtra(getString(R.string.chiave_per_dato), dato);

                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

}
