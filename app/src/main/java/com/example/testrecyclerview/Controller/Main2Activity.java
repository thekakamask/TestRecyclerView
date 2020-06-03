package com.example.testrecyclerview.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testrecyclerview.R;

public class Main2Activity extends AppCompatActivity  {

    private TextView mTitle;
    private TextView mDate;
    private TextView mContent;
    private TextView mAuthor;
    private TextView mOrigins;
    private ImageView mCovertPic;
    private Button mReturnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTitle = (TextView) findViewById(R.id.titre2);
        mOrigins = (TextView) findViewById(R.id.source2);
        mAuthor = (TextView) findViewById(R.id.auteur2);
        mDate = (TextView) findViewById(R.id.date2);
        mCovertPic= (ImageView) findViewById(R.id.image2);
        mContent = (TextView) findViewById(R.id.contenu);
        mReturnButton = (Button) findViewById(R.id.button_return);


    }

}
