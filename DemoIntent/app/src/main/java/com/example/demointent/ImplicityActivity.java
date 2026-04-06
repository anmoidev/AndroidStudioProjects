package com.example.demointent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ImplicityActivity extends AppCompatActivity {

    ImageButton btnCalling, btnCamera, btnGallery, btnSSMS, btnWeb;
    ImageView imgAnh;

    private static final int REQ_CAMERA = 1;
    private static final int REQ_GALLERY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_implicity);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mapping();
        addAction();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menuCalling) {
            openDial();
        } else if (item.getItemId() == R.id.menuCamera) {
            openCamera();
        } else if (item.getItemId() == R.id.menuWeb) {
            openWeb();
        } else if (item.getItemId() == R.id.menuSSMS) {
            openSMS();
        } else if (item.getItemId() == R.id.menuGallery) {
            openGallery();
        }

        return true;
    }

    private void addAction() {

        btnCalling.setOnClickListener(v -> openDial());

        btnCamera.setOnClickListener(v -> openCamera());

        btnGallery.setOnClickListener(v -> openGallery());

        btnSSMS.setOnClickListener(v -> openSMS());

        btnWeb.setOnClickListener(v -> openWeb());

    }

    private void openDial() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0993213121"));
        startActivity(intent);
    }

    private void openCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQ_CAMERA);
    }

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, REQ_GALLERY);
    }

    private void openSMS() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("sms:0993213121"));
        intent.putExtra("sms_body", "Xin chào bạn!");
        startActivity(intent);
    }

    private void openWeb() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://daotao.utt.edu.vn"));
        startActivity(intent);
    }


    private void mapping() {
        btnCalling = findViewById(R.id.btnCalling);
        btnCamera = findViewById(R.id.btnCamera);
        btnGallery = findViewById(R.id.btnGallery);
        btnSSMS = findViewById(R.id.btnSSMS);
        btnWeb = findViewById(R.id.btnWeb);
        imgAnh = findViewById(R.id.imgAnh);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // CAMERA
        if (requestCode == REQ_CAMERA && resultCode == RESULT_OK && data != null) {
            Bundle extras = data.getExtras();
            if (extras != null) {
                Bitmap bitmap = (Bitmap) extras.get("data");
                imgAnh.setImageBitmap(bitmap);
            }
        }

        if (requestCode == REQ_GALLERY && resultCode == RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            imgAnh.setImageURI(imageUri);
        }
    }
}