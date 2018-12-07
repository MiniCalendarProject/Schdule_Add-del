package com.example.cookandroid.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ScheduleManagementActivity extends AppCompatActivity {

    private PopupWindow mPopUpWindow;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_management);

        setTitle("Mini Calendar");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.schedulemenu, menu);
        Log.d("test", "onCreateOptionsMenu - 최초 메뉴키를 눌렀을 때 호출됨 ");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 메뉴의 항목을 선택(클릭)했을 때 호출되는 콜백메소드
        Log.d("test", "onOptionsItemSelected - 메뉴항목을 클릭했을 때 호출됨");

        int id=item.getItemId();

        switch (id) {

            case R.id.menu1: // 추가 메뉴를 클릭했을 때 호출
                Intent addition=new Intent(getApplicationContext(), ScheduleAdditionActivity.class);
                startActivity(addition);
                return true;
            case R.id.menu2: // 삭제 메뉴를 클릭했을 때 호출
                Intent deletion=new Intent(getApplicationContext(), ScheduleDeletionActivity.class);
                startActivity(deletion);
                return true;
            case R.id.menu3: // 보기 메뉴를 클릭했을 때 호출
              View popupView=getLayoutInflater().inflate(R.layout.seeing_popup_window, null);

              mPopUpWindow=new PopupWindow(popupView, RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

              mPopUpWindow.setAnimationStyle(0);
              mPopUpWindow.showAtLocation(popupView, Gravity.NO_GRAVITY,750,250);

                return true;
            }

        return super.onOptionsItemSelected(item);
    }
}
