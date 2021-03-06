package com.example.roubaisha.counter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    private CardView calendarbtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        calendarbtn=(CardView)findViewById(R.id.calendarbtn);
        calendarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendarActivity();
            }
        });


        TextView title=(TextView)findViewById(R.id.more_tv);
        title.setText("This is Activity More");



        /*Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);*/


        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavView_Bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent0 = new Intent(MoreActivity.this, HomeActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.ic_tasbih:
                        Intent intent1 = new Intent(MoreActivity.this, TasbihActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_more:
                        break;
                }


                return false;
            }
        });

    }

    public void openCalendarActivity(){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
}
