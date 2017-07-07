package example.tutorial.pencil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GPA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gp);
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


    //***********************************************
    //This method does all the calculations for the credit hours that are entered by the user
    //This will take the full number and find the average
    //***********************************************************
    public void onClickCalculate(View v) {
        EditText a1 = (EditText) findViewById(R.id.course1Grade);
        EditText a2 = (EditText) findViewById(R.id.course2Grade);
        EditText a3 = (EditText) findViewById(R.id.course3Grade);
        EditText a4 = (EditText) findViewById(R.id.course4Grade);
        EditText a5 = (EditText) findViewById(R.id.course5Grade);
        EditText a6 = (EditText) findViewById(R.id.course6Grade);


        //TextView tv = (TextView) findViewById(R.id.gpaResult);
        //CREATE A LABEL RESULT
        TextView t = (TextView)findViewById(R.id.total); //textView line where the result will display

        double grade1, grade2, grade3, grade4, grade5, grade6, points, creditHours, creditHoursTotal, ans; //creating num variables for each EditText

        //DECLARING EACH COURSEGRADE(a1,a2,etc) EQUAL TO grade1, grade2, grade3 ETC
        grade1 = Double.parseDouble(a1.getText().toString());
        grade2 = Double.parseDouble(a2.getText().toString());
        grade3 = Double.parseDouble(a3.getText().toString());
        grade4 = Double.parseDouble(a4.getText().toString());
        grade5 = Double.parseDouble(a5.getText().toString());
        grade6 = Double.parseDouble(a6.getText().toString());
        //num7 = Double.parseDouble(a7.getText().toString());
        points = 0; //DECLARING ANS TO 0 FOR INITIALIZATION
        creditHours = 3;
        creditHoursTotal = creditHours * 5; //5 is the number of courses
        ans = 0;

        //calculated the average for the input of gpa
        if (v.getId() == R.id.calculateButton) {
           // points = (grade1 * creditHours) + (grade2 * creditHours) + (grade3 * creditHours) + (grade4 * creditHours) + (grade5 * creditHours);
            points = grade1 + grade2 + grade3 + grade4 + grade5 + grade6;

            //ans = points / creditHoursTotal;
        }
        //t.setText(ans + " GPA");
        t.setText(points + " Credits");
    }

    public void onClickNext(View view) {
        Intent i = new Intent(this, GPA_Grades.class);

        //creates a usable variable to hold data
        // fot applesInput
        //referencing the second input text option!
        final TextView course1TV = (TextView) findViewById(R.id.course1TV);
        final TextView course2TV = (TextView) findViewById(R.id.course2TV);
        final TextView course3TV = (TextView) findViewById(R.id.course3TV);
        final TextView course4TV = (TextView) findViewById(R.id.course4TV);
        final TextView course5TV = (TextView) findViewById(R.id.course5TV);
        final TextView course6TV = (TextView) findViewById(R.id.course6TV);


        String userMessage = course1TV.getText().toString();
        i.putExtra("courses1Message", userMessage); //java method that allows a value to hold and actually pass it to
        // the other activity


        String anotherUserMessage = course2TV.getText().toString();
        i.putExtra("courses2Message", anotherUserMessage);


        String thirdUserMessage = course3TV.getText().toString();
        i.putExtra("courses3Message", thirdUserMessage);

        String fourthUserMessage = course4TV.getText().toString();
        i.putExtra("courses4Message", fourthUserMessage);

        String fifthUserMessage = course5TV.getText().toString();
        i.putExtra("courses5Message", fifthUserMessage);

        String sixthUserMessage = course6TV.getText().toString();
        i.putExtra("courses6Message", sixthUserMessage);

        startActivity(i); //this basically asks where to launch the activity to and it sends it to 'i'
        //which is the intent we created.

    }
}
