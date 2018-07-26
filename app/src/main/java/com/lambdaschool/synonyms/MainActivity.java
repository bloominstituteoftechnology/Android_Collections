package com.lambdaschool.synonyms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[][] synonyms;
    TextView   outputView;
    EditText   targetText;
    Button     searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        synonyms = new String[][] { {"swift",  "abrupt", "expeditious", "hasty", "nimble", "quick", "rapid", "speedy", "sudden", "unexpected"},
                {"objective", "detached", "disinterested", "dispassionate", "equitable", "evenhanded", "nonpartisan", "open-minded", "unbiased"},
                {"calculate", "adjust", "appraise", "consider", "count", "determine", "forecast", "gauge", "guess", "measure", "multiply", "reckon", "subtract", "tally", "weigh", "work out"},
                {"create", "build", "conceive", "constitute", "construct", "design", "devise", "discover", "establish", "forge", "form"} };

        targetText   = findViewById(R.id.input_text);
        outputView   = findViewById(R.id.output_view);
        searchButton = findViewById(R.id.search_button);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String target        = targetText.getText().toString().toLowerCase();
                String[] results     = synonyms(target);
                if (results != null) {
                    StringBuilder output = new StringBuilder();
                    for (String word : results) {
                        if (!word.equals(target)) {
                            output.append(word).append(" ");
                        }
                    }
                    outputView.setText(output.toString());
                } else {
                    outputView.setText(R.string.no_synonyms);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    protected String[] synonyms(String target) {
        String[] returnList = null;

        for (String[] strings: synonyms) {
            if(strings[0].toLowerCase().equals(target)) {
                returnList = strings;
            }
        }

        return returnList;
    }

}
