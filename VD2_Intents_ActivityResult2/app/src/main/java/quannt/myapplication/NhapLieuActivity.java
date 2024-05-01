package quannt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NhapLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_lieu);
    }
    public void Nhap_QuayVe(View v) {
        EditText etTen = findViewById(R.id.et_ten);
        EditText etTuoi = findViewById(R.id.et_namsinh);
        // Lấy dữ liệu
        String ten = etTen.getText().toString();
        String tuoi = etTuoi.getText().toString();
        // Tạo mới intent
        Intent iGui = new Intent();
        // Đưa dữ liệu vào intent để gửi về
        // Dữ liệu được đưa vào dạng KEY (NAME) --> VALUE
        iGui.putExtra("ten", ten); //Tên là key do ta đặt, dùng để truy xuất / bóc dữ liệu
        iGui.putExtra("tuoi", tuoi);
        // Gửi kết quả cho activity đã gọi nó
        setResult(RESULT_OK, iGui);
        // Đóng Activity nhập liệu (này)
        finish();

    }
}