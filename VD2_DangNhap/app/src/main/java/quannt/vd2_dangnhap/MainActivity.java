package quannt.vd2_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn_Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Login = findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(v -> {
            // Mở màn hình đăng nhập
            Intent iLogin = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(iLogin);
        });
    }
}