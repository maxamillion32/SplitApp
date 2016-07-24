package ar.uba.fi.splitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

public class NewEventDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FacebookManager.checkInit(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RelativeLayout addFriend = (RelativeLayout) findViewById(R.id.add_friend);
        addFriend.setOnClickListener(v -> {
            Intent friendListIntent = new Intent(this, FriendChooserActivity.class);
            startActivityForResult(friendListIntent, 0);
        });
    }

}
