package com.thailandbileti.app;
import android.app.Activity; import android.os.Bundle; import android.widget.ImageView; import android.graphics.Bitmap; import android.graphics.BitmapFactory; import android.util.Base64; import android.graphics.Color;
public class MainActivity extends Activity { @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    ImageView imageView = new ImageView(this);
    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    imageView.setBackgroundColor(Color.BLACK);
    setContentView(imageView);

    // Maymun rasmining Base64 kodi
    String base64Image = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAP//////////////////////////////////////////////////////////////////////////////////////wgALCAEAAQERASIA/8QAFBABAAAAAAAAAAAAAAAAAAAAAP/aAAgBAQABPxA=";

    try {
        byte[] decodedString = Base64.decode(base64Image, Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        imageView.setImageBitmap(decodedByte);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
