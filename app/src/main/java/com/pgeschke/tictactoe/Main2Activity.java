package com.pgeschke.tictactoe;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity{

    ConstraintLayout background2;

    boolean Player_1 = true;

    Button btn_1_1;
    Button btn_1_2;
    Button btn_1_3;

    Button btn_2_1;
    Button btn_2_2;
    Button btn_2_3;

    Button btn_3_1;
    Button btn_3_2;
    Button btn_3_3;

    Button btn_reset;

    int turnCounter = 0;

    int playerOneScore = 0;
    int playerTwoScore = 0;
    int tieScore = 0;

    String playerOneString;
    String playerTwoString;
    String tiesString;


    int[][] boardStatus = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        background2 = (ConstraintLayout)findViewById(R.id.activity_2_main);
        background2.setBackgroundColor(getResources().getColor(R.color.colorBackground));

        setScore();

        btn_1_1 = findViewById(R.id.btn_1_1);
        btn_1_2 = findViewById(R.id.btn_1_2);
        btn_1_3 = findViewById(R.id.btn_1_3);

        btn_2_1 = findViewById(R.id.btn_2_1);
        btn_2_2 = findViewById(R.id.btn_2_2);
        btn_2_3 = findViewById(R.id.btn_2_3);

        btn_3_1 = findViewById(R.id.btn_3_1);
        btn_3_2 = findViewById(R.id.btn_3_2);
        btn_3_3 = findViewById(R.id.btn_3_3);

        btn_reset = findViewById(R.id.btn_reset);

        btn_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});
        btn_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});


        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonHandler(v);
            }});


        initializeGame();

    }

    public void buttonHandler(View view){

        boolean restartPressed = false;

        switch (view.getId()){
            case R.id.btn_1_1:
                if (Player_1){
                    btn_1_1.setText("X");
                    boardStatus[0][0] = 1;
                }
                else{
                    btn_1_1.setText("O");
                    boardStatus[0][0] = 0;
                }
                btn_1_1.setEnabled(false);
                break;
            case R.id.btn_1_2:
                if (Player_1){
                    btn_1_2.setText("X");
                    boardStatus[0][1] = 1;
                }
                else{
                    btn_1_2.setText("O");
                    boardStatus[0][1] = 0;
                }
                btn_1_2.setEnabled(false);
                break;
            case R.id.btn_1_3:
                if (Player_1){
                    btn_1_3.setText("X");
                    boardStatus[0][2] = 1;
                }
                else{
                    btn_1_3.setText("O");
                    boardStatus[0][2] = 0;
                }
                btn_1_3.setEnabled(false);
                break;

            case R.id.btn_2_1:
                if (Player_1){
                    btn_2_1.setText("X");
                    boardStatus[1][0] = 1;
                }
                else{
                    btn_2_1.setText("O");
                    boardStatus[1][0] = 0;
                }
                btn_2_1.setEnabled(false);
                break;
            case R.id.btn_2_2:
                if (Player_1){
                    btn_2_2.setText("X");
                    boardStatus[1][1] = 1;
                }
                else{
                    btn_2_2.setText("O");
                    boardStatus[1][1] = 0;
                }
                btn_2_2.setEnabled(false);
                break;
            case R.id.btn_2_3:
                if (Player_1){
                    btn_2_3.setText("X");
                    boardStatus[1][2] = 1;
                }
                else{
                    btn_2_3.setText("O");
                    boardStatus[1][2] = 0;
                }
                btn_2_3.setEnabled(false);
                break;

            case R.id.btn_3_1:
                if (Player_1){
                    btn_3_1.setText("X");
                    boardStatus[2][0] = 1;
                }
                else{
                    btn_3_1.setText("O");
                    boardStatus[2][0] = 0;
                }
                btn_3_1.setEnabled(false);
                break;
            case R.id.btn_3_2:
                if (Player_1){
                    btn_3_2.setText("X");
                    boardStatus[2][1] = 1;
                }
                else{
                    btn_3_2.setText("O");
                    boardStatus[2][1] = 0;
                }
                btn_3_2.setEnabled(false);
                break;
            case R.id.btn_3_3:
                if (Player_1){
                    btn_3_3.setText("X");
                    boardStatus[2][2] = 1;
                }
                else{
                    btn_3_3.setText("O");
                    boardStatus[2][2] = 0;
                }
                btn_3_3.setEnabled(false);
                break;
            case R.id.btn_reset:
                restartPressed = true;
                break;
            default:
                break;
        }
        if (restartPressed){
            resetBoard();
        }
        else{
            turnCounter ++;
            Player_1 = !Player_1;


            checkWin();
            setScore();
        }
    }
    private void checkWin(){
        for(int i=0; i<3; i++){
            if(boardStatus[i][0] == boardStatus[i][1] && boardStatus[i][0] == boardStatus[i][2]){
                if (boardStatus[i][0] == 1){
                    playerOneScore += 1;
                    Toast.makeText(Main2Activity.this, "Player One Wins", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                else if (boardStatus[i][0] == 0){
                    playerTwoScore += 1;
                    Toast.makeText(Main2Activity.this,"Player 2 Wins", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        }
        for (int i=0; i<3; i++){
            if(boardStatus[0][i] == boardStatus[1][i] && boardStatus[0][i] == boardStatus[2][i]){
                if (boardStatus[0][i] == 1){
                    playerOneScore += 1;
                    Toast.makeText(Main2Activity.this, "Player One Wins", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                else if (boardStatus[0][i] == 0){
                    playerTwoScore += 1;
                    Toast.makeText(Main2Activity.this,"Player 2 Wins", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        }
        if (boardStatus[0][0] == boardStatus[1][1] && boardStatus[0][0] == boardStatus[2][2]){
            if (boardStatus[0][0] == 1){
                playerOneScore += 1;
                Toast.makeText(Main2Activity.this, "Player One Wins", Toast.LENGTH_LONG).show();
                resetBoard();
            }
            else if (boardStatus[0][0] == 0){
                playerTwoScore += 1;
                Toast.makeText(Main2Activity.this,"Player 2 Wins", Toast.LENGTH_LONG).show();
                resetBoard();
            }
        }
        if (boardStatus[0][2] == boardStatus[1][1] && boardStatus[0][2] == boardStatus[2][0]){
            if (boardStatus[0][2] == 1){
                playerOneScore += 1;
                Toast.makeText(Main2Activity.this, "Player One Wins", Toast.LENGTH_LONG).show();
                resetBoard();
            }
            else if (boardStatus[0][2] == 0){
                playerTwoScore += 1;
                Toast.makeText(Main2Activity.this,"Player 2 Wins", Toast.LENGTH_LONG).show();
                resetBoard();
            }
        }
        if (turnCounter==9){
            tieScore += 1;
            Toast.makeText(Main2Activity.this, "Game is a Tie", Toast.LENGTH_LONG).show();
            resetBoard();
        }

    }
    private void enableButtons(boolean value){
        btn_1_1.setEnabled(value);
        btn_1_2.setEnabled(value);
        btn_1_3.setEnabled(value);

        btn_2_1.setEnabled(value);
        btn_2_2.setEnabled(value);
        btn_2_3.setEnabled(value);

        btn_3_1.setEnabled(value);
        btn_3_2.setEnabled(value);
        btn_3_3.setEnabled(value);
    }
    private void resetBoard(){
        btn_1_1.setText("");
        btn_1_2.setText("");
        btn_1_3.setText("");

        btn_2_1.setText("");
        btn_2_2.setText("");
        btn_2_3.setText("");

        btn_3_1.setText("");
        btn_3_2.setText("");
        btn_3_3.setText("");

        enableButtons(true);

        Player_1 = true;
        turnCounter = 0;

        initializeGame();
    }
    private void initializeGame(){
        for (int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boardStatus[i][j] = -1;
            }
        }
    }
    private void setScore(){
        final EditText txtPlayerOneScore = (EditText)findViewById(R.id.scorePlayerOne);
        final EditText txtPlayerTwoScore = (EditText)findViewById(R.id.scorePlayerTwo);
        final EditText txtTiedScore = (EditText)findViewById(R.id.scoreTie);
        playerOneString = String.valueOf(playerOneScore);
        playerTwoString = String.valueOf(playerTwoScore);
        tiesString = String.valueOf(tieScore);
        txtPlayerOneScore.setText(playerOneString);
        txtPlayerTwoScore.setText(playerTwoString);
        txtTiedScore.setText(tiesString);
    }

}
