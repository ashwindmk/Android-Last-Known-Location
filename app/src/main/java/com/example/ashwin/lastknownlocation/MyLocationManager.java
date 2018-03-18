package com.example.ashwin.lastknownlocation;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/**
 * Created by Ashwin on 3/18/2018.
 */

public class MyLocationManager {

    private LocationManager mLocationManager;

    public MyLocationManager(Context context) {
        mLocationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }

    public Location getLastKnownLocation() {
        return mLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }

}
