package ua.sumdu.borovyk.lab2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSearch;
    EditText editSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        btnSearch = findViewById(R.id.btnWeb);
        editSearch = findViewById(R.id.editWeb);
        btnSearch.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http:" + editSearch.getText().toString())
        );
        startActivity(intent);
    }
}
