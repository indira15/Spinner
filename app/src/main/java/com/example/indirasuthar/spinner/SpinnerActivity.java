package com.example.indirasuthar.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.start;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class SpinnerActivity extends AppCompatActivity {

    public TextView display ;
    public Spinner degree;
    public EditText message;

    public courselist cList = new courselist();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

    }

    public void onClickCheckAvail(View view){

        display = (TextView) findViewById(R.id.display);
        degree= (Spinner) findViewById(R.id.courses);
        String getDegree = String.valueOf(degree.getSelectedItem());

        List<String> listofcourses = cList.chooseCourse(getDegree);
        StringBuilder list = new StringBuilder();
        for(String course : listofcourses)
        {
            list.append(course).append('\n');
        }
        display.setText(list);

    }
    public void OnSendMessage(View view){

        message = (EditText) findViewById(R.id.message);
        String msgText = message.getText().toString();
        Intent intent = new Intent(this,ReceiveActivity.class);
        intent.putExtra(ReceiveActivity.EXTRA_MESSAGE , msgText );
        startActivity(intent);

    }

}
