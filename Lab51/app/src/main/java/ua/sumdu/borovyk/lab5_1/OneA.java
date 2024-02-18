package ua.sumdu.borovyk.lab5_1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OneA extends Activity implements DialogInterface.OnClickListener {

    final int DIALOG_EXIT = 1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void onclick(View v) {
        showDialog(DIALOG_EXIT);
    }

    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_EXIT) {
            var adb = new AlertDialog.Builder(this);

            adb.setTitle("Exit");
            adb.setMessage("Save data");
            adb.setIcon(android.R.drawable.ic_dialog_info);
            adb.setPositiveButton("Yes", this);
            adb.setNegativeButton("No", this);
            adb.setNeutralButton("Cancel", this);

            return adb.create();
        }
        return super.onCreateDialog(id);
    }

    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                saveData();
                finish();
                break;
            case Dialog.BUTTON_NEGATIVE:
                finish();
                break;
            case Dialog.BUTTON_NEUTRAL:
                break;
        }
    }

    void saveData() {
        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
    }

}
