package example.codeclan.com.wordcount;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCount extends AppCompatActivity {

    private EditText sentenceEditText;
    private Button searchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate is called");

        sentenceEditText = (EditText) findViewById(R.id.word_count);
        searchButton = (Button) findViewById(R.id.get_word);


    }

    public void onButtonClicked(View button) {
        Log.d(getClass().toString(),"onButtonClicked was called");
        String sentence = sentenceEditText.getText().toString();
        Word word = new Word();
        int wordCount = word.getWordCount(sentence);
        Intent intent = new Intent(this, WordActivity.class);
        intent.putExtra("words", wordCount);
        startActivity(intent);

    }
}
