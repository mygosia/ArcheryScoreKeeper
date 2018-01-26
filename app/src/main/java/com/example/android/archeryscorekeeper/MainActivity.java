package com.example.android.archeryscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String STATE_SCORETEAMA = "scoreTeamA";
    static final String STATE_SCORETEAMB = "scoreTeamB";

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCORETEAMA, scoreA);
        savedInstanceState.putInt(STATE_SCORETEAMB, scoreB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreA = savedInstanceState.getInt(STATE_SCORETEAMA);
        scoreB = savedInstanceState.getInt(STATE_SCORETEAMB);

        displayForPersonA(scoreA);
        displayForPersonB(scoreB);
    }


    /**
     * Displays the given score for Person A.
     */
    public void displayForPersonA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Person B.
     */
    public void displayForPersonB (int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reseting scores
     */
    public void resetScores (View view){
        scoreA = 0;
        scoreB = 0;
        displayForPersonA(scoreA);
        displayForPersonB(scoreB);
    }
    /**
     * Adding points for person A
     */
    public void addOneA(View view) {
        scoreA = scoreA + 1;
        displayForPersonA(scoreA);
    }
    public void addThreeA(View view) {
        scoreA = scoreA + 3;
        displayForPersonA(scoreA);
    }
    public void addFiveA(View view) {
        scoreA = scoreA + 5;
        displayForPersonA(scoreA);
    }
    public void addSevenA(View view) {
        scoreA = scoreA + 7;
        displayForPersonA(scoreA);
    }
    public void addNineA(View view) {
        scoreA = scoreA + 9;
        displayForPersonA(scoreA);
    }

    /**
     * Adding points for Person B
     */
    public void addOneB(View view) {
        scoreB = scoreB + 1;
        displayForPersonB(scoreB);
    }
    public void addThreeB(View view) {
        scoreB = scoreB + 3;
        displayForPersonB(scoreB);
    }
    public void addFiveB(View view) {
        scoreB = scoreB + 5;
        displayForPersonB(scoreB);
    }
    public void addSevenB(View view) {
        scoreB = scoreB + 7;
        displayForPersonB(scoreB);
    }
    public void addNineB(View view) {
        scoreB = scoreB + 9;
        displayForPersonB(scoreB);
    }

}
