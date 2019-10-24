package com.stepcounterpackage.mpiker2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;



public class pwd extends DialogFragment {

    static public View v;

    public View.OnClickListener numButton = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            View frame = view;
            switch (view.getId()){
                case R.id.button1:
                    changePWDstatement(1);
                    break;
                case R.id.button2:
                    changePWDstatement(2);
                    break;
                case R.id.button3:
                    changePWDstatement(3);
                    break;
                case R.id.button4:
                    changePWDstatement(4);
                    break;
                case R.id.button5:
                    changePWDstatement(5);
                    break;
                case R.id.button6:
                    changePWDstatement(6);
                    break;
                case R.id.button7:
                    changePWDstatement(7);
                    break;
                case R.id.button8:
                    changePWDstatement(8);
                    break;
                case R.id.button9:
                    changePWDstatement(9);
                    break;
                case R.id.button0:
                    changePWDstatement(0);
                    break;
                case R.id.button_del:
                    changePWDstatement(-1);
                    break;
                case R.id.button_enter:
                    changePWDstatement(-2);
                    break;
            }
        }
    };

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder PWD_DIALOG = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        v = inflater.inflate(R.layout.pwd_layout, null);

        PWD_DIALOG.setView(v);
        PWD_DIALOG.setTitle("Введите пароль администратора");

        Button button1 = v.findViewById(R.id.button1);
        Button button2 = v.findViewById(R.id.button2);
        Button button3 = v.findViewById(R.id.button3);
        Button button4 = v.findViewById(R.id.button4);
        Button button5 = v.findViewById(R.id.button5);
        Button button6 = v.findViewById(R.id.button6);
        Button button7 = v.findViewById(R.id.button7);
        Button button8 = v.findViewById(R.id.button8);
        Button button9 = v.findViewById(R.id.button9);
        Button button0 = v.findViewById(R.id.button0);

        Button button_del = v.findViewById(R.id.button_del);
        Button button_ent = v.findViewById(R.id.button_enter);

        button1.setOnClickListener(numButton);
        button2.setOnClickListener(numButton);
        button3.setOnClickListener(numButton);
        button4.setOnClickListener(numButton);
        button5.setOnClickListener(numButton);
        button6.setOnClickListener(numButton);
        button7.setOnClickListener(numButton);
        button8.setOnClickListener(numButton);
        button9.setOnClickListener(numButton);
        button0.setOnClickListener(numButton);

        button_del.setOnClickListener(numButton);
        button_ent.setOnClickListener(numButton);

        return PWD_DIALOG.create();
    }

    public void changePWDstatement(int num){

        TextView PWD_TV = v.findViewById(R.id.pwd);
        PWD_TV.setTransformationMethod(new PasswordTransformationMethod());
        String password = PWD_TV.getText().toString();


        if (num >= 0){
            password = password + num;
        } else if (num == -1){
            password = "";
        } else if (num == -2) {
            if (password == "99") {

            }
        }

        PWD_TV.setText(password);
    }
}
