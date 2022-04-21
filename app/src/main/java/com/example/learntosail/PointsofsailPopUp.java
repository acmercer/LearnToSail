package com.example.learntosail;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class PointsofsailPopUp {
    public void displayPopUp(final View view, String title, String text, Drawable img){
        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.pointsofsailinfo, null);

        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView, width,height,focusable);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        TextView popTitle = popupView.findViewById(R.id.txtPointofsailTitle);
        popTitle.setText(title);
        TextView popText = popupView.findViewById(R.id.txtPointofsailText);
        popText.setText(text);
        ImageView popImg = popupView.findViewById(R.id.imgBoat);
        popImg.setBackground(img);

        popupView.setOnTouchListener((v, event) -> {
            popupWindow.dismiss();
            return true;
        });
    }
}
