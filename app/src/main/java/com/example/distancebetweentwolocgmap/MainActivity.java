package com.example.distancebetweentwolocgmap;

import androidx.appcompat.app.AppCompatActivity;
import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        textView = findViewById(R.id.textView);
        Location currentLocation = new Location("locationA");
        currentLocation.setLatitude(74.5818677648582);
        currentLocation.setLongitude(16.852636448083448);
        Location destination = new Location("locationB");
        destination.setLatitude(74.21229803622516);
        destination.setLongitude(16.787741256855018);
        double distance = currentLocation.distanceTo(destination);
        textView.setText("Distance between two Geographic Locations: " + distance + " KMS");
    }
}