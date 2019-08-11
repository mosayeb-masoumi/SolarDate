package com.example.solardata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    TextView txtSolarDate,txtMiladiDate;

    SolarCalendar calendar;
    StringBuilder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSolarDate=findViewById(R.id.txtSolarDate);
        txtMiladiDate=findViewById(R.id.txtMiladiDate);


         calendar = new SolarCalendar();
         builder = new StringBuilder();



        txtSolarDate.setText(builder.append(calendar.getStrWeekDay()).append(" ").
                        append(calendar.getCurrentShamsiDay()).append(" ").append(calendar.getStrMonth()));


                Date c = Calendar.getInstance().getTime();
                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String formatDate = df.format(c);
        txtMiladiDate.setText(formatDate);

    }
}
