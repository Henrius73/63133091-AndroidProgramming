package quannt.vd2_dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword, etEmail;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getControls();
        btnLogin.setOnClickListener(v -> {
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();
                    String email = etEmail.getText().toString();
                    if(username.equals("Liberty") && password.equals("123456")){
                        Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                        iQuiz.putExtra("username", username);
                        iQuiz.putExtra("email", email);
                        startActivity(iQuiz);
                    }
                    else
                    {
                        Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    public void getControls(){
        etUsername = findViewById(R.id.edt_UserName);
        etPassword = findViewById(R.id.edt_Pass);
        etEmail = findViewById(R.id.et_email);
        btnLogin = findViewById(R.id.btn_OK);
    }
}