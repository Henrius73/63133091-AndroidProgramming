package quannt.vd1_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    // Hàm đáp ứng sự kiện nhấn lên nút "Quay về trang chủ"
    // Xủ lý chuyển màn hình về trang chủ
    public void QuayVe(View v){
        // Tạo một đối tượng Intent
        // Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang màn khác
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        // Thực hiện chuyển
        startActivity(iManHinhChinh);
    }
}