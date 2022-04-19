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
        TextView popTitle = view.findViewById(R.id.txtPointofsailTitle);
        popTitle.setText(title);
        TextView popText = view.findViewById(R.id.txtPointofsailText);
        popText.setText(text);
        ImageView popImg = view.findViewById(R.id.imgBoat);
        popImg.setBackground(img);
        final PopupWindow popupWindow = new PopupWindow(popupView, width,height,focusable);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
        popupView.setOnTouchListener((v, event) -> {
            popupWindow.dismiss();
            return true;
        });
    }
}
