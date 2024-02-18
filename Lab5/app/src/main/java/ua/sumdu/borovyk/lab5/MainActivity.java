package ua.sumdu.borovyk.lab5;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    MyTask mt;
    TextView tv;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        mt = (MyTask) getLastNonConfigurationInstance();

        if (mt == null) {
            mt = new MyTask();
            mt.execute();
        }
        mt.link(this);
    }

    public Object onRetainNonConfigurationInstance() {
        mt.unLink();
        return mt;
    }

    class MyTask extends AsyncTask<String, Integer, Void> {

        MainActivity activity;

        void link(MainActivity act) {
            activity = act;
        }

        void unLink() {
            activity = null;
        }

        @Override
        protected Void doInBackground(String... params) {
            try {
                for (int i = 1; i <= 20; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    publishProgress(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            activity.tv.setText("i = " + values[0]);
        }
    }
}