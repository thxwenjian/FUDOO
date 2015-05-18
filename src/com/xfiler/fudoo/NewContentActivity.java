package com.xfiler.fudoo;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/5/17.
 */
public class NewContentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_content);
        ActionBar bar = getActionBar();
        bar.setTitle("发微博");
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF568CE0")));
        bar.setIcon(R.drawable.menu_back);
        bar.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_new_content, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                Toast.makeText(getBaseContext(), "add", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Toast.makeText(getBaseContext(), "home more", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return true;
    }
}
