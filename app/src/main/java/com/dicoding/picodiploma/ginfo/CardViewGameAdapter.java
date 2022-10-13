package com.dicoding.picodiploma.ginfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewGameAdapter extends RecyclerView.Adapter<CardViewGameAdapter.CardViewHolder> {
    private ArrayList<Bridge> listBridge;

    public CardViewGameAdapter(ArrayList<Bridge> list) {
        this.listBridge = list;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_game, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        final Bridge bridge = listBridge.get(position);

        Glide.with(holder.itemView.getContext())
                .load(bridge.getPoster())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPoster);

        holder.tvName.setText(bridge.getTitle());
        holder.tvCommon.setText(bridge.getGeneral());

        holder.btnSeeMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                switch (v.getId()) {
                    case R.id.btn_see_more:
                        Intent moveIntentWithData = new Intent(context, Details.class);
                        moveIntentWithData.putExtra(Details.EXTRA_TITLE, bridge.getTitle());
                        moveIntentWithData.putExtra(Details.EXTRA_PHOTO, bridge.getPhoto());
                        moveIntentWithData.putExtra(Details.EXTRA_GENERAL, bridge.getGeneral());
                        moveIntentWithData.putExtra(Details.EXTRA_ABOUT_GAME, bridge.getDetail());
                        moveIntentWithData.putExtra(Details.EXTRA_SYSTEM_REQUIREMENTS, bridge.getSystemRequirements());
                        moveIntentWithData.putExtra(Details.EXTRA_COPYRIGHT, bridge.getCopyright());
                        context.startActivity(moveIntentWithData);
                        break;
                }

                Toast.makeText(holder.itemView.getContext(), "Loading " +
                        listBridge.get(holder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Shared " +
                        listBridge.get(holder.getAdapterPosition()).getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBridge.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView tvName, tvCommon;
        Button btnSeeMore, btnShare;

        CardViewHolder(View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvName = itemView.findViewById(R.id.game_name);
            tvCommon = itemView.findViewById(R.id.game_common);
            btnSeeMore = itemView.findViewById(R.id.btn_see_more);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }

}
