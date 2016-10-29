package org.androidtown.barcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ScanResult extends  MainActivity {


  //  private TextView contentsText;
   // private String scannedUrl;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        //  contentsText = (TextView) findViewById(R.id.contentsText);


        Intent intent = getIntent();
        String strName = intent.getStringExtra("name");
        String strAuthor = intent.getStringExtra("author");
        String strPublisher = intent.getStringExtra("publisher");
        String strAvaiable = intent.getStringExtra("T/F");

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("책 제목 " + strName + "저 자 " + strAuthor + "출판사 " + strPublisher + "대출가능여부 " + strAvaiable);

        Button BtnYes = (Button) findViewById(R.id.BtnYes);
        Button BtnNo = (Button) findViewById(R.id.BtnNo);

        BtnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Activity 의 메서드 - 현재 보이는 Activity를 종료
            }
        });


    }
}









