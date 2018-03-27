package com.foodgotech.manager.foodgomanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.customizeCV).setOnClickListener(this);
        findViewById(R.id.manageCV).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.customizeCV:
                startActivity(new Intent(HomeActivity.this, NaviagationActivity.class));
                finish();
                break;

            case R.id.manageCV:
                Toast.makeText(this, "Functionality to be implemented in future updates.", Toast.LENGTH_SHORT).show();
                //TODO: To be implemented
                break;
        }
    }
}
