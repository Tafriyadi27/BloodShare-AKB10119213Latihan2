package com.skullbreker.bloodshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Tanggal Pengerjaan   : 22-April-2022
// Deskripsi Pengerjaan : 22-April-2022
//                       - Mengerjakan dan Mendesign Layout activity_main(Welcome)
//                       - Membuat Class MainActivity(Welcome)
//                       - Memasangkan logika pada Text "Register" agar bisa dijadikan sebagai tombol dan dapt pindah class dari MainActivity.java ke class RegisterActivity.java
//                       - Mengerjakan dan Mendesign Layout activity_register
//                       - Membuat Class RegisterActivity
//                       - Memasangkan logika pada Button "Register" agar dapat pindah class dari RegisterActivity.java ke class AlmostThereActivity.java
//                        23-April-2022
//                       - Mengerjakan dan Mendesign Layout activity_almostthere
//                       - Membuat Class AlmostThereActivity
//                       - Memasangkan logika pada Button "Verify" agar dapat pindah class dari AlmostThereActivity.java ke class VerifyActivity.java
//                       - Mengerjakan dan Mendesign Layout activity_verify
//                       - Membuat Class VerifyActivity
//                       - Memasangkan logika pada Button "Send" agar dapat pindah class dari VerifyActivity.java ke class HomeActivity.java
//                       - Mengerjakan dan Mendesign Layout activity_home
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

        textView= findViewById(R.id.register);
        textView.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}