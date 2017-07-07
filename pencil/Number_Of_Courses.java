package example.tutorial.pencil;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.MenuItem;
import android.widget.NumberPicker;

public class Number_Of_Courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number__of__courses);
        NumberPicker np = (NumberPicker)findViewById(R.id.number_picker);
        np.setMinValue(0);// restricted number to minimum value i.e 1
        np.setMaxValue(10);// restricked number to maximum value i.e. 31
        np.setWrapSelectorWheel(true);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                // TODO Auto-generated method stub

                String Old = "Old Value : ";

                String New = "New Value : ";

            }
        });

        Log.d("NumberPicker", "NumberPicker");



}
/* NumberPickerActivity */
    public void onClickEnterButton(View view)
    {
        Intent i = new Intent(this, HomeScreen.class);
        startActivity(i);


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Applied", Toast.LENGTH_SHORT).show();
    }

    public void onClickSkipButton(View view)
    {
        Intent i = new Intent(this, HomeScreen.class);
        startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Log in to confirm", Toast.LENGTH_SHORT).show();
    }
/*
    public void onClickNextButton(View view)
    {
        Intent i = new Intent(this, HomeScreen.class);
        startActivity(i);


        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
*/
}
