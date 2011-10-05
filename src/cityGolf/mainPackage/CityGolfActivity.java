package cityGolf.mainPackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CityGolfActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

			}
		});
    }
}