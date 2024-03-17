package quannt.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edThongTin;
    ListView lsvTen;
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_Nguon;
    void getControls(){
        edThongTin = (EditText)findViewById(R.id.edThongTin);
        lsvTen = (ListView)findViewById(R.id.lvTen);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
        dsTen = new ArrayList<String>();
            dsTen.add("Quân");
            dsTen.add("Huy");
            dsTen.add("Luân");
            dsTen.add("Thiên");
            bo_Nguon = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,dsTen);
        lsvTen.setAdapter(bo_Nguon);
    }
    public void ThemPhanTu(View v){
        EditText editTenMoi = (EditText)findViewById(R.id.edNhapTen);
        String tenNhap = editTenMoi.getText().toString();

        dsTen.add(tenNhap);
        bo_Nguon.notifyDataSetChanged();
    }
}