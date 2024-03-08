package com.mirea.kimpm.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button WhoAmI;
    private Button ItIsNotMe ;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        WhoAmI = findViewById(R.id.WhoAmI);
        ItIsNotMe = findViewById(R.id.ItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Я? Я №12, Полина");
                ChangeCheckBoxStatus();
            }
        };
        WhoAmI.setOnClickListener(oclWhoAmI);
    }

    public void onButtonClick(View view)
    {
        tvOut.setText("В смысле не я, я! Потому и устала");
        ChangeCheckBoxStatus();
    }

    public void ChangeCheckBoxStatus() {
        if(checkBox.isChecked()) {
            checkBox.setChecked(false);
        }
        else {
            checkBox.setChecked(true);
        }
    }

}