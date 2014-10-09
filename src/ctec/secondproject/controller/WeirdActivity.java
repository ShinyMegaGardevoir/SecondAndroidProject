package ctec.secondproject.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.FirstButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				appButton.setBackgroundResource(R.color.uglyBrown);
			}
		});
	}
}
