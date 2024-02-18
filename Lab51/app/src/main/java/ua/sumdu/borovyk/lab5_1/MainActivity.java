package ua.sumdu.borovyk.lab5_1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        var tabHost = getTabHost();

        var tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Tab 1");
        tabSpec.setContent(new Intent(this, OneA.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Tab 2");
        tabSpec.setContent(new Intent(this, TwoA.class));
        tabHost.addTab(tabSpec);
    }
}