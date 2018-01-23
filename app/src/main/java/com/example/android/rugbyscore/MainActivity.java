package com.example.android.rugbyscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.rugbyscore.R;

public class MainActivity extends AppCompatActivity {

    int pointsForA = 0;
    int pointsForB = 0;
    TextView scoreViewA = null;
    TextView scoreViewB = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("pointsForA", pointsForA);
        outState.putInt("pointsForB", pointsForB);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        pointsForA = savedInstanceState.getInt("pointsForA");
        pointsForB = savedInstanceState.getInt("pointsForB");
        displayForTeamA(pointsForA);
        displayForTeamB(pointsForB);
    }

    /**
     * this method is called when try button is clicked
     * increase the score with 5 points
     */
    public void tryA (View view) {
        pointsForA = pointsForA + 5;
        displayForTeamA(pointsForA);
    }
    /**
     * this method is called when the conversion button is clicked
     * increase the score with 2 points
     */

    public void conversionA (View view){
        pointsForA = pointsForA + 2;
        displayForTeamA(pointsForA);
    }

    /**
     * display methond when the penalty button is clicked
     * increase the score with 3 point
     */

    public void penaltyA(View view){
        pointsForA = pointsForA + 3;
        displayForTeamA(pointsForA);
    }

    /**
     * display methond when the drop goal button is clicked
     * increase the score with 3 point
     */

    public void dropA(View view){
        pointsForA = pointsForA + 3;
        displayForTeamA(pointsForA);
    }

    /**
     * displays the given score for Team A
     */
    public void displayForTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }
    /**
     * displays the given score for Team B
     */
    public void displayForTeamB(int score) {

        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * this method is called when the try button is clicked
     * increase the score with 5 points
     */
    public void tryB (View view) {
        pointsForB = pointsForB + 5;
        displayForTeamB(pointsForB);
    }
    /**
     * this method is called when the conversion button is clicked
     * increase the score with 2 points
     */

    public void conversionB (View view){
        pointsForB = pointsForB + 2;
        displayForTeamB(pointsForB);
    }

    /**
     * display methond when the penalty button is clicked
     * increase the score with 3 point
     */

    public void penaltyB(View view){
        pointsForB = pointsForB + 3;
        displayForTeamB(pointsForB);
    }

    public void dropB(View view){
        pointsForB = pointsForB + 3;
        displayForTeamB(pointsForB);
    }
    /**
     * reset the score to 0
     */
    public void newgame (View view){
        pointsForA = 0;
        pointsForB = 0;
        displayForTeamA(pointsForA);
        displayForTeamB(pointsForB);
    }
}
