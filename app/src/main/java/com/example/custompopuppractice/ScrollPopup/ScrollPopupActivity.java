package com.example.custompopuppractice.ScrollPopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.custompopuppractice.R;

public class ScrollPopupActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_popup);

        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            InfoDialog dialog = new InfoDialog();
            dialog.showDialog(ScrollPopupActivity.this);
        });

    }

    //팝업 클래스
    public class InfoDialog {

        private ListView listView;
        private PopupListViewAdapter adapter;

        public void showDialog(Activity activity) {
            final Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(true);
            dialog.setContentView(R.layout.item_transparent_scroll_popup);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


            adapter = new PopupListViewAdapter();

            listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);

            adapter.addItem(R.drawable.toothache,"증상제목1","부위","통증 정도","통증 양상","악화 상황","동반 증상");
            adapter.addItem(R.drawable.toothache,"증상제목2","부위","통증 정도","통증 양상","악화 상황","동반 증상");

            adapter.notifyDataSetChanged();

            dialog.show();
        }
    }
}