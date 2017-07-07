package example.tutorial.pencil;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GPA_Grades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa__grades);
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

        //CREATE A MEHTOD THAT WILL ALLOW THE DATA FROM APPLES CLASS TO BE PASSED TO THIS ACTIVITY:
        Bundle applesData = getIntent().getExtras();

        //if the user did not give a text, the program will not give an error
        if (applesData == null) {
            return;
        }

        //calling the first apple message on this intent:
        String appleMessage = applesData.getString("courses1Message");
        final TextView course1TV = (TextView) findViewById(R.id.course1TV);
        course1TV.setText(appleMessage); //SET THE TEXT OF ORANGE SCREEN THAT WAS OF APPLE(APPLEMESSAGE)

        //calling the first message on this intent:
        String appleMessage2 = applesData.getString("courses2Message");
        final TextView course2TV = (TextView) findViewById(R.id.course2TV);
        course2TV.setText(appleMessage2); //SET THE TEXT OF ORANGE SCREEN THAT WAS OF APPLE(APPLEMESSAGE)

        //calling the first apple message on this intent:
        String appleMessage3 = applesData.getString("courses3Message");
        final TextView course3TV = (TextView) findViewById(R.id.course3TV);
        course3TV.setText(appleMessage3);

        //calling the first message on this intent:
        String appleMessage4 = applesData.getString("courses4Message");
        final TextView course4TV = (TextView) findViewById(R.id.course4TV);
        course4TV.setText(appleMessage4);

        //calling the first message on this intent:
        String appleMessage5 = applesData.getString("courses5Message");
        final TextView course5TV = (TextView) findViewById(R.id.course5TV);
        course5TV.setText(appleMessage5);

        //calling the first message on this intent:
        String appleMessage6 = applesData.getString("courses6Message");
        final TextView course6TV = (TextView) findViewById(R.id.course6TV);
        course6TV.setText(appleMessage6);

        //END OF THIS METHOD


    }

    public void onClickCalculateButton(View v) {
        EditText b1 = (EditText) findViewById(R.id.gradeText);
        EditText b2 = (EditText) findViewById(R.id.gradeText2);
        EditText b3 = (EditText) findViewById(R.id.gradeText3);
        EditText b4 = (EditText) findViewById(R.id.gradeText4);
        EditText b5 = (EditText) findViewById(R.id.gradeText5);
        EditText b6 = (EditText) findViewById(R.id.gradeText6);
        //EditText a7 = (EditText) findViewById(R.id.gradeText);

        TextView tv = (TextView) findViewById(R.id.gpa); //textView line where the result will display

        double lGrade1, lGrade2, lGrade3, lGrade4, lGrade5, lGrade6, average, creditHours, creditHoursTotal, grade; //creating num variables for each EditText

        lGrade1 = Double.parseDouble(b1.getText().toString());
        lGrade2 = Double.parseDouble(b2.getText().toString());
        lGrade3 = Double.parseDouble(b3.getText().toString());
        lGrade4 = Double.parseDouble(b4.getText().toString());
        lGrade5 = Double.parseDouble(b5.getText().toString());
        lGrade6 = Double.parseDouble(b6.getText().toString());

        String finalGrade;


        if (v.getId() == R.id.nextButton)
        {

           average =lGrade6+ lGrade5 + lGrade4 +lGrade3 +lGrade2 +lGrade1;
            tv.setText(average + " gpa");


        }
    }

}


