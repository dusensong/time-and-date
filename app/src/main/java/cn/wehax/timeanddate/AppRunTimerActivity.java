package cn.wehax.timeanddate;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import cn.wehax.common.util.AppRunTimer;


public class AppRunTimerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_run_timer);

        AppRunTimer.start();
        for (int i = 0; i < 1000000000L; ++i) {
            int a = 1;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        AppRunTimer.outputRunTime("onStart");
        AppRunTimer.start("timer1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        AppRunTimer.outputRunTime("onResume");
        AppRunTimer.outputRunTime("timer1", "onResume");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_run_timer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
