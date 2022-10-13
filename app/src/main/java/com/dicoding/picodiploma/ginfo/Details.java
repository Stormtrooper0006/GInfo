package com.dicoding.picodiploma.ginfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_GENERAL = "extra_general";
    public static final String EXTRA_ABOUT_GAME = "extra_about_game";
    public static final String EXTRA_SYSTEM_REQUIREMENTS = "extra_system_requirements";
    public static final String EXTRA_COPYRIGHT = "extra_copyright";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView gameTitle = findViewById(R.id.game_title);
        String title = getIntent().getStringExtra(EXTRA_TITLE);
        gameTitle.setText(title);

        ImageView gamePhoto = findViewById(R.id.game_photo);
        int photos = getIntent().getIntExtra(EXTRA_PHOTO, 0);
        gamePhoto.setImageResource(photos);

        TextView gameGeneral = findViewById(R.id.general);
        String common = getIntent().getStringExtra(EXTRA_GENERAL);
        gameGeneral.setText(common);

        TextView gameAbout = findViewById(R.id.aboutGame_details);
        String about = getIntent().getStringExtra(EXTRA_ABOUT_GAME);
        gameAbout.setText(about);

        TextView gameSystemRequirements = findViewById(R.id.systemRequirements_details);
        String systemRequirements = getIntent().getStringExtra(EXTRA_SYSTEM_REQUIREMENTS);
        gameSystemRequirements.setText(systemRequirements);

        TextView gameCopyright = findViewById(R.id.copyright);
        String copyright = getIntent().getStringExtra(EXTRA_COPYRIGHT);
        gameCopyright.setText(copyright);
    }
}
