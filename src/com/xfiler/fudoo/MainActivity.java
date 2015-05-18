package com.xfiler.fudoo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.*;
import android.widget.ListView;
import android.widget.Toast;
import com.xfiler.fudoo.adapter.ContentAdapter;
import com.xfiler.fudoo.model.Content;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {
    private MenuLayout layout;
    private ContentAdapter adapter;
    private ListView listView;
    private List<Content> datalist = new ArrayList<Content>();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initData();
        layout = (MenuLayout) findViewById(R.id.menu_left);
        ActionBar bar = getActionBar();
        bar.setTitle("全部");
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF568CE0")));
        bar.setIcon(R.drawable.menu_more);
        bar.show();

        adapter = new ContentAdapter(this, R.layout.mainlist_item, datalist);
        listView = (ListView) findViewById(R.id.content_list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_home:
                Toast.makeText(getBaseContext(), "home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_write:
                Toast.makeText(getBaseContext(), "write", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, NewContentActivity.class));
                break;
            case R.id.menu_message:
                Toast.makeText(getBaseContext(), "message", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                if (layout.getVisibility() == View.GONE) {
                    layout.setVisibility(View.VISIBLE);
                    layout.findViewById(R.id.menu_setting).setOnClickListener(this);
                } else {
                    layout.setVisibility(View.GONE);
                }
                Toast.makeText(getBaseContext(), "home more", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;

        }
    }


    private void initData() {
        Content c1 = new Content("虎扑篮球", "微博 weibo.com", "10分钟前", "【保罗谈第六场被逆转：这就是生活】在前天没的比赛中，火箭第四节冷藏了当家球星詹姆斯-哈登，由约什-史密斯带队上演了惊天大逆转。\n" +
                "        ‘这就是生活，只能忘掉比赛，继续向前看。’保罗说道。", null, 32, 12);
        Content c2 = new Content("虎扑篮球", "微博 weibo.com", "10分钟前", "【保罗谈第六场被逆转：这就是生活】在前天没的比赛中，火箭第四节冷藏了当家球星詹姆斯-哈登，由约什-史密斯带队上演了惊天大逆转。\n" +
                "        ‘这就是生活，只能忘掉比赛，继续向前看。’保罗说道。", null, 32, 12);
        Content c3 = new Content("虎扑篮球", "微博 weibo.com", "10分钟前", "【保罗谈第六场被逆转：这就是生活】在前天没的比赛中，火箭第四节冷藏了当家球星詹姆斯-哈登，由约什-史密斯带队上演了惊天大逆转。\n" +
                "        ‘这就是生活，只能忘掉比赛，继续向前看。’保罗说道。", null, 32, 12);
        Content c4 = new Content("虎扑篮球", "微博 weibo.com", "10分钟前", "【保罗谈第六场被逆转：这就是生活】在前天没的比赛中，火箭第四节冷藏了当家球星詹姆斯-哈登，由约什-史密斯带队上演了惊天大逆转。\n" +
                "        ‘这就是生活，只能忘掉比赛，继续向前看。’保罗说道。", null, 32, 12);
        datalist.add(c1);
        datalist.add(c2);
        datalist.add(c3);
        datalist.add(c4);
    }

}
