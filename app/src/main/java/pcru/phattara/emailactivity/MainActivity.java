package pcru.phattara.emailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"st641102064111@pcru.ac.th"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
                intent.putExtra(Intent.EXTRA_TEXT, "Hello, this is a message from Android Studio");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
    }
}