package ttotto.co.make;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SetGoalActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_child);

        Button Button_create;
        Button Button_cancel;

        Button_create = (Button)findViewById(R.id.Button_create);
        Button_cancel = (Button)findViewById(R.id.Button_cancel);

    }

    @Override
    public void onClick(View view) {

    }
}
