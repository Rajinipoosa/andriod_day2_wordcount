package example.codeclan.com.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {
    private TextView wordCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word2);

        Log.d(getClass().toString(), "onCreate is called");

        wordCount = (TextView) findViewById(R.id.display_num);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int value = extras.getInt("words");
        wordCount.setText(value);




        }
    }


