package com.xfiler.fudoo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.xfiler.fudoo.R;
import com.xfiler.fudoo.model.Content;

import java.util.List;

/**
 * Created by Administrator on 2015/5/17.
 */
public class ContentAdapter extends ArrayAdapter<Content> {
    public ContentAdapter(Context context, int textViewResourceId, List<Content> objects) {
        super(context, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Content content=getItem(position);
        ViewHolder viewHolder=new ViewHolder();
        if(convertView==null){
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.mainlist_item,null);
            viewHolder.accountName= (TextView) convertView.findViewById(R.id.account_name);
            viewHolder.accountIcon= (ImageView) convertView.findViewById(R.id.account_icon);
            viewHolder.contentText= (TextView) convertView.findViewById(R.id.content_text);
            viewHolder.contentImage= (ImageView) convertView.findViewById(R.id.content_image);
            viewHolder.contentSourceAndTime= (TextView) convertView.findViewById(R.id.content_source);
            viewHolder.contentForwardAndComment= (TextView) convertView.findViewById(R.id.content_forward);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.accountName.setText(content.getAccountName());
        viewHolder.contentText.setText(content.getConentText());
//        viewHolder.contentImage.set
        String time=content.getContentTime();
        String source=content.getContentSource();
        viewHolder.contentSourceAndTime.setText("来自"+source+"·"+time);
        String forward=content.getForward()+"次转发";
        String comment=content.getComment()+"次评论";
        viewHolder.contentForwardAndComment.setText(forward+" | "+comment);
        viewHolder.contentText.setText(content.getConentText());
        return convertView;
    }

    private class ViewHolder{
        private TextView contentText;
        private ImageView contentImage;
        private TextView accountName;
        private ImageView accountIcon;
        private TextView contentForwardAndComment;
        private TextView contentSourceAndTime;
    }
}
