package com.example.attendance;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1;
    private EditText e2,e3,e4,e5,e6;
    private Button b1;
    private TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        e1= (EditText) findViewById(R.id.a1);
        e2= (EditText) findViewById(R.id.a2);
        b1= (Button) findViewById(R.id.btn);
        t1= (TextView) findViewById(R.id.ans);

        e3= (EditText) findViewById(R.id.a3);
        e4= (EditText) findViewById(R.id.a4);
        //b2= (Button) findViewById(R.id.btn1);
        t2= (TextView) findViewById(R.id.ans1);

        e5= (EditText) findViewById(R.id.a5);
        e6= (EditText) findViewById(R.id.a6);
        //b2= (Button) findViewById(R.id.btn1);
        t3= (TextView) findViewById(R.id.ans2);

        t4= (TextView) findViewById(R.id.ans3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(e1.getText().toString());
                int n2= Integer.parseInt(e2.getText().toString());
                int n3= Integer.parseInt(e3.getText().toString());
                int n4= Integer.parseInt(e4.getText().toString());
                int n5= Integer.parseInt(e5.getText().toString());
                int n6= Integer.parseInt(e6.getText().toString());
                int sum= n1+(2*n2);
                sum= (sum*100)/5;
                t1.setText("Attendance" + String.valueOf(sum));
                int sum1= n3+(2*n4);
                sum1= (sum1*100)/5;
                t2.setText("Attendance" + String.valueOf(sum1));
                int sum2= n5+(2*n6);
                sum2= (sum2*100)/5;
                t3.setText("Attendance" + String.valueOf(sum2));
                int fsum= (sum1+sum2+sum)/3;
                t4.setText("Attendance" + String.valueOf(fsum));

                if (fsum<75) {
                    Toast.makeText(MainActivity.this, "Please sit for more lectures", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Bravo! You are an inspiration", Toast.LENGTH_LONG).show();

                }
            }
        });
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
