package net.antlab.nanoportfoliozero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    Button spotifyStreamer;
    Button scoresApp;
    Button scoresLibrary;
    Button buildItBigger;
    Button xyzReader;
    Button capstoneApp;
    String toastMessageTemplate;

    private Button initPortfolioButton(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = String.format(toastMessageTemplate, button.getText());
                Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return button;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastMessageTemplate = getString(R.string.toast_message);

        spotifyStreamer = initPortfolioButton((Button) findViewById(R.id.spotifyStreamer));
        scoresApp = initPortfolioButton((Button) findViewById(R.id.scoresApp));
        scoresLibrary = initPortfolioButton((Button) findViewById(R.id.scoresLibrary));
        buildItBigger = initPortfolioButton((Button) findViewById(R.id.buildItBigger));
        xyzReader = initPortfolioButton((Button) findViewById(R.id.xyzReader));
        capstoneApp = initPortfolioButton((Button) findViewById(R.id.capstoneApp));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
