package cl.evilgenius.mvp_par_impar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements N_evenCallback {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.responseTv);
        editText = findViewById(R.id.valueEt);
        Button button = findViewById(R.id.resultBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();

                new N_evenPresenter(MainActivity.this).isEven(number);
            }
        });

    }

    @Override
    public void even() {
        textView.setText("El numero es PAR");
    }

    @Override
    public void notEven() {
        textView.setText("El numero es IMPAR ");
    }
}
