package sg.edu.np.mad.week2prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.followed = false; //set the variable

        //Button Control
        Button follow = findViewById(R.id.button);
        follow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (user.followed == false){ //on click, when variable is false,
                    follow.setText("UNFOLLOW"); //set text to unfollow
                    user.followed = true; //set variable to true
                }
                else
                {
                    follow.setText("FOLLOW");
                    user.followed = false;
                }
            }
        });
    }
}