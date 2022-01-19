package com.example.jogodedamas;

import android.widget.TextView;

public class Piece {
    private Position position;
    private TextView textView;

    public Piece(Position position, TextView textView){
        this.position = position;
        this.textView = textView;
    }

    public Position getPosicao() {
        return position;
    }

    public void setPosicao(Position position) {
        this.position = position;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
