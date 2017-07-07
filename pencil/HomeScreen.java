package example.tutorial.pencil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast; //import for the pop up small message.
//create imports:
import android.widget.TextView;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

import org.w3c.dom.Text;

public class HomeScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //cCREATING THE INSTANCE OF THE STRING USERNAME:
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.tvUserName); //setting the textView field to that of tvUserName

        //set the textView variable to the name of the username
        tv.setText(username);

        //CONINUATION OF JAVA BUILT-IN CODE LIBRARY:
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    //*******************************************************************
    //CREATING THE NEW INTENT/ ACTIVITY FOR THE FINAL GRADE ACTIVITY PAGE,
    //START OF THE first INTENT, which is a basic calculator
    //CALCULATOR INTENT: BUTTON
    //*******************************************************************
    public void onClickCalculator(View view)
    {
        Intent i = new Intent(this, Basic_Calculator.class);
        startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Basic Calculator", Toast.LENGTH_SHORT).show();
    }
    //END OF FIRST INTENT


    //**********************************************************************
    //CREATING THE NEW INTENT/ ACTIVITY FOR THE FINAL GRADE ACTIVITY PAGE. It allows users to input HW Assignments
    //"INPUT USER ASSIGNMENTS" button
    //**********************************************************************
    public void onClickInputAssignment(View view)
    {
       Intent i = new Intent(this, CourseListGPA.class);
        startActivity(i);

        //Button button = (Button)findViewById(R.id.button);
        Button button = (Button) view;
        ((Button) view).setText("Input All your assignments and be notified before they're due!");


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Lets Begin!", Toast.LENGTH_SHORT).show();
    }
    //END OF SECOND INTENT


    //*******************************************************************
    //CREATING THE NEW INTENT/ ACTIVITY FOR THE FINAL GRADE ACTIVITY PAGE, INCASE THE USER CLICKS ON
    //"CALCULATE FINAL GRADE BUTTON"
    //*******************************************************************
    public void onClickFinalGrade(View view)
    {
        Intent i = new Intent(this, Final_Grade.class);
        startActivity(i);

        //Button button = (Button)findViewById(R.id.button);
        Button button = (Button) view;
        ((Button) view).setText("This calculates the final grade for your course!");


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Lets Begin!", Toast.LENGTH_SHORT).show();
    }
    //END OF third INTENT


    //**********************************************************************
    //CREATING THE NEW INTENT/ ACTIVITY FOR THE FINAL GRADE ACTIVITY PAGE. It allows users to calculate the minimum
    // grade they would need in order to pass the course!
    //"Calculate Minimum Grade" button
    //**********************************************************************
    public void onClickMinGrade(View view)
    {
        // Intent i = new Intent(this, Final_Grade.class);
        //startActivity(i);

        //Button button = (Button)findViewById(R.id.button);
        Button button = (Button) view;
        ((Button) view).setText("Calculates the minimum grade required to get the desired grade!");


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Lets Begin!", Toast.LENGTH_SHORT).show();
    }
    //END OF Fourth INTENT


    //**********************************************************************
    //CREATING THE NEW INTENT/ ACTIVITY FOR THE FINAL GRADE ACTIVITY PAGE. It allows users to calculate their cumulative
    // GPA for all their courses!
    //"Find Out GPA" button
    //**********************************************************************
    public void onClickGPA(View view)
    {
         Intent i = new Intent(this, Calculations.class);
        startActivity(i);

        //Button button = (Button)findViewById(R.id.button);
        Button button = (Button) view;
        ((Button) view).setText("Find out your cumulative GPA for your courses!");


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Lets Begin!", Toast.LENGTH_SHORT).show();
    }
    //END OF Fifth INTENT

   public void onClickWelcomeText(View view) {
    SignUpPage SignUp = new SignUpPage();
     Intent i = new Intent(this, UserProfile.class);

       startActivity(i);
   }




}



