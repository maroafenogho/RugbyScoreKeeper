package com.example.rugbyscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rugbyscorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scoreRedHawks = 0;
    int scoreTitans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayForRedHawks(int scoreRedHawks) {
        TextView scoreView = (TextView) findViewById(R.id.redHawks_score);
        scoreView.setText(String.valueOf(scoreRedHawks));
    }

    private void displayForTitans(int scoreTitans) {
        TextView scoreView = (TextView) findViewById(R.id.titans_score);
        scoreView.setText(String.valueOf(scoreTitans));
    }

    public void addFiveForRedHawks (View view) {
        scoreRedHawks = scoreRedHawks + 5;
        displayForRedHawks(scoreRedHawks);
    }

    public void addThreeForRedHawks (View view) {
        scoreRedHawks = scoreRedHawks + 3;
        displayForRedHawks(scoreRedHawks);
    }

    public void addTwoForRedHawks (View view) {
        scoreRedHawks = scoreRedHawks + 2;
        displayForRedHawks(scoreRedHawks);
    }

    public void addFiveForTitans (View view) {
        scoreTitans = scoreTitans + 5;
        displayForTitans(scoreTitans);
    }

    public void addThreeForTitans (View view) {
        scoreTitans = scoreTitans + 3;
        displayForTitans(scoreTitans);
    }

    public void addTwoForTitans (View view) {
        scoreTitans = scoreTitans + 2;
        displayForTitans(scoreTitans);
    }

    public void resetScore (View view) {
        scoreRedHawks = 0;
        scoreTitans = 0;
        displayForRedHawks(scoreRedHawks);
        displayForTitans(scoreTitans);
    }

}
