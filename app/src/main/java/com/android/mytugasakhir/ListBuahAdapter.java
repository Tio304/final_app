package com.android.mytugasakhir;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBuahAdapter extends RecyclerView.Adapter<ListBuahAdapter.ListViewHolder> {

    private final ArrayList<BuahSayur> listBusa;
    private OnItemClickCallback onItemClickCallback;

    public ListBuahAdapter(ArrayList<BuahSayur> list) {
        this.listBusa = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.hargabuah, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        BuahSayur buahSayur = listBusa.get(position);
        Glide.with(holder.itemView.getContext()).load(buahSayur.getPhotobusa()).apply(new RequestOptions().override(55, 55)).into(holder.imgPhoto);

        holder.tvNamebusa.setText(buahSayur.getNamebusa());
        holder.tvHargabusa.setText(buahSayur.getHargabusa());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listBusa.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBusa.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(BuahSayur data);


    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNamebusa, tvHargabusa;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvNamebusa = itemView.findViewById(R.id.tv_namabuah);
            tvHargabusa = itemView.findViewById(R.id.tv_hargabuah);
        }
    }
}