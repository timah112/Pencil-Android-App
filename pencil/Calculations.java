package example.tutorial.pencil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Calculations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculations);
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

    /*****************************
     //OUR CODE:
     //Starts here:
     */////////////////////////////
    //******************************************************************
    //This method connects the previos activity to this one and turns the courses
    //entered from the other one, to this activity
    //
    //******************************************************************
    public void onClickNextButton(View view) //CREATE A NEW onCLick method!
    {
        Intent i = new Intent(this, GPA.class); //defines which activity/class it will go to.

        //creates a usable variable to hold data
        // fot applesInput
        //referencing the second input text option!
        final EditText coursesInput1 = (EditText) findViewById(R.id.coursesInput1);
        final EditText coursesInput2 = (EditText) findViewById(R.id.coursesInput2);
        final EditText coursesInput3 = (EditText) findViewById(R.id.coursesInput3);
        final EditText coursesInput4 = (EditText) findViewById(R.id.coursesInput4);
        final EditText coursesInput5 = (EditText) findViewById(R.id.coursesInput5);
        final EditText coursesInput6 = (EditText) findViewById(R.id.coursesInput6);


        String userMessage = coursesInput1.getText().toString();
        i.putExtra("courses1Message", userMessage); //java method that allows a value to hold and actually pass it to
        // the other activity


        String anotherUserMessage = coursesInput2.getText().toString();
        i.putExtra("courses2Message", anotherUserMessage);


        String thirdUserMessage = coursesInput3.getText().toString();
        i.putExtra("courses3Message", thirdUserMessage);

        String fourthUserMessage = coursesInput4.getText().toString();
        i.putExtra("courses4Message", fourthUserMessage);

        String fifthUserMessage = coursesInput5.getText().toString();
        i.putExtra("courses5Message", fifthUserMessage);

        String sixthUserMessage = coursesInput6.getText().toString();
        i.putExtra("courses6Message", sixthUserMessage);

        startActivity(i); //this basically asks where to launch the activity to and it sends it to 'i'
        //which is the intent we created.

    }

    //public void onClickNextButton(View view)
    //{
       // Intent i = new Intent(this, GPA.class);
        //startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Good Job!", Toast.LENGTH_SHORT).show();
    //}

    public void onClickMoreButton(View view)
    {
        Intent i = new Intent(this, GPA_Qestions_2.class);
        startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Good Job!", Toast.LENGTH_SHORT).show();
    }
}
