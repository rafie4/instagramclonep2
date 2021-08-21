package com.example.instagramclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.instagramclone.fragments.ComposeFragment;
import com.example.instagramclone.fragments.PostsFragment;
import com.example.instagramclone.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    final FragmentManager fragmentManager = getSupportFragmentManager();
    //    public static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 42;
//    private EditText etDescription;
//    private Button btnCaptureImage;
//    private ImageView ivPostImage;
//    private Button btnSubmit;
    private BottomNavigationView bottomNavigationView;
//    private File photoFile;
//    public String photoFileName = "photo.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        etDescription = findViewById(R.id.etDescription);
//        btnCaptureImage = findViewById(R.id.btnCaptureImage);
//        ivPostImage = findViewById(R.id.ivPostImage);
//        btnSubmit = findViewById(R.id.btnSubmit);
        bottomNavigationView = findViewById(R.id.bottomNavigation);

//        btnCaptureImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                launchCamera();
//            }
//        });
//
//        //queryPosts();
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String description = etDescription.getText().toString();
//                if (description.isEmpty()) {
//                    Toast.makeText(MainActivity.this, "Description cannot be empty", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if (photoFile == null || ivPostImage.getDrawable() == null) {
//                    Toast.makeText(MainActivity.this, "There is no image!", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                ParseUser currentUser = ParseUser.getCurrentUser();
//                savePost(description, currentUser, photoFile);
//            }
//        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = new ComposeFragment();
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        fragment = new PostsFragment();
                        break;
                    case R.id.action_compose:
                        // do something here
                        fragment = new ComposeFragment();
                        break;
                    case R.id.action_profile:
                        // do something here
                        fragment = new ProfileFragment();
                        break;
                    default:
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });
        //Set default selection
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }
}