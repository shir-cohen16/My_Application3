package com.example.my_application5;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // מצא את ה-TextView והכפתור
        tvTime = findViewById(R.id.tvTime);
        Button btnPickTime = findViewById(R.id.btnPickTime);

        // הוסף מאזין לכפתור
        btnPickTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialog();
            }
        });
    }

    private void showTimePickerDialog() {
        // קבל את השעה הנוכחית
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // צור את דיאלוג הבחירה
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                (view, selectedHour, selectedMinute) -> {
                    // עדכן את ה-TextView עם הזמן שנבחר
                    String selectedTime = String.format("%02d:%02d", selectedHour, selectedMinute);
                    tvTime.setText(selectedTime);
                }, hour, minute, true);
        timePickerDialog.show();
    }
}