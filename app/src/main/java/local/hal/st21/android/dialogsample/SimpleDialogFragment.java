package local.hal.st21.android.dialogsample;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by ohs60213 on 2018/02/18.
 */

public class SimpleDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("ダメでしょ");
        builder.setPositiveButton("OK",new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which){
            Activity parent = getActivity();
            Toast.makeText(parent, "シンプルなダイアログ:OKが選択されました。", Toast.LENGTH_SHORT).show();
        }

    }
}
