package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class DeviceUtils1 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_utils1);
        textView = findViewById(R.id.asd);
        getIMEI(getApplicationContext());
        if(ActivityCompat.checkSelfPermission(this.getApplicationContext(), "android.permission.READ_PRIVILEGED_PHONE_STATE") != PackageManager.PERMISSION_GRANTED)        {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PRIVILEGED_PHONE_STATE"},123);
        }
    }
    public static String getIMEI(Context context) {

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                String androidId = telephonyManager.getImei();
                return telephonyManager.getImei();
            } else {
                // For older devices (pre-Oreo), use getDeviceId()
                return telephonyManager.getDeviceId();
            }
        }
        return null; // Handle null case appropriately in your code
    }
}