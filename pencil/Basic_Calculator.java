package example.tutorial.pencil;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Basic_Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic__calculator2);
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

    public void onButtonClick(View v)
    {
        //CREATE 2 EDITTEXT VARIABLES for edit text fields
        EditText a1 =(EditText)findViewById (R.id.fNum1);
        EditText a2 =(EditText)findViewById (R.id.sNum2);

        //CREATE A LABEL RESULT
        TextView tv = (TextView)findViewById(R.id.lResult); //textView line where the result will display
        boolean flag = false; //SO THERE IS NO DIVISION BY 0 ERROR

        double num1, num2, ans; //creating num variables
        num1 = Double.parseDouble(a1.getText().toString());
        num2 = Double.parseDouble(a2.getText().toString());
        ans = 0; //DECLARING ANS TO 0 FOR INITIALIZATION

        //creating if statement when the user presses the +,- , *, or / button:
        if(v.getId() == R.id.addButton)
        {
            ans = num1 + num2;
        }


        if(v.getId() == R.id.subtractButton)
        {
            ans = num1 - num2;
        }

        if(v.getId() == R.id.multButton)
        {
            ans = num1 * num2;
        }

        if(v.getId() == R.id.divButton)
        {
            if (num2 ==0)
            {
                flag= true;
            }
            ans = num1 / num2;
        }

        if(v.getId() == R.id.percentButton)
        {
            ans = (float) ((num1 * 0.01) * num2);
        }


        tv.setText(ans + "");
    }


}
