package com.example.custompopuppractice.TransScrollPopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import com.example.custompopuppractice.R;
import com.example.custompopuppractice.ScrollPopup.PopupListViewAdapter;

public class TransparentScrollPopupActivity extends AppCompatActivity {

    private ListView listView;
    private PopupListViewAdapter adapter;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent_scroll_popup);


        dialog = new Dialog(TransparentScrollPopupActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.item_transparent_scroll_popup);


        /*
        adapter = new PopupListViewAdapter();

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.addItem(R.drawable.toothache,"증상제목1","부위","통증 정도","통증 양상","악화 상황","동반 증상");
        adapter.addItem(R.drawable.toothache,"증상제목2","부위","통증 정도","통증 양상","악화 상황","동반 증상");

        adapter.notifyDataSetChanged();

         */



    }
}