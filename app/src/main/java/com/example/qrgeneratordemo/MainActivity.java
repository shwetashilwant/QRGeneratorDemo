package com.example.qrgeneratordemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtValue;
    private String inputValue;
    private String strResponse;
    private Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValue = findViewById(R.id.edt_value);
        btnlogin = findViewById(R.id.generate_barcode);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //for url creation
                strResponse = "upi://pay?pn="+"shweta shilwant".replaceAll("\\s+", "_")+"@ybl&pn="+"7249290328"+"&pac="+"straccountno";
                Log.d("TAGParser","parseData:"+strResponse);
                // response_url.setText(strResponse);

                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("response",strResponse);
                startActivity(i);
            }
        });



    }

}