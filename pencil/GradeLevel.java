package example.tutorial.pencil;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;



public class GradeLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_level);
        NumberPicker np = (NumberPicker) findViewById(R.id.number_picker);
        //Get the widgets reference from XML layout
        //final TextView tv = (TextView) findViewById(R.id.tv);
        //NumberPicker np = (NumberPicker) findViewById(R.id.np);

        //Set TextView text color
        //tv.setTextColor(Color.parseColor("#FF2C834F"));

        //Initializing a new string array with elements
        final String[] values= {"1 - 4","5 - 8","9 - 12", "Undergraduate", "Graduate"};

        //Populate NumberPicker values from String array values
        //Set the minimum value of NumberPicker
        np.setMinValue(0); //from array first value
        //Specify the maximum value/number of NumberPicker
        np.setMaxValue(values.length-1); //to array last value

        //Specify the NumberPicker data source as array elements
        np.setDisplayedValues(values);

        //Gets whether the selector wheel wraps when reaching the min/max value.
        np.setWrapSelectorWheel(true);

        //Set a value change listener for NumberPicker
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                //Display the newly selected value from picker
                //tv.setText("Selected value : " + values[newVal]);
            }
        });
    }

    public void onClickSkipButton(View view)
    {
        Intent i = new Intent(this, HomeScreen.class);
        startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Log in to confirm", Toast.LENGTH_SHORT).show();
    }
    public void onClickEnterButton(View view)
    {
        Intent i = new Intent(this, Number_Of_Courses.class);
        startActivity(i);

        //GUI TO MAKE A POP-UP MESSAGE WHEN USER CLICK BUTTON
        //Toast.makeText(this, "Log in to confirm", Toast.LENGTH_SHORT).show();
    }

}
