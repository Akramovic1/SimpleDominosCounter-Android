package com.example.ahmedakram.dominocounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int player1 = 0;
    int player2 = 0;
    int undoPoint = 0;
    private Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForPlayer1(int score) {
        TextView scoreView = findViewById(R.id.player1_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add10ForPlayer1(View v){
        undoPoint = 10;
        player1 = player1 + 10 ;
        displayForPlayer1(player1);
    }
    public void add20ForPlayer1(View v){
        undoPoint = 20;
        player1 = player1 + 20 ;
        displayForPlayer1(player1);
    }
    public void add30ForPlayer1(View v){
        undoPoint = 30;
        player1 = player1 + 30 ;
        displayForPlayer1(player1);
    }
    public void add40ForPlayer1(View v){
        undoPoint = 40;
        player1 = player1 + 40 ;
        displayForPlayer1(player1);
    }
    public void add50ForPlayer1(View v){
        undoPoint = 50;
        player1 = player1 + 50 ;
        displayForPlayer1(player1);
    }
    public void add60ForPlayer1(View v){
        undoPoint = 60;
        player1 = player1 + 60 ;
        displayForPlayer1(player1);
    }
    public void add70ForPlayer1(View v){
        undoPoint = 70;
        player1 = player1 + 70 ;
        displayForPlayer1(player1);
    }
    public void add80ForPlayer1(View v){
        undoPoint = 80;
        player1 = player1 + 80 ;
        displayForPlayer1(player1);
    }
    public void add90ForPlayer1(View v){
        undoPoint = 90;
        player1 = player1 + 90 ;
        displayForPlayer1(player1);
    }
    public void add100ForPlayer1(View v){
        undoPoint = 100;
        player1 = player1 + 100 ;
        displayForPlayer1(player1);
    }
    public void add10ForPlayer2(View v){
        undoPoint = 10;
        player2 = player2 + 10 ;
        displayForPlayer2(player2);
    }
    public void add20ForPlayer2(View v){
        undoPoint = 20;
        player2 = player2 + 20 ;
        displayForPlayer2(player2);
    }
    public void add30ForPlayer2(View v){
        undoPoint = 30;
        player2 = player2 + 30 ;
        displayForPlayer2(player2);
    }
    public void add40ForPlayer2(View v){
        undoPoint = 40;
        player2 = player2 + 40 ;
        displayForPlayer2(player2);
    }
    public void add50ForPlayer2(View v){
        undoPoint = 50;
        player2 = player2 + 50 ;
        displayForPlayer2(player2);
    }
    public void add60ForPlayer2(View v){
        undoPoint = 60;
        player2 = player2 + 60 ;
        displayForPlayer2(player2);
    }
    public void add70ForPlayer2(View v){
        undoPoint = 70;
        player2 = player2 + 70 ;
        displayForPlayer2(player2);
    }
    public void add80ForPlayer2(View v){
        undoPoint = 80;
        player2 = player2 + 80 ;
        displayForPlayer2(player2);
    }
    public void add90ForPlayer2(View v){
        undoPoint = 90;
        player2 = player2 + 90 ;
        displayForPlayer2(player2);
    }
    public void add100ForPlayer2(View v){
        undoPoint = 100;
        player2 = player2 + 100 ;
        displayForPlayer2(player2);
    }
    public void resetScore(View v){
        player1 = 0;
        player2 = 0;
        displayForPlayer1(player1);
        displayForPlayer2(player2);
    }
    public void undoPointPlayer1(View v){
        player1 = player1 - undoPoint ;
        displayForPlayer1(player1);
        undoPoint = 0 ;
    }
    public void undoPointPlayer2(View v){
        player2 = player2 - undoPoint ;
        displayForPlayer2(player2);
        undoPoint = 0;
    }
}