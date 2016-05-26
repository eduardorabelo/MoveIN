package com.example.shoaib.movein;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import android.graphics.Color;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Navigation extends Activity  {
    ListView lv;
    WifiManager wifi;
    String wifis[];
    String wifis1[];
    String wifis2[];

    WifiScanReceiver wifiReciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        lv=(ListView)findViewById(R.id.listView);

        wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
        wifiReciever = new WifiScanReceiver();
        wifi.startScan();
        WifiInfo wifiInfo = wifi.getConnectionInfo();
        double myfreq =  wifiInfo.getFrequency();

        int myint = wifiInfo.getRssi();
        String mystring= String.valueOf(myint);

        double distance= calculateDistance(myint, myfreq);
        double distance1 = calculateDistance(2412, -57);
        double mydistance= Math.round(distance);

        String mystring_1= String.valueOf(myfreq);
        String mystring_2= String.valueOf(mydistance)+"m";
        String mystring_3 = String.valueOf(distance1);
        TextView freq = (TextView)findViewById(R.id.network);
        TextView d1= (TextView) findViewById(R.id.d1);
        //   TextView d2 =(TextView) findViewById(R.id.d2);
        // freq.setText(mystring_1);
        d1.setText(mystring_2);


        TextView t= (TextView) findViewById(R.id.textview);
        t.setText(mystring);
        int level = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 10);
        String SSID= wifiInfo.getSSID();
        TextView t1= (TextView) findViewById(R.id.textView);
        String mystring2;
        mystring2 = String.valueOf(level);
        t1.setText(mystring2);

        TextView t2= (TextView) findViewById(R.id.ssid);
        t2.setText(SSID);

    }

    protected void onPause() {
        unregisterReceiver(wifiReciever);
        super.onPause();
    }

    protected void onResume() {
        registerReceiver(wifiReciever, new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    public double calculateDistance(double signalLevelInDb, double freqInMhz)
    {

        double exp = (27.56 - (20 * Math.log10(freqInMhz))+ Math.abs(signalLevelInDb) )/20.0;
        // Math.round(exp);
        return Math.pow(10.0,exp);


    }

    private class WifiScanReceiver extends BroadcastReceiver{
        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        public void onReceive(Context c, Intent intent) {
            List<ScanResult> wifiScanList = wifi.getScanResults();
            wifis = new String[wifiScanList.size()];
            wifis1 = new String[wifiScanList.size()];
            wifis2 = new String[wifiScanList.size()];


            for(int i = 0; i < wifiScanList.size(); i++){
                wifis[i] = ((wifiScanList.get(i)).toString());
            }
            lv.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,wifis));
//Level of a scan result
            List<ScanResult> wifiList = wifi.getScanResults();
            for (ScanResult scanResult : wifiList) {
                String ssid = scanResult.SSID;
                int rrsid = scanResult.level;
                double Freq1 = wifi.getConnectionInfo().getFrequency();
                double dist1= calculateDistance(rrsid, Freq1);
                double finaldist1= Math.round(dist1);
                String mydist1= String.valueOf(finaldist1);
                int level = WifiManager.calculateSignalLevel(scanResult.level, 10);
                Toast.makeText(getApplicationContext(), ssid + "  Level is " + level + " out of 10 while RSSI is " + rrsid + " and distance from router is " + mydist1 + "m", Toast.LENGTH_LONG).show();
                //  System.out.println("Level is " + level + " out of 5");
            }

// Level of current connection
            int rssi = wifi.getConnectionInfo().getRssi();
            String myssid= wifi.getConnectionInfo().getSSID();
            double Freq = wifi.getConnectionInfo().getFrequency();
            double dist= calculateDistance(rssi, Freq);
            double finaldist= Math.round(dist);
            String mydist= String.valueOf(finaldist);
            int level = WifiManager.calculateSignalLevel(rssi, 10);
            Toast.makeText(getApplicationContext(), myssid + "  Level is " + level + " out of 10 while RSSI is " + rssi + " and distance from router is " + mydist+ "m", Toast.LENGTH_LONG).show();

            //   System.out.println("Level is " + level + " out of 5");

        }
    }
}
