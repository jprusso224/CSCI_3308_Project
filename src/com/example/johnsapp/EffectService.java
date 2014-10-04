package com.example.johnsapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class EffectService extends Service{

	 @Override
	   public IBinder onBind(Intent arg0) {
	      return null;
	   }

	   @Override
	   public int onStartCommand(Intent intent, int flags, int startId) {
	      // Let it continue running until it is stopped.
	      Toast.makeText(this, "Effect Started", Toast.LENGTH_LONG).show();
	      return START_STICKY;
	   }
	   @Override
	   public void onDestroy() {
	      super.onDestroy();
	      Toast.makeText(this, "Effect Destroyed", Toast.LENGTH_LONG).show();
	   }

}

