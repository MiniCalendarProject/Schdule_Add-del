package com.example.cookandroid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ScheduleDeletionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_deletion);

        setTitle("일정 삭제");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent i=new Intent(getApplicationContext(), ScheduleManagementActivity.class);
                startActivity(i);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }


}
