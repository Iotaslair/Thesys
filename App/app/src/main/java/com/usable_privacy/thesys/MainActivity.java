package com.usable_privacy.thesys;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button submit, reset;
    FrameLayout[] board;
    Drawable[] pieces;
    //    ChessObject gameBoard;
    boolean PieceSelected;
    int SelectedPiece;
    String PassedPiece;
    ImageView[] selectablePieces;
    final int squareSize = 135;
    final int lineSize = 2;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildBoard();


//        ImageView temp = new ImageView(getApplicationContext());
//
//        String uri = "@drawable/arrows";
//
//        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
//        Drawable res = getResources().getDrawable(imageResource);
//        temp.setImageDrawable(res);

//        board[3].addView(temp);
//        board[3].getLayoutParams().width = 300;
//        board[3].getLayoutParams().height = 300;



        board[3].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ImageView temp = new ImageView(getApplicationContext());

                String uri = "@drawable/two_ship";

                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                temp.setImageDrawable(res);

                board[3].addView(temp);
//                Log.d("WilliamButt", "" + board[3].getLayoutParams().width);
                board[3].getLayoutParams().width = 2 * squareSize;

                return true;
            }
        });


    }


    private void buildBoard() {
        board = new FrameLayout[64];
        selectablePieces = new ImageView[12];
        pieces = new Drawable[12];
        board[0] = findViewById(R.id.Chess1);
        board[1] = findViewById(R.id.Chess2);
        board[2] = findViewById(R.id.Chess3);
        board[3] = findViewById(R.id.Chess4);
        board[4] = findViewById(R.id.Chess5);
        board[5] = findViewById(R.id.Chess6);
        board[6] = findViewById(R.id.Chess7);
        board[7] = findViewById(R.id.Chess8);
        board[8] = findViewById(R.id.Chess9);
        board[9] = findViewById(R.id.Chess10);
        board[10] = findViewById(R.id.Chess11);
        board[11] = findViewById(R.id.Chess12);
        board[12] = findViewById(R.id.Chess13);
        board[13] = findViewById(R.id.Chess14);
        board[14] = findViewById(R.id.Chess15);
        board[15] = findViewById(R.id.Chess16);
        board[16] = findViewById(R.id.Chess17);
        board[17] = findViewById(R.id.Chess18);
        board[18] = findViewById(R.id.Chess19);
        board[19] = findViewById(R.id.Chess20);
        board[20] = findViewById(R.id.Chess21);
        board[21] = findViewById(R.id.Chess22);
        board[22] = findViewById(R.id.Chess23);
        board[23] = findViewById(R.id.Chess24);
        board[24] = findViewById(R.id.Chess25);
        board[25] = findViewById(R.id.Chess26);
        board[26] = findViewById(R.id.Chess27);
        board[27] = findViewById(R.id.Chess28);
        board[28] = findViewById(R.id.Chess29);
        board[29] = findViewById(R.id.Chess30);
        board[30] = findViewById(R.id.Chess31);
        board[31] = findViewById(R.id.Chess32);
        board[32] = findViewById(R.id.Chess33);
        board[33] = findViewById(R.id.Chess34);
        board[34] = findViewById(R.id.Chess35);
        board[35] = findViewById(R.id.Chess36);
        board[36] = findViewById(R.id.Chess37);
        board[37] = findViewById(R.id.Chess38);
        board[38] = findViewById(R.id.Chess39);
        board[39] = findViewById(R.id.Chess40);
        board[40] = findViewById(R.id.Chess41);
        board[41] = findViewById(R.id.Chess42);
        board[42] = findViewById(R.id.Chess43);
        board[43] = findViewById(R.id.Chess44);
        board[44] = findViewById(R.id.Chess45);
        board[45] = findViewById(R.id.Chess46);
        board[46] = findViewById(R.id.Chess47);
        board[47] = findViewById(R.id.Chess48);
        board[48] = findViewById(R.id.Chess49);
        board[49] = findViewById(R.id.Chess50);
        board[50] = findViewById(R.id.Chess51);
        board[51] = findViewById(R.id.Chess52);
        board[52] = findViewById(R.id.Chess53);
        board[53] = findViewById(R.id.Chess54);
        board[54] = findViewById(R.id.Chess55);
        board[55] = findViewById(R.id.Chess56);
//        board[56] = findViewById(R.id.Chess57);
//        board[57] = findViewById(R.id.Chess58);
//        board[58] = findViewById(R.id.Chess59);
//        board[59] = findViewById(R.id.Chess60);
//        board[60] = findViewById(R.id.Chess61);
//        board[61] = findViewById(R.id.Chess62);
//        board[62] = findViewById(R.id.Chess63);
//        board[63] = findViewById(R.id.Chess64);

//        selectablePieces[0] = findViewById(R.id.BlackPawn);
//        selectablePieces[1] = findViewById(R.id.BlackBishop);
//        selectablePieces[2] = findViewById(R.id.BlackKnight);
//        selectablePieces[3] = findViewById(R.id.BlackRook);
//        selectablePieces[4] = findViewById(R.id.BlackQueen);
//        selectablePieces[5] = findViewById(R.id.BlackKing);
//        selectablePieces[6] = findViewById(R.id.WhitePawn);
//        selectablePieces[7] = findViewById(R.id.WhiteBishop);
//        selectablePieces[8] = findViewById(R.id.WhiteKnight);
//        selectablePieces[9] = findViewById(R.id.WhiteRook);
//        selectablePieces[10] = findViewById(R.id.WhiteQueen);
//        selectablePieces[11] = findViewById(R.id.WhiteKing);
//        for (int i = 0; i < 12; i++) {
//            pieces[i] = selectablePieces[i].getDrawable();
//        }
    }

    public int getSquareSize(int value){
        return value * squareSize + (value * 2);
    }
}
