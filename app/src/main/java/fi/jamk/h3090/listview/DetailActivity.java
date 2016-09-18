package fi.jamk.h3090.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Crowmoore on 18-Sep-16.
 */
public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String phone = bundle.getString("phone");

        TextView textView = (TextView) findViewById(R.id.phoneTextView);
        textView.setText(phone);

        ImageView imageView = (ImageView) findViewById(R.id.phoneImageView);

        switch (phone) {
            case "Android": imageView.setImageResource(R.drawable.android);
                break;
            case "iPhone": imageView.setImageResource(R.drawable.ios);
                break;
            case "Blackberry": imageView.setImageResource(R.drawable.blackberry);
                break;
            case "Ubuntu": imageView.setImageResource(R.drawable.ubuntu);
                break;
            case "WebOS": imageView.setImageResource(R.drawable.webos);
                break;
            case "WindowsMobile": imageView.setImageResource(R.drawable.windows);
                break;
        }
    }

    public void backButtonPressed(View view) {
        finish();
    }
}
