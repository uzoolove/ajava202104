package com.multicampus.multichat20210430;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterBtn = findViewById(R.id.enterBtn);
        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String server = ((TextView)findViewById(R.id.server)).getText().toString();
                String nickname = ((TextView)findViewById(R.id.nickname)).getText().toString();
                System.out.println(server);
                System.out.println(nickname);

                // ChatActivity 호출
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("server", server);
                intent.putExtra("nickname", nickname);
                startActivity(intent);
            }
        });
    }
}