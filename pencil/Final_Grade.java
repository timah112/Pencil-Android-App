package example.tutorial.pencil;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Final_Grade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__grade);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClickContinue(View v)
    {
        EditText a1 =(EditText)findViewById (R.id.quizText);
        EditText a2 =(EditText)findViewById (R.id.testText);
        EditText a3 =(EditText)findViewById (R.id.homeWorkText);
        EditText a4 =(EditText)findViewById (R.id.finalText);
        EditText a5 =(EditText)findViewById (R.id.projectText);
        EditText a6 =(EditText)findViewById (R.id.partText);
        EditText a7 =(EditText)findViewById (R.id.otherText);

        TextView tv = (TextView)findViewById(R.id.tResult); //textView line where the result will display
        boolean flag = false; //SO THERE IS NO DIVISION BY 0 ERROR

        double num1, num2, num3, num4, num5, num6, num7, ans; //creating num variables for each EditText

        num1 = Double.parseDouble(a1.getText().toString());
        num2 = Double.parseDouble(a2.getText().toString());
        num3 = Double.parseDouble(a3.getText().toString());
        num4 = Double.parseDouble(a4.getText().toString());
        num5 = Double.parseDouble(a5.getText().toString());
        num6 = Double.parseDouble(a6.getText().toString());
        num7 = Double.parseDouble(a7.getText().toString());
        ans = 0; //DECLARING ANS TO 0 FOR INITIALIZATION

        //creating if statement when the user presses the +,- , *, or / button:
        if(v.getId() == R.id.continueButton)
        {
            ans = num1 + num2 + num3+ num4+ num5+ num6+ num7;
        }
        tv.setText(ans + " %");

    }



}
