package com.xfiler.fudoo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/5/17.
 */
public class MenuLayout extends LinearLayout implements View.OnClickListener,AdapterView.OnItemClickListener {
    private TextView favourite;
    private TextView draft;
    private TextView search;
    private TextView setting;
    private TextView exit;
    private TextView more;

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> datalist=new ArrayList<String>();
    public MenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.main_leftmenu,this);
        iniData();
        listView= (ListView) findViewById(R.id.content_classify_list);
        adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,datalist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        setting= (TextView) findViewById(R.id.menu_setting);
        favourite= (TextView) findViewById(R.id.menu_favourite);
        draft= (TextView) findViewById(R.id.menu_draft);
        search= (TextView) findViewById(R.id.menu_search);
        exit= (TextView) findViewById(R.id.menu_exit);
        setting.setOnClickListener(this);
        favourite.setOnClickListener(this);
        draft.setOnClickListener(this);
        search.setOnClickListener(this);
        exit.setOnClickListener(this);
    }
    public void iniData(){
        datalist.add("全部");
        datalist.add("相互关注");
        datalist.add("特别关注");
        datalist.add("同学");
        datalist.add("明星");
        datalist.add("计算机");
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.menu_draft:
                Toast.makeText(getContext(),"menu_draft",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(getContext(),"menu_search",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_setting:
                Toast.makeText(getContext(),"menu_setting",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_favourite:
                Toast.makeText(getContext(),"menu_favourite",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView text1 = (TextView) view.findViewById(android.R.id.text1);
        Toast.makeText(getContext(),text1.getText(),Toast.LENGTH_SHORT).show();
    }
}
