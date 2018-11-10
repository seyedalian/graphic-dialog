/*
#Made by s.seyedalian
#gmail:seyedalian10@gmail.com

*/

import android.app.AlertDialog;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

public abstract class makeDialogGraphic {
    private AlertDialog.Builder mainDialogBuilder;
    private View mainDialogView;
    private final AlertDialog mainAlertDialog;
    public makeDialogGraphic(@NonNull Context context,@NonNull @LayoutRes int idLayout) {
        LayoutInflater layoutInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       mainDialogBuilder = new AlertDialog.Builder(context);
         mainDialogView = layoutInflater.inflate(idLayout, null);
        mainDialogBuilder.setView(mainDialogView);
        init();
        mainAlertDialog= mainDialogBuilder.create();


    }
    
    protected abstract void init();
	
    protected View getDialogView() {
        return mainDialogView;
    }


    public void dismis(){
        mainAlertDialog.dismiss();
    }

  

    public void show(){
        mainAlertDialog.show();
    }

	// this fun help you to chenge Background Drawable Resource.
    public void setWindowShap(@DrawableRes int idShap){
        mainAlertDialog.getWindow().setBackgroundDrawableResource(idShap);

    }
	
    public AlertDialog.Builder getDialogBuilder() {
        return mainDialogBuilder;
    }
}
