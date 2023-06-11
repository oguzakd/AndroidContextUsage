package com.oguzhanakduman.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view){
        // AlertDialog nesnesinin oluşturulduğu yer
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        // AlertDialog'un Başlığı
        alertDialog.setTitle("Save");
        // AlertDialog'un Açıklaması
        alertDialog.setMessage("Are you sure?");

        // AlertDialog penceresinde yes butonu oluşturma
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
            // Yes butonuna tıklanınca ne olacağı bu alana çalışır - Saved
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // context olarak verilen MainActivityContext.this direkt olarak bu activity'nin context'idir.
                Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener(){
            // No butonuna tıklanınca ne olacağı bu alana çalışır - Saved
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Burada ise tüm application'ın context'i olan getApplicationContext methodu ile, AppContext kullanıldı.
                Toast.makeText(getApplicationContext(),"Not Saved",Toast.LENGTH_LONG).show();
            }
        });

        alertDialog.show();

    }
}