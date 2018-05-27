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

public class MsgDialogFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("入力メッセージを表示します。");
        builder.setPositiveButton("OK", new MsgDialogButtonClickListener());
        AlertDialog dialog = builder.create();
        return dialog;
    }

    private class MsgDialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which){
            Bundle extras = getArguments();
            String msg = "";
            if(extras != null){
                msg = extras.getString("msg");
            }
            Activity parent = getActivity();
            Toast.makeText(parent, msg, Toast.LENGTH_SHORT).show();
        }

    }
}
