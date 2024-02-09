package ua.sumdu.borovyk.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class BeerAdviserActivity extends AppCompatActivity {

    private final BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beer_adviser_activity);
    }

    public void onClickFindBeer(View view) {
        Spinner types = (Spinner) findViewById(R.id.spinnerBeerTypes);
        String type = String.valueOf(types.getSelectedItem());

        List<String> beerNames = beerExpert.getNamesByType(type);
        TextView brands = (TextView) findViewById(R.id.textBeerBrands);

        brands.setText(
                beerNames.isEmpty()
                        ? "No beer for you"
                        : String.join("\n", beerNames)
        );
    }
}