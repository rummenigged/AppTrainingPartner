package com.br.trainingpartner.View;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.br.trainingpartner.R;

/**
 * Created by LGPC on 25/05/2016.
 */
public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private static final String SELECTED_ITEM_ID = "selected_item_id";
    private Toolbar mToolbar;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private FloatingActionButton fab;
    private int mItemSelectedId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_home);
        setTitle("Home");
        setSupportActionBar(mToolbar);

        mNavigationView = (NavigationView) findViewById(R.id.nv);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        fab = (FloatingActionButton) findViewById(R.id.fb_dieta);

        mNavigationView.setNavigationItemSelectedListener(this);

        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.drawer_open,R.string.drawer_closed);

        mDrawerLayout.setDrawerListener(mToggle);
        mToggle.syncState();

        mItemSelectedId = savedInstanceState == null ? R.id.navigation_item_1 : savedInstanceState.getInt(SELECTED_ITEM_ID);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void navigate(int item){
        Intent intent;
        switch(item){

            case R.id.navigation_item_1_1:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(this,CafeDaManha.class);
                startActivity(intent);

            case R.id.navigation_item_2:
                mDrawerLayout.closeDrawer(GravityCompat.START);
                intent = new Intent(this,Alimentos.class);
                startActivity(intent);
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        item.setChecked(true);
        navigate(item.getItemId());
        return true;
    }
}
