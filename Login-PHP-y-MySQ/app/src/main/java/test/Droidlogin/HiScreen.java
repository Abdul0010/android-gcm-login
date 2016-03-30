package test.Droidlogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class HiScreen extends Activity {
	String user;
	TextView txt_usr, logoff;
	 public void onCreate(Bundle savedInstanceState) {
		 
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.lay_screen);
            
	        txt_usr= (TextView) findViewById(R.id.usr_name);
            logoff= (TextView) findViewById(R.id.logoff);          
            
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
         	   user  = extras.getString("user");//usuario
            }else{
         	   user="error";
         	   }
            
            txt_usr.setText(user);
	        logoff.setOnClickListener(new View.OnClickListener(){
	         	
	         	public void onClick(View view){
	         		finish();
	         									}
	         	});	               
	 }
	 
	 @Override
	 public boolean onKeyDown(int keyCode, KeyEvent event)  {
	     if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	         return true;
	     }

	     return super.onKeyDown(keyCode, event);
	 }
	
	
}
