package mno.mohamed_youssef.firebase;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

public class MainActivity extends Activity {





    Firebase mRef;
    TextView textView;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        out = (TextView)findViewById(R.id.textView);

        mRef = new Firebase("https://scorching-heat-4418.firebaseio.com/users/name");




       /* mRef.setValue("Mohamed");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                textView.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
*/
     //  out.setText( );

    }

}
