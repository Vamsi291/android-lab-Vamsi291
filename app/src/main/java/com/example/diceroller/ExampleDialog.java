package com.example.diceroller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.HashMap;
import java.util.Random;

public class ExampleDialog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        HashMap dbreaker = new HashMap();
        dbreaker.put(1, "If you could go anywhere in the world, where would you go?");
        dbreaker.put(2, "If you were stranded on a desert island, what three things would you want to take with you?");
        dbreaker.put(3, "If you could eat only one food for the rest of your life, what would that be?");
        dbreaker.put(4, "If you won a million dollars, what is the first thing you would buy?");
        dbreaker.put(5, "If you could spend the day with one fictional character, who would it be?");
        dbreaker.put(6, "If you found a magic lantern and a genie gave you three wishes, what would you wish?");

        Random generator = new Random();
        Object[] values = dbreaker.values().toArray();
        Object randomValue = values[generator.nextInt(values.length)];

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Question!")
                .setMessage((CharSequence) randomValue)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        return builder.create();
    }
}
