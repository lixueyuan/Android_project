package test.zxc.secondapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    void  newMothed(){
        
    }

    void  buttonAction(View a){
//        prinln("点击了按钮");
        System.out.print("dianji");
        Toast.makeText(this,"123",Toast.LENGTH_SHORT).show();
    }
}
