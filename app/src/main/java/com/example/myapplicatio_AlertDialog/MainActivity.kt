package com.example.myapplicatio_AlertDialog

import android.os.Bundle;
import androidx.activity.enableEdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;`                                                                                                                                          נו

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


            import android.app.AlertDialog;
            import android.content.DialogInterface;
            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.Button;
            import android.widget.EditText;
            import android.widget.TextView;
            import android.widget.Toast;

            import androidx.activity.EdgeToEdge;
            import androidx.appcompat.app.AppCompatActivity;
            import androidx.core.graphics.Insets;
            import androidx.core.view.ViewCompat;
            import androidx.core.view.WindowInsetsCompat;

            public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                EdgeToEdge.enable(this);
                setContentView(R.layout.activity_main);
                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
                Button btn = findViewById(R.id.button);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText et = findViewById(R.id.editText);
                        String name = et.getText().toString();
                        new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Really?")
                            .setMessage("Just make sure this is what you want :)")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this,name, Toast.LENGTH_LONG).show();
                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(MainActivity.this,":(", Toast.LENGTH_LONG).show();
                                }
                            })
                            .show();
                    }
                });
            }
        }
        }
    }
}