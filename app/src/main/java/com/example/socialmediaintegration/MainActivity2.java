package com.example.socialmediaintegration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.TextViewId);
        textView2=findViewById(R.id.EmailID);
        textView3=findViewById(R.id.google_logout);
        textView4=findViewById(R.id.facebook_logout);
        imageView=findViewById(R.id.ImageViewId);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("name");
            showDetails(value);
        }
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void showDetails(String s)
    {
       if(s.equals("Aniruddha Roy"))
       {
           textView1.setText(s);
           imageView.setImageResource(R.drawable.ppg);
       }
    }

}