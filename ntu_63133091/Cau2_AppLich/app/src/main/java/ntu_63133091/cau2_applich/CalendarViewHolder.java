package ntu_63133091.cau2_applich;

import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalendarViewHolder extends RecyclerView.ViewHolder {
    public final TextView dayofMonth;
    public CalendarViewHolder(@NonNull View itemView) {
        super(itemView);
        dayofMonth = itemView.findViewById(R.id.cellDayText);
    }
}
