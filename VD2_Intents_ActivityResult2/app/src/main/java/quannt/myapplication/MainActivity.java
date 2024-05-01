package quannt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Hàm đáp ứng sự kiện onCLick lên nút "MỞ MÀN HÌNH NHẬP LIỆU"
    public void NhapLieu(View v) {
        //Tạo mới một Intent
        Intent iNhap = new Intent(this, NhapLieuActivity.class);
        //Chuyển sang màn hình nhập liệu
        //Nhưng có đợi kết quả trả về, mã của yêu cầu này ta đặt là 8000
        startActivityForResult(iNhap, 8000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 8000)
            if (resultCode == RESULT_OK) {
                // Lấy dữ liệu trả về theo key value
                String ten = data.getStringExtra("ten");
                String tuoi = data.getStringExtra("tuoi");
                // Đưa dữ liêu lên giao diện
                TextView tvTen = findViewById(R.id.tv_ten); //Lấy tham chiếu
                TextView tvTuoi = findViewById(R.id.tv_namsinh);
                tvTen.setText(ten);  //gán cho thuộc tính Text
                tvTuoi.setText(tuoi);

            } else {
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
            }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}