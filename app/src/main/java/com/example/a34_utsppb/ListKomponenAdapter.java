package com.example.a34_utsppb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a34_utsppb.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListKomponenAdapter extends RecyclerView.Adapter<ListKomponenAdapter.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    private ArrayList<Komponen> listKomponen;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListKomponenAdapter(ArrayList<Komponen> list) {
        this.listKomponen = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item_row_komponen, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKomponen.get(holder.getAdapterPosition()));
            }
        });
        Komponen komponen = listKomponen.get(position);
        holder.komponenName.setText(komponen.getNama());
        holder.komponenDetail.setText(komponen.getDetail());
    }

    public interface OnItemClickCallback {
        void onItemClicked(Komponen data);
    }

    @Override
    public int getItemCount() {
        return listKomponen.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView komponenName, komponenDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            komponenName = itemView.findViewById(R.id.nama);
            komponenDetail = itemView.findViewById(R.id.detail);
        }
    }
}
