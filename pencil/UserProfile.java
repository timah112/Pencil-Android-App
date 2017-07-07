package example.tutorial.pencil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
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
        if (applesData==null)
        {
            return;
        }

        //calling the first apple message on this intent:
        String appleMessage = applesData.getString("courses1Message");
        final TextView nameText = (TextView) findViewById(R.id.nameText);
        nameText.setText(appleMessage); //SET THE TEXT OF ORANGE SCREEN THAT WAS OF APPLE(APPLEMESSAGE)

        //calling the first message on this intent:
        String appleMessage2 = applesData.getString("courses2Message");
        final TextView emailText = (TextView) findViewById(R.id.emailText);
        emailText.setText(appleMessage2); //SET THE TEXT OF ORANGE SCREEN THAT WAS OF APPLE(APPLEMESSAGE)

        //calling the first apple message on this intent:
        String appleMessage3 = applesData.getString("courses3Message");
        final TextView userNameText = (TextView) findViewById(R.id.userNameText);
        userNameText.setText(appleMessage3);

        //calling the first message on this intent:
        String appleMessage4 = applesData.getString("courses4Message");
        final TextView ageText = (TextView) findViewById(R.id.ageText);
        ageText.setText(appleMessage4);


        //END OF THIS METHOD
    }
    public void onClickHomeButton(View view) {
        Intent i = new Intent(this, HomeScreen.class);
        startActivity(i);
    }
}



