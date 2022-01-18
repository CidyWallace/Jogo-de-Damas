package com.example.jogodedamas;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Peca {
    private Posicao posicao;
    private TextView textView;

    public Peca(Posicao posicao, TextView textView){
        this.posicao = posicao;
        this.textView = textView;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
