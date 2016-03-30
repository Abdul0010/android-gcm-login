package com.testpush;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity2 extends ActionBarActivity implements LocationListener{


        protected LocationManager locationManager;
        protected LocationListener locationListener;
        protected Context context;
        TextView txtLat;
        String lat;
    String lat1,lan1;

    String provider;
        protected String latitude,longitude;
        protected boolean gps_enabled,network_enabled;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activity2);
            txtLat = (TextView) findViewById(R.id.tt);

            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, (android.location.LocationListener) this);
        }
        public void onLocationChanged(Location location) {
            txtLat = (TextView) findViewById(R.id.tt);
            txtLat.setText("Latitude:" + location.getLatitude() + ", Longitude:" + location.getLongitude());
            lat1= Double.toString(location.getLongitude());
            lan1= Double.toString(location.getLongitude());
            // String URL_connect="http://www.scandroidtest.site90.com/acces.php";
            String IP_Server="166.62.27.55";//IP DE NUESTRO PC
            String URL_connect="http://codesoftwd.com/login/acces.php";//ruta en donde estan nuestros archivos



        }


        public void onProviderDisabled(String provider) {
            Log.d("Latitude", "disable");
        }

        public void onProviderEnabled(String provider) {
            Log.d("Latitude","enable");
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
            Log.d("Latitude","status");
        }



}