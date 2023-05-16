package com.example.quiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.annotation.SuppressLint;


import android.os.CountDownTimer;

import android.view.MotionEvent;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private MediaRecorder mediaRecorder;
    public static String mFilesname1 = null;
    public static String mFilesname2 = null;
    public static String mFilesname3 = null;
    public static String mFilesname4 = null;
    public static String mFilesname5 = null;
    public static String mFilesname6 = null;
    public static String mFilesname7 = null;
    public static String mFilesname8 = null;
    public static String mFilesname9 = null;
    public static String mFilesname10 = null;

    boolean startrecording = true;

    public int recordingno;


    View d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch AdsSwitch;
     ImageButton record;


    private MediaPlayer mD1;
    private MediaPlayer mD2;
    private MediaPlayer mD3;
    private MediaPlayer mD4;
    private MediaPlayer mD5;
    private MediaPlayer mD6;
    private MediaPlayer mD7;
    private MediaPlayer mD8;
    private MediaPlayer mD9;
    private MediaPlayer mD10;
    private MediaPlayer mD11;
    private MediaPlayer mD12;
    private MediaPlayer mD13;
    private MediaPlayer mD14;
    private MediaPlayer mD15;
    private MediaPlayer mD16;
    private MediaPlayer mD17;

    ImageButton Btnsettings;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);


        mD1 = MediaPlayer.create(this, R.raw.d1);
        mD2 = MediaPlayer.create(this, R.raw.d2);
        mD3 = MediaPlayer.create(this, R.raw.d3);
        mD4 = MediaPlayer.create(this, R.raw.d4);
        mD5 = MediaPlayer.create(this, R.raw.d5);
        mD6 = MediaPlayer.create(this, R.raw.d6);
        mD7 = MediaPlayer.create(this, R.raw.d7);
        mD8 = MediaPlayer.create(this, R.raw.d8);
        mD9 = MediaPlayer.create(this, R.raw.d9);
        mD10 = MediaPlayer.create(this, R.raw.d10);
        mD11 = MediaPlayer.create(this, R.raw.d11);
        mD12 = MediaPlayer.create(this, R.raw.d12);
        mD13 = MediaPlayer.create(this, R.raw.d13);
        mD14 = MediaPlayer.create(this, R.raw.d14);
        mD15 = MediaPlayer.create(this, R.raw.d15);
        mD16 = MediaPlayer.create(this, R.raw.d16);
        mD17 = MediaPlayer.create(this, R.raw.d17);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);
        d12 = findViewById(R.id.d12);
        d13 = findViewById(R.id.d13);
        d14 = findViewById(R.id.d14);
        d15 = findViewById(R.id.d15);
        d16 = findViewById(R.id.d16);
        d17 = findViewById(R.id.d17);



        d1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD1.start();
                d1.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d1.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

        d2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD2.start();
                d2.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d2.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD3.start();
                d3.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d3.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD4.start();
                d4.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d4.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD5.start();
                d5.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d5.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD6.start();
                d6.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d6.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD7.start();
                d7.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d7.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD8.start();
                d8.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d8.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD9.start();
                d9.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d9.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d10.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD10.start();
                d10.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d10.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d11.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD11.start();
                d11.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d11.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d12.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD12.start();
                d12.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d12.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d13.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD13.start();
                d13.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d13.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d14.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD14.start();
                d14.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d14.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d14.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD14.start();
                d14.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d14.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d15.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD15.start();
                d15.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d15.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d16.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD16.start();
                d16.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d16.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });
        d17.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"NewApi", "ClickableViewAccessibility"})
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                mD17.start();
                d17.setBackgroundColor(getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        d17.setBackgroundColor(getColor(R.color.return_key));
                    }
                }.start();

                return false;
            }
        });

        ImageView Btnsettings = findViewById(R.id.Btnsettings);
        Button RecordButttonSoon = findViewById(R.id.buttonrec);
        Btnsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoAlert("Информационная справка");
            }
        });
        RecordButttonSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RecordSoonAlert("Функция записи аудио скоро будет доступна!");
            }
        });

        mFilesname1 = getExternalCacheDir().getAbsolutePath();
        mFilesname1 += "/audiorecordertest1.3gp";

        mFilesname2 = getExternalCacheDir().getAbsolutePath();
        mFilesname2 += "/audiorecordertest2.3gp";

        mFilesname3 = getExternalCacheDir().getAbsolutePath();
        mFilesname3 += "/audiorecordertest3.3gp";

        mFilesname4 = getExternalCacheDir().getAbsolutePath();
        mFilesname4 += "/audiorecordertest4.3gp";

        mFilesname5 = getExternalCacheDir().getAbsolutePath();
        mFilesname5 += "/audiorecordertest5.3gp";

        mFilesname6 = getExternalCacheDir().getAbsolutePath();
        mFilesname6 += "/audiorecordertest6.3gp";

        mFilesname7 = getExternalCacheDir().getAbsolutePath();
        mFilesname7 += "/audiorecordertest7.3gp";

        mFilesname8 = getExternalCacheDir().getAbsolutePath();
        mFilesname8 += "/audiorecordertest8.3gp";

        mFilesname9 = getExternalCacheDir().getAbsolutePath();
        mFilesname9 += "/audiorecordertest9.3gp";

        mFilesname10 = getExternalCacheDir().getAbsolutePath();
        mFilesname10 += "/audiorecordertest10.3gp";

        SharedPreferences prefs = getSharedPreferences("FILENO", MODE_PRIVATE);
        recordingno = prefs.getInt("fileno", 1);


    }
    public void recordBtn(View view) {
        onRecord(startrecording);
        startrecording = !startrecording;

    }





    @SuppressLint("WrongConstant")
    private void startRecording() {
        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);

        switch (recordingno) {
            case 1:
                mediaRecorder.setOutputFile(mFilesname1);
                recordingno++;
                if (recordingno==11)
                    recordingno = 1;
                break;
            case 2:
                mediaRecorder.setOutputFile((mFilesname2));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;
            case 3:
                mediaRecorder.setOutputFile((mFilesname3));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 4:
                mediaRecorder.setOutputFile((mFilesname4));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;
            case 5:
                mediaRecorder.setOutputFile((mFilesname5));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 6:
                mediaRecorder.setOutputFile((mFilesname6));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 7:
                mediaRecorder.setOutputFile((mFilesname7));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 8:
                mediaRecorder.setOutputFile((mFilesname8));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 9:
                mediaRecorder.setOutputFile((mFilesname9));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;

            case 10:
                mediaRecorder.setOutputFile((mFilesname10));
                recordingno++;
                if (recordingno == 11)
                    recordingno = 1;
                break;



        }

        SharedPreferences.Editor editor = getSharedPreferences("FILENO", MODE_PRIVATE).edit();
        editor.putInt("fileno", recordingno);
        editor.commit();

        mediaRecorder.setAudioSource(MediaRecorder.AudioEncoder.AMR_NB);  /*OBRATIT VNIMANIE POZGE*/
        try {
            mediaRecorder.prepare();
        } catch (IOException e){
            Log.e("prepare is failed", "Failed");
        }
        mediaRecorder.start();






    }
    private void stopRecording(){
        mediaRecorder.stop();
        mediaRecorder.release();
        mediaRecorder = null;

    }

    private void onRecord(boolean start){
        if(start){
            startRecording();
        }
        else{
            stopRecording();
            if (recordingno == 1){
                Toast recordingmsg = Toast.makeText(getApplicationContext(),"Melody" + 10 + "saved", Toast.LENGTH_SHORT);
                recordingmsg.show();
            }
            else{
                int temprecordingno = recordingno - 1;
                Toast recordingmsg = Toast.makeText(getApplicationContext(),"Melody" + temprecordingno+ "saved", Toast.LENGTH_SHORT);
                recordingmsg.show();
            }

        }
    }

    private void showInfoAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Информационная справка");
        builder.setMessage("Кали́мба — африканский ударный музыкальный инструмент класса ламеллафонов или щипковых язычковых идиофонов." +
                " Калимба используется в традиционных обрядах и профессиональными музыкантами в основном как аккомпанирующий инструмент. Играют отдельными звуками или аккордами. Большие калимбы придают неповторимый низкий гул живым басовым ритмам африканской музыки, маленькие издают " +
                "совершенно прозрачное, хрупкое звучание, похожее на музыкальную шкатулку." +
                "На резонаторном корпусе (бывает разной формы) размещается ряд или несколько рядов деревянных, бамбуковых или металлических пластин-язычков, служащих источником звука. У простейших образцов — плоский, у более сложных — полостной резонатор из панциря черепахи, долбленого дерева, полой тыквы и др., на резонаторной доске крепятся язычки (4—30). Высокий порожек ограничивает звучащую часть язычков. При игре (стоя, на ходу, сидя) калимбу зажимают ладонями рук, согнутых под прямым углом и плотно прижатых к бокам, или держат на коленях, большими и указательными пальцами обеих рук защипывают и отпускают свободные (верхние) концы язычков, приводя их в состояние вибрации. Калимбы бывают различных размеров; длина корпуса 100—350 мм, длина язычков 30—100 мм, их ширина 3—5 мм. Звукоряд калимбы зависит от количества язычков.\n" +
                "\n" +
                "Интересный факт, но в качестве резонатора выступает корпус с круглым отверстием, он может быть цельный или полый из дерева, высушенной тыквы или панциря черепахи");
        builder.setCancelable(false);
        builder.setPositiveButton("Выйти из приложения", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Продолжить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialoginfo = builder.create();
        dialoginfo.show();
    }
    private void showInfo(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    private void RecordSoonAlert(String text){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Comming soon");
        builder.setMessage("Функция записи звука скоро будет доступна!" );
        builder.setCancelable(false);
        builder.setPositiveButton("Выйти из приложения", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Продолжить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialoginfo = builder.create();
        dialoginfo.show();
    }
    private void RecordSoon(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }






    @Override
    public void onClick(View v) {

    }
}

