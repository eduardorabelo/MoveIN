package com.example.shoaib.movein;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
//import com.google.android.gms.location.LocationClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,OnMapReadyCallback,LocationListener ,GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {
    private GoogleMap mMap;

    SupportMapFragment sMapFragment;
    private static final float defaultzoom=15;

    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;
    private double currentLatitude;
    private double currentLongitude;

    Location location;

    public MainActivity() {
    }

    //  LocationClient mLocationClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sMapFragment = SupportMapFragment.newInstance();
        setContentView(R.layout.activity_main);

        //sMapFragment.getMapAsync(this);

        android.support.v4.app.FragmentManager sFm= getSupportFragmentManager();
        sFm.beginTransaction().show(sMapFragment).commit();
        sFm.beginTransaction().add(R.id.map, sMapFragment).commit();

        sMapFragment.getMapAsync(this);




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

    //function for searching the location on google map
    public void onSearch(View view)
    {
        EditText Search_bar =(EditText) findViewById(R.id.Location_bar);
        String Location= Search_bar.getText().toString();
        List<Address> addressList=null;
        if (Location != null || !Location.equals(""))
        {
            Geocoder geocoder=new Geocoder(this);
            try {
                addressList= geocoder.getFromLocationName(Location,1);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            Address address=addressList.get(0);
            LatLng latLng=new LatLng(address.getLatitude(),address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
       //     mMap.animateCamera(CameraUpdateFactory.zoomBy(20));



            CameraUpdate update = CameraUpdateFactory.newLatLngZoom(latLng,defaultzoom);
         //   mMap.moveCamera(update);
            mMap.animateCamera(update);
        }

    }


    //function for zoom On and Zoom out
    public void onZoom(View view)
    {


      //  mMap.setMyLocationEnabled(true);
       if (view.getId()==R.id.button_ZoomIn)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (view.getId()==R.id.button_ZoomOut)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomOut());
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


        switch(item.getItemId())

        {
            case R.id.mapTypeNone:
                mMap.setMapType(GoogleMap.MAP_TYPE_NONE);
                //  removeEverything();
                //route();
                break;

            case R.id.mapTypeNormal:
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                break;

            case R.id.mapTypeHybrid:
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                break;

            case R.id.mapTypeSatellite:
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                break;
            case R.id.mapTypeTerrain:
                mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                break;




            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }







 /*   @Override
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
*/
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
            Intent i= new Intent(MainActivity.this,GetIdentification.class);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.signup) {

            Intent i= new Intent(MainActivity.this,PostIdentification.class);
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

            final Uri uriUrl = Uri.parse("http://facebook.com/");
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);

            startActivity(launchBrowser);

        } else if (id == R.id.navigation) {

            Intent i= new Intent(MainActivity.this,Navigation.class);
            startActivity(i);

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

        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(fast_isb, defaultzoom);
        //   mMap.moveCamera(update);
        mMap.animateCamera(update);


        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {


                Intent i= new Intent(MainActivity.this,IndoorMapOptions.class);
                startActivity(i);
                return false;
            }
        });


        if ( ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED ) {
            mMap.setMyLocationEnabled(true);
            /*
      double a= location.getLatitude();
           double b= location.getLongitude();
            LatLng current = new LatLng(a, b);

            mMap.addMarker(new MarkerOptions().position(current).title("Your current location"));
*/
        }


mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
    @Override
    public void onMapLongClick(LatLng latLng) {
        Intent i = new Intent(MainActivity.this, IndoorMapOptions.class);
        startActivity(i);

    }
});
    }

    @Override
    public void onLocationChanged(Location location) {

        currentLatitude = location.getLatitude();
        currentLongitude = location.getLongitude();

        Toast.makeText(this, currentLatitude + " WORKS " + currentLongitude + "", Toast.LENGTH_LONG).show();


    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    @Override
    public void onConnected(Bundle bundle) {
        if ( ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED ) {
            Location location = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);


            if (location == null) {
                LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, (com.google.android.gms.location.LocationListener) this);

            } else {
                //If everything went fine lets get latitude and longitude
                currentLatitude = location.getLatitude();
                currentLongitude = location.getLongitude();

                Toast.makeText(this, currentLatitude + " WORKS " + currentLongitude + "", Toast.LENGTH_LONG).show();
            }
        }

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    public void gotonavigation(View view)
    {

      //  Intent i = new Intent(MainActivity.this,Navigation.class);
      //  startActivity(i);
    }
}
