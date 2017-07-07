package example.tutorial.pencil;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
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





    //CREATING THE LINK TO THE INTENT:
    //public void onClickCreate(View view) {
      //  Intent i = new Intent(this, MainActivity.class);
        //startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Created!", Toast.LENGTH_SHORT).show();
    //}

    /*****************************
     //OUR CODE:
     //Starts here:
     */////////////////////////////
    //******************************************************************
    //This method connects the previos activity to this one and turns the courses
    //entered from the other one, to this activity
    //
    //******************************************************************
    public void onClickCreate(View view) //CREATE A NEW onCLick method!
    {
        SignUpPage Signup[];

        Intent i = new Intent(this, GradeLevel.class); //defines which activity/class it will go to.
        //Intent z = new Intent(this, UserProfile.class);

        //creates a usable variable to hold data
        // fot applesInput
        //referencing the second input text option!
        final EditText nameText = (EditText) findViewById(R.id.nameText);
        final EditText emailText= (EditText) findViewById(R.id.emailText);
        final EditText userNameText= (EditText) findViewById(R.id.userNameText);
        final EditText ageText = (EditText) findViewById(R.id.ageText);

        String userMessage = nameText.getText().toString();
        i.putExtra("courses1Message", userMessage); //java method that allows a value to hold and actually pass it to

        // the other activity

        String anotherUserMessage = emailText.getText().toString();
        i.putExtra("courses2Message", anotherUserMessage);

        String thirdUserMessage = userNameText.getText().toString();
        i.putExtra("courses3Message", thirdUserMessage);

        String fourthUserMessage = ageText.getText().toString();
        i.putExtra("courses4Message", fourthUserMessage);


        //startActivity(z); //this basically asks where to launch the activity to and it sends it to 'i'
        //which is the intent we created.
        startActivity(i);

    }

     //public void onClickCreate(View view) {
       //  Intent i = new Intent(this, MainActivity.class);
         //startActivity(i);
     //}

}