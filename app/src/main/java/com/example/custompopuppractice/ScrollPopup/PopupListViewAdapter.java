package com.example.custompopuppractice.ScrollPopup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custompopuppractice.R;

import java.util.ArrayList;

public class PopupListViewAdapter extends BaseAdapter {
    private ImageView imageView;
    private TextView title;
    private TextView part;
    private TextView degree;
    private TextView condition;
    private TextView situation;
    private TextView with;
    PopupListViewAdapter(){}

    //어댑터에 추가된 아이템을 저장하기 위한 ArrayList
    private ArrayList<ListPopupItem> listPopupItemList = new ArrayList<ListPopupItem>();


    @Override
    public int getCount() {
        return listPopupItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listPopupItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_transparent_scroll_popup,parent,false);
        }
        // 화면에 표시될 inflate된 View에서 위젯에 대한 참조 획득
        imageView = (ImageView) convertView.findViewById(R.id.image);
        title = (TextView) convertView.findViewById(R.id.title);
        part = (TextView) convertView.findViewById(R.id.part);
        degree = (TextView) convertView.findViewById(R.id.degree);
        condition = (TextView) convertView.findViewById(R.id.condition);
        situation = (TextView) convertView.findViewById(R.id.situation);
        with = (TextView) convertView.findViewById(R.id.with);

        ListPopupItem listPopupItem = listPopupItemList.get(position);

        imageView.setImageResource(listPopupItem.getImageView());
        title.setText(listPopupItem.getTitle());
        part.setText(listPopupItem.getPart());
        degree.setText(listPopupItem.getDegree());
        condition.setText(listPopupItem.getCondition());
        situation.setText(listPopupItem.getSituation());
        with.setText(listPopupItem.getWith());


        return convertView;
    }

    public void addItem(int image,String title,String part,String degree,String condition,String situation,String with){
        ListPopupItem item = new ListPopupItem();

        item.setImageView(image);
        item.setTitle(title);
        item.setPart(part);
        item.setDegree(degree);
        item.setCondition(condition);
        item.setSituation(situation);
        item.setWith(with);
    }
}
