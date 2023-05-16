package com.example.quiz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

public class splash extends AppCompatActivity {
    private static final int PREMISSION_CONSTANT = 100;
    private static final int REQUEST_PROMISSION_SETTING = 101;


    String[] premissionsReq = new String[]{
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.RECORD_AUDIO

    };

    private SharedPreferences preferencesStatus;
    private boolean sentToSettings = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        preferencesStatus = getSharedPreferences("premissionStatus", MODE_PRIVATE);

        if (ActivityCompat.checkSelfPermission(splash.this, premissionsReq[0]) != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(splash.this, premissionsReq[1]) != PackageManager.PERMISSION_GRANTED
        ) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(splash.this, premissionsReq[0])
                    || ActivityCompat.shouldShowRequestPermissionRationale(splash.this, premissionsReq[1])
            ) {
                AlertDialog.Builder builder = new AlertDialog.Builder(splash.this);
                builder.setTitle("Need Permission");
                builder.setMessage("Allow the Storage and Record Audio permissions");
                builder.setPositiveButton("Thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.requestPermissions(splash.this, premissionsReq, PREMISSION_CONSTANT);

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();

            } else if (preferencesStatus.getBoolean(premissionsReq[0], false)) {

                AlertDialog.Builder builder = new AlertDialog.Builder(splash.this);
                builder.setTitle("Need Permission");
                builder.setMessage("Allow the Storage and Record Audio permissions");
                builder.setPositiveButton("Thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        sentToSettings = true;

                        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                        Uri uri = Uri.fromParts("pacfage", getPackageName(), null);
                        intent.setData(uri);
                        startActivityForResult(intent, REQUEST_PROMISSION_SETTING);

                    }
                });

                builder.setNegativeButton("Cansel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            } else {
                ActivityCompat.requestPermissions(splash.this, premissionsReq, PREMISSION_CONSTANT);
            }

        } else {
            proceedAfterPremission();

        }
    }/*onCreate*/


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);


        if (requestCode == PREMISSION_CONSTANT) {

            boolean allgranted = true;

            for (int i = 0; i < grantResults.length; i++) {

                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    allgranted = true;

                } else {
                    allgranted = false;
                }

            }
            if (allgranted) {
                proceedAfterPremission();
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(splash.this, premissionsReq[0])
                    || ActivityCompat.shouldShowRequestPermissionRationale(splash.this, premissionsReq[1])
            ) {
                AlertDialog.Builder builder = new AlertDialog.Builder(splash.this);
                builder.setTitle("Need Permission");
                builder.setMessage("Allow the Storage and Record Audio permissions");
                builder.setPositiveButton("Thanks", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.requestPermissions(splash.this, premissionsReq, PREMISSION_CONSTANT);

                    }
                });

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();


            } else {
                Toast.makeText(this, "Unable to get Permission", Toast.LENGTH_SHORT).show();
            }
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_PROMISSION_SETTING) {
            if (ActivityCompat.checkSelfPermission(splash.this, premissionsReq[0]) == PackageManager.PERMISSION_GRANTED) {

            proceedAfterPremission();
            }

        }
        }

        private void proceedAfterPremission () {
            Toast.makeText(this, "Got all permissions", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }









