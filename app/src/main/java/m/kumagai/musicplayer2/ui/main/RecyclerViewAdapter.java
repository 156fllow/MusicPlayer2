package m.kumagai.musicplayer2.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import m.kumagai.musicplayer2.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    public List<RowData> list;
    private View.OnClickListener listener;

    public RecyclerViewAdapter(List<RowData> list){
        this.list = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View inflate  = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        RecyclerViewHolder vh = new RecyclerViewHolder(inflate);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder,int position){
        holder.titleview.setText((list.get(position).getTitle()));
        holder.artistview.setText(list.get(position).getArtist());
        holder.albumview.setText((list.get(position).getAlbum()));
        holder.linearLayout.setId(holder.getAdapterPosition());
        holder.linearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listener.onClick(view);
            }
        });

    }

    public void setOnItemClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public List<RowData> getList() {
        return list;
    }

    @Override
    public int getItemCount(){
        return list.size();
    }
}
