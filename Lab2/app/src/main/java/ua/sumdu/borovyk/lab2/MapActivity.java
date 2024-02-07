package ua.sumdu.borovyk.lab2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnMap;
    EditText editCoordinates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        btnMap = findViewById(R.id.btnMap);
        editCoordinates = findViewById(R.id.editCoordinates);
        btnMap.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:" + editCoordinates.getText().toString())
        );
        startActivity(intent);
    }
}
