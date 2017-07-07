package example.tutorial.pencil;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
{
    Button btnSignIn,btnSignUp;
    LoginDatabaseAdapter loginDataBaseAdapter;

    //NAME OF THE METHOD NAMES THAT GET CALLED WHENEVER THE USER CLICKS THE ACTUAL BUTTONS


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // create a instance of SQLite Database
        loginDataBaseAdapter = new LoginDatabaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();

        // Get The Refference Of Buttons
        btnSignIn = (Button) findViewById(R.id.buttonSignIN);
        btnSignUp = (Button) findViewById(R.id.buttonSignUP);

        // Set OnClick Listener on SignUp button
        //public void signUp() {
            btnSignUp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // TODO Auto-generated method stu
                    // Create Intent for SignUpActivity  abd Start The Activity

                    Intent intentSignUP = new Intent(getApplicationContext(), SignupActivity.class);
                    startActivity(intentSignUP);
                }
            });


    }
    // Methods to handleClick Event of Sign In Button
    public void signIn(View V)
    {
        final Dialog dialog = new Dialog(HomeActivity.this);
        dialog.setContentView(R.layout.activity_login);
       dialog.setTitle("Login");

        // get the Refferences of views
        final  EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
        final  EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);

        Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);

        // Set On ClickListener
        btnSignIn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // get The User name and Password
                String userName=editTextUserName.getText().toString();
                String password=editTextPassword.getText().toString();

                // fetch the Password form database for respective user name
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

                // check if the Stored password matches with  Password entered by user
                if(password.equals(storedPassword))
                {
                    Toast.makeText(HomeActivity.this, "Congrats: Login Successfull", Toast.LENGTH_SHORT).show();
                    //dialog.dismiss();

                    Intent i = new Intent(HomeActivity.this, HomeScreen.class);
                    startActivity(i);


                }
                else
                {
                    Toast.makeText(HomeActivity.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });

        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }
}
