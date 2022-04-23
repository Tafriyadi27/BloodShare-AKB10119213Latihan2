package com.skullbreker.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Tanggal Pengerjaan   : 22-April-2022
// Deskripsi Pengerjaan : 22-April-2022
//                       - Mengerjakan Layout activity_main(Welcome)
//                       - Membuat Class MainActivity(Welcome)
//                       - Memasangkan logika pada Text "Register" agar bisa dijadikan sebagai tombol dan dapt pindah halaman dari MainActivity.java ke class RegisterActivity.java
//                       - Mengerjakan Layout activity_register
//                       - Membuat Class RegisterActivity
//                       - Memasangkan logika pada Button "Register" agar dapat pindah halaman dari RegisterActivity.java ke class AlmostThereActivity.java
//                        23-April-2022
//                       - Mengerjakan Layout activity_almostthere
//                       - Membuat Class AlmostThereActivity
//                       - Memasangkan logika pada Button "Verify" agar dapat pindah halaman dari AlmostThereActivity.java ke class VerifyActivity.java
//                       - Mengerjakan Layout activity_verify
//                       - Membuat Class VerifyActivity
//                       - Memasangkan logika pada Button "Send" agar dapat pindah halaman dari VerifyActivity.java ke class HomeActivity.java
//                       - Mengerjakan Layout activity_home
//                       - Membuat Class HomeActivity
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.register);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}