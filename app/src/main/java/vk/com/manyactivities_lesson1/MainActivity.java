package vk.com.manyactivities_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showActivity(View view) {
        String buttonText = ((Button) view).getText().toString();
        if(buttonText.equals("Second Screen"))
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        else if(buttonText.equals("Third Screen"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
    }
}
