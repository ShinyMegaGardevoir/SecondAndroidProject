package ctec.secondproject.controller;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private ArrayList<Integer> colorList;


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.FirstButton);
		appText = (TextView) findViewById(R.id.wordsView);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.rivertonPurple);
		colorList.add(R.color.pink);
		colorList.add(R.color.black);
		colorList.add(R.color.white);
		colorList.add(R.color.aquaBlue);
		colorList.add(R.color.uglyBrown);
		colorList.add(R.color.forestGreen);
		
	}
    private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				//Button click stuff goes here
				
				appButton.setBackgroundResource(colorList.get(new Random().nextInt(colorList.size())));
				findViewById(R.id.appLayout).setBackgroundResource(colorList.get(new Random().nextInt(colorList.size())));
			}
		});
	}
}
