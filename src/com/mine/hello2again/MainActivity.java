package com.mine.hello2again;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button button;
	TextView text;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById(R.id.button1);
        text = (TextView) findViewById(R.id.text1);
        
        button.setOnClickListener(new OnClickListener() {
	    	 public void onClick(View v) {
	    		 sayHello();
   		
	    	 }
       });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sayHello()
    {
    	text.setText("hello there!!!");
    	text.setBackgroundColor(Color.GREEN);
    	
    }
    
}
