package com.example.dialogbox;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class DigiCardActivity extends AppCompatActivity {

    TextInputLayout edtfullname, edtDesignation, edtCompnay, edtAbout, edtContact, edtwpnumber, edtmail, edtAddress, edtServices;

    RadioGroup Radiogroup;

    CircleImageView crcimage;
    ImageButton btngallery, btncamera;

    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digi_card);

        btnnext = findViewById(R.id.btnnext);

        intbinding();
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datapass();
            }
        });
    }
    void intbinding() {

        edtfullname = findViewById(R.id.edtfullname);
        edtDesignation = findViewById(R.id.edtDesignation);
        edtCompnay = findViewById(R.id.edtCompnay);
        edtAbout = findViewById(R.id.edtAbout);
        edtContact = findViewById(R.id.edtContact);
        edtwpnumber = findViewById(R.id.edtwpnumber);
        edtmail = findViewById(R.id.edtmail);
        edtAddress = findViewById(R.id.edtAddress);
        edtServices = findViewById(R.id.edtServices);
        btncamera = findViewById(R.id.btncamera);
        btngallery = findViewById(R.id.btngallery);
        btngallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 100);
            }
        });

        btncamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraintent, 101);
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 ) {
            if (data != null) {
                Uri uri = data.getData();
                crcimage.setImageURI(uri);
            }
        }
        else if(requestCode == 101){

            if (data!=null)
            {
                Bitmap camera = (Bitmap) data.getExtras().get("data");
                crcimage.setImageBitmap(camera);
            }
        }

    }
    void datapass() {
//User Data Get...
        String name = edtfullname.getEditText().getText().toString();
        String designation = edtDesignation.getEditText().getText().toString();
        String compnay = edtCompnay.getEditText().getText().toString();
        String about = edtAbout.getEditText().getText().toString();
        String contact = edtContact.getEditText().getText().toString();
        String wpnumber = edtwpnumber.getEditText().getText().toString();
        String mail = edtmail.getEditText().getText().toString();
        String add = edtAddress.getEditText().getText().toString();
        String services = edtServices.getEditText().getText().toString();

        if (name.equalsIgnoreCase("")){
//            edtfullname.setHint("Full Name is required");
            edtfullname.setError("Full Name is required");//it gives user to info massege for required
        } if (designation.equalsIgnoreCase("")) {
            edtDesignation.setError("Designation is required");
        } if (compnay.equalsIgnoreCase("")) {
            edtCompnay.setHint("Compnay is required");
        } if (contact.equalsIgnoreCase("")) {
            edtContact.setError("Contact is required");
        } if (mail.equalsIgnoreCase("")) {
            edtmail.setError("Gmail is required");
        } if (add.equalsIgnoreCase("")) {
            edtAddress.setError("Address is required");
        } else {
            Intent intent = new Intent(DigiCardActivity.this, MainActivity.class);
            //User Data Store for Puting
            intent.putExtra("name", name);
            intent.putExtra("designation", designation);
            intent.putExtra("compnay", compnay);
            intent.putExtra("about", about);
            intent.putExtra("contact", contact);
            intent.putExtra("wpnumber", wpnumber);
            intent.putExtra("mail", mail);
            intent.putExtra("add", add);
            intent.putExtra("services", services);

            startActivity(intent);
        }

    }


}