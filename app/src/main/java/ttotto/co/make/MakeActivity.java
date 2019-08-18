package ttotto.co.make;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MakeActivity extends AppCompatActivity {

    Button Button_create;
    Button Button_cancel;
    TextInputEditText TextInputEditText_goal;
    TextInputEditText TextInputEditText_period;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make);


         Button_create = findViewById(R.id.Button_create);
         Button_cancel = findViewById(R.id.Button_cancel);

         TextInputEditText_goal = (TextInputEditText)findViewById(R.id.TextInputEditText_goal);
         TextInputEditText_period = (TextInputEditText)findViewById(R.id.TextInputEditText_period);

        Button_create.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String goal = TextInputEditText_goal.getText().toString();
                String period = TextInputEditText_period.getText().toString();
                Integer peri = Integer.parseInt(period);

                Intent intent = new Intent(MakeActivity.this,MainActivity.class);
                intent.putExtra("goal",goal);
                intent.putExtra("peri",peri);
                //intent.putExtra("isOk","ok");
                startActivity(intent);
            }
        });
    }
}
