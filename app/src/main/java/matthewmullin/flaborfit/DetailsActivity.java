package matthewmullin.flaborfit;

import android.graphics.Color;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            exerciseImg.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.weight, null));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImg.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.lotus, null));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        }else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            exerciseImg.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.heart, null));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
