package com.sanket.padaayi;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ui.AppBarConfiguration;

import com.google.android.material.navigation.NavigationView;
import com.sanket.padaayi.ui.home.HomeFragment;
import com.sanket.padaayi.ui.letters.LettersFragment;
import com.sanket.padaayi.ui.tests.TestsFragment;
import com.sanket.padaayi.ui.tests.tests.Test2;
import com.sanket.padaayi.ui.words.WordsFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle(getResources().getString(R.string.menu_home));
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1,new HomeFragment()).commit();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            getSupportActionBar().setTitle(getResources().getString(R.string.menu_home));
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1,new HomeFragment()).commit();
        } else if (id == R.id.nav_letters) {
            getSupportActionBar().setTitle(getResources().getString(R.string.menu_letters));
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1,new LettersFragment()).commit();
        } else if (id == R.id.nav_words) {
            getSupportActionBar().setTitle(getResources().getString(R.string.menu_words));
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1,new WordsFragment()).commit();
        } else if (id == R.id.nav_tests) {
            SharedPreferences sharedPreferences1 = getSharedPreferences("Test_Related", Context.MODE_PRIVATE);
            final String l1 = sharedPreferences1.getString("level1","fail");
            final String l2 = sharedPreferences1.getString("level2","fail");

            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.custom_dialog);

            Button level1 = dialog.findViewById(R.id.level1);
            Button level2 = dialog.findViewById(R.id.level2);

            level1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                    getSupportActionBar().setTitle(getResources().getString(R.string.menu_tests));
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1, new TestsFragment()).commit();
                }
            });

            level2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (l1.equals("pass")) {
                        dialog.dismiss();
                        startActivity(new Intent(MainActivity.this, Test2.class));
                    }
                    else{
                        Toast.makeText(MainActivity.this, "पहिली पातळी पास करा", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            dialog.show();


        } else if (id == R.id.nav_about) {
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.fragment_aboutus);
            dialog.show();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (getSupportActionBar().getTitle().equals(getResources().getString(R.string.menu_home))) {
                startActivity(new Intent(MainActivity.this,ExitPage.class));
            }
            else {
                getSupportActionBar().setTitle(getResources().getString(R.string.menu_home));
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container1,new HomeFragment()).commit();
            }
        }
    }
}
