package m.kumagai.musicplayer2.ui.main;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import m.kumagai.musicplayer2.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView titleview;
    public TextView artistview;
    public TextView albumview;
    public LinearLayout linearLayout;

    public RecyclerViewHolder(View itemView){
        super(itemView);
        titleview = itemView.findViewById(R.id.title);
        artistview = itemView.findViewById(R.id.artist);
        albumview = itemView.findViewById(R.id.album);
        linearLayout = itemView.findViewById(R.id.row);
    }
}
