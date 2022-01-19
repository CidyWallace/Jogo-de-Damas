package com.example.jogodedamas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int board_size = 8;
    public Piece[][] matriz;
    public ArrayList<TextView> textList = new ArrayList<>();
    private int LineIn;
    private int ColunmIn;
    private int LineFor;
    private int ColunmFor;
    private int Cont = 1;
    private Boolean TurnP = true;
    private Boolean TurnB = false;

    private TextView text1, text2, text3,text4, text5, text6, text7, text8, text9, text10, text11, text12, text13,text14,text15,text16,text17,text18, text19, text20,
            text21,text22,text23,text24,text25,text26,text27,text28,text29,text30,text31,text32,text33,text34,text35,text36,text37,text38,text39,text40,text41,text42,
            text43,text44,text45,text46,text47,text48,text49,text50,text51,text52,text53,text54,text55,text56,text57,text58,text59,text60,text61,text62,text63,text64;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        text5 = findViewById(R.id.textView5);
        text6 = findViewById(R.id.textView6);
        text7 = findViewById(R.id.textView7);
        text8 = findViewById(R.id.textView8);
        text9 = findViewById(R.id.textView9);
        text10 = findViewById(R.id.textView10);
        text11 = findViewById(R.id.textView11);
        text12 = findViewById(R.id.textView12);
        text13 = findViewById(R.id.textView13);
        text14 = findViewById(R.id.textView14);
        text15 = findViewById(R.id.textView15);
        text16 = findViewById(R.id.textView16);
        text17 = findViewById(R.id.textView17);
        text18 = findViewById(R.id.textView18);
        text19 = findViewById(R.id.textView19);
        text20 = findViewById(R.id.textView20);
        text21 = findViewById(R.id.text_view21);
        text22 = findViewById(R.id.text_view22);
        text23 = findViewById(R.id.text_view23);
        text24 = findViewById(R.id.text_view24);
        text25 = findViewById(R.id.text_view25);
        text26 = findViewById(R.id.text_view26);
        text27 = findViewById(R.id.text_view27);
        text28 = findViewById(R.id.textview28);
        text29 = findViewById(R.id.text_view29);
        text30 = findViewById(R.id.text_View30);
        text31 = findViewById(R.id.text_View31);
        text32 = findViewById(R.id.text_View32);
        text33 = findViewById(R.id.text_View33);
        text34 = findViewById(R.id.text_View34);
        text35 = findViewById(R.id.text_View35);
        text36 = findViewById(R.id.text_View36);
        text37 = findViewById(R.id.text_View37);
        text38 = findViewById(R.id.text_View38);
        text39 = findViewById(R.id.text_View39);
        text40 = findViewById(R.id.text_View40);
        text41 = findViewById(R.id.text_View41);
        text42 = findViewById(R.id.text_View42);
        text43 = findViewById(R.id.text_View43);
        text44 = findViewById(R.id.text_View44);
        text45 = findViewById(R.id.text_View45);
        text46 = findViewById(R.id.text_View46);
        text47 = findViewById(R.id.text_View47);
        text48 = findViewById(R.id.text_View48);
        text49 = findViewById(R.id.text_View49);
        text50 = findViewById(R.id.text_View50);
        text51 = findViewById(R.id.text_View51);
        text52 = findViewById(R.id.text_View52);
        text53 = findViewById(R.id.text_View53);
        text54 = findViewById(R.id.text_View54);
        text55 = findViewById(R.id.text_View55);
        text56 = findViewById(R.id.text_View56);
        text57 = findViewById(R.id.text_View57);
        text58 = findViewById(R.id.text_View58);
        text59 = findViewById(R.id.text_View59);
        text60 = findViewById(R.id.text_View60);
        text61 = findViewById(R.id.text_View61);
        text62 = findViewById(R.id.text_View62);
        text63 = findViewById(R.id.text_View63);
        text64 = findViewById(R.id.text_View64);

        listText();

        matriz = new Piece[board_size][board_size];

        int cont = 0;
        for (int i = 0; i < board_size;i++){
            for(int j = 0; j < board_size;j++){
                matriz[i][j] = new Piece(new Position(i, j), textList.get(cont));
                cont++;
            }
        }

        for(int t = 0; t < textList.size(); t++){
            int finalT = t;
            textList.get(t).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int linha;
                    linha = (finalT % 8);

                    int coluna;
                    coluna = (finalT / 8);

                    if(Cont == 1){
                        LineIn = linha;
                        ColunmIn = coluna;
                        Cont++;
                    }else if(Cont == 2){
                        LineFor = linha;
                        ColunmFor = coluna;
                        Cont--;
                        MovimentPiece(ColunmIn, LineIn, ColunmFor, LineFor);
                    }

                    System.out.println("matriz "+ matriz[coluna][linha].getTextView().getText());
                }
            });
        }
        BuildBoard_P();
        BuildBoard_B();
    }

    public void listText(){
        textList.add(text1);
        textList.add(text2);
        textList.add(text3);
        textList.add(text4);
        textList.add(text5);
        textList.add(text6);
        textList.add(text7);
        textList.add(text8);
        textList.add(text9);
        textList.add(text10);
        textList.add(text11);
        textList.add(text12);
        textList.add(text13);
        textList.add(text14);
        textList.add(text15);
        textList.add(text16);
        textList.add(text17);
        textList.add(text18);
        textList.add(text19);
        textList.add(text20);
        textList.add(text21);
        textList.add(text22);
        textList.add(text23);
        textList.add(text24);
        textList.add(text25);
        textList.add(text26);
        textList.add(text27);
        textList.add(text28);
        textList.add(text29);
        textList.add(text30);
        textList.add(text31);
        textList.add(text32);
        textList.add(text33);
        textList.add(text34);
        textList.add(text35);
        textList.add(text36);
        textList.add(text37);
        textList.add(text38);
        textList.add(text39);
        textList.add(text40);
        textList.add(text41);
        textList.add(text42);
        textList.add(text43);
        textList.add(text44);
        textList.add(text45);
        textList.add(text46);
        textList.add(text47);
        textList.add(text48);
        textList.add(text49);
        textList.add(text50);
        textList.add(text51);
        textList.add(text52);
        textList.add(text53);
        textList.add(text54);
        textList.add(text55);
        textList.add(text56);
        textList.add(text57);
        textList.add(text58);
        textList.add(text59);
        textList.add(text60);
        textList.add(text61);
        textList.add(text62);
        textList.add(text63);
        textList.add(text64);
    }

    public void BuildBoard_P(){
        for(int i = 0; i < board_size ;i++){
            int num_par = 0;
            int num_impar = 1;

            if(i % 2 != 0){
                num_impar = i;
            }
            if(i % 2 != 1){
                num_par = i;
            }
            matriz[0][num_par].getTextView().setText("P");
            matriz[1][num_impar].getTextView().setText("P");
            matriz[2][num_par].getTextView().setText("P");
        }
    }

    public void BuildBoard_B(){
        for (int j = 0; j < board_size; j++){
            int num_par = 0;
            int num_impar = 1;
            if(j % 2 != 1){
                num_par = j;
            }
            if(j % 2 != 0){
                num_impar = j;
            }
            matriz[5][num_impar].getTextView().setText("B");
            matriz[6][num_par].getTextView().setText("B");
            matriz[7][num_impar].getTextView().setText("B");
        }
    }

    public void MovimentPiece(int coluna1, int linha1, int coluna2, int linha2) {
        if (matriz[coluna1][linha1].getTextView().getText().equals("P") && TurnP) {
            if(matriz[coluna2][linha2].getTextView().getText().equals("")){
                matriz[coluna1][linha1].getTextView().setText("");
                matriz[coluna2][linha2].getTextView().setText("P");
                TurnP = false;
                TurnB = true;
            }
        }else if(matriz[coluna1][linha1].getTextView().getText().equals("B") && TurnB){
            if(matriz[coluna2][linha2].getTextView().getText().equals("")){
                matriz[coluna1][linha1].getTextView().setText("");
                matriz[coluna2][linha2].getTextView().setText("B");
                TurnP = true;
                TurnB = false;
            }
        }
    }

//
}
