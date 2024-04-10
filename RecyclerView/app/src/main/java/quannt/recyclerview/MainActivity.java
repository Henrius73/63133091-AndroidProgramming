package quannt.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("bigben", "Tháp big ben");
        LandScape landScape2 = new LandScape("buckingham","Cung điện Buckingham");
        LandScape landScape3 = new LandScape("mountfuji","Núi Phú Sĩ (Nhật Bản)");
        LandScape landScape4 = new LandScape("eiffiel","Tháp eiffeiel");
        dsDulieu.add(landScape1);
        dsDulieu.add(landScape2);
        dsDulieu.add(landScape3);
        dsDulieu.add(landScape4);
        return dsDulieu;
    }
}