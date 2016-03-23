package com.example.shoaib.movein;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,OnMapReadyCallback {
    private GoogleMap mMap;

    SupportMapFragment sMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sMapFragment = SupportMapFragment.newInstance();
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        sMapFragment.getMapAsync(this);

        android.support.v4.app.FragmentManager sFm= getSupportFragmentManager();
        sFm.beginTransaction().show(sMapFragment).commit();
        sFm.beginTransaction().add(R.id.map, sMapFragment).commit();

        sMapFragment.getMapAsync(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        android.support.v4.app.FragmentManager sFm= getSupportFragmentManager();
        int id = item.getItemId();

     //   if(sMapFragment.isAdded())
       //     sFm.beginTransaction().hide(sMapFragment).commit();

        if (id == R.id.signin) {
//go to signin activity if this buttion is pressed in navigation drawer
            Intent i= new Intent(MainActivity.this,SignInActivity.class);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.signup) {

            Intent i= new Intent(MainActivity.this,SignUpActivity.class);
            startActivity(i);
         //   if (!sMapFragment.isAdded())
            //sFm.beginTransaction().add(R.id.map, sMapFragment).commit();
           // else
             //   sFm.beginTransaction().show(sMapFragment).commit();




        } else if (id == R.id.help) {
            Intent i= new Intent(MainActivity.this,HelpActivity.class);
            startActivity(i);

        } else if (id == R.id.about) {
//go to about scrolling activity if this buttion is pressed in navigation drawer
            Intent i= new Intent(MainActivity.this,AboutActivity.class);
            startActivity(i);

        } else if (id == R.id.share) {

            Intent i= new Intent(MainActivity.this,IndoorMapOptions.class);
            startActivity(i);

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        // Add a marker in Fast Nuces and move the camera
        LatLng fast_isb = new LatLng(33.655830, 73.015150);
        mMap.addMarker(new MarkerOptions().position(fast_isb).title("Marker in Fast Nuces"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fast_isb));

    }
}
