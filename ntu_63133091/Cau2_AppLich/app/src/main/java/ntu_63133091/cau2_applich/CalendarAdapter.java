package ntu_63133091.cau2_applich;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarViewHolder> {
    private final ArrayList<String> dayofMonth;
    public CalendarAdapter(ArrayList<String> dayofMonth) {
        this.dayofMonth = dayofMonth;
    }

    @NonNull
    @Override
    public CalendarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
