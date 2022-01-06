package com.example.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;

    TextView tvCountries,tvCases,tvTodayCases,getTvTodayDeaths,tvDeaths,tvRecovered,tvActive,tvCritical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry=intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        tvCountries = findViewById(R.id.tvCountries1);
        tvCases = findViewById(R.id.tvCases1);
        tvTodayCases=findViewById(R.id.tvTodayCases1);
        getTvTodayDeaths=findViewById(R.id.tvTodayDeaths1);
        tvDeaths=findViewById(R.id.tvDeaths1);
        tvRecovered=findViewById(R.id.tvRecovered1);
        tvActive=findViewById(R.id.tvActive1);
        tvCritical=findViewById(R.id.tvCritical1);

        tvCountries.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        getTvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodaydeaths());
        tvDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}