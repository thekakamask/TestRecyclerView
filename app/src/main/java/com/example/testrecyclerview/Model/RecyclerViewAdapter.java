package com.example.testrecyclerview.Model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testrecyclerview.R;


import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Article> mesArticle;

    public RecyclerViewAdapter(List<Article> mesArticle) {
        this.mesArticle = mesArticle;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Glide.with(mContext)
        //.asBitmap()
        //.load(mImage.get(position))
        //.into(holder.image);

        holder.display(mesArticle.get(position));

    }

    @Override
    public int getItemCount() {
        return mesArticle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mTitleTV;
        private TextView mOriginsTV;
        private TextView mAuthorTV;
        private TextView mDateTV;
        private ImageButton mCovertPicTV;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitleTV = itemView.findViewById(R.id.titre);
            mOriginsTV = itemView.findViewById(R.id.source);
            mAuthorTV = itemView.findViewById(R.id.auteur);
            mDateTV = itemView.findViewById(R.id.date);
            mCovertPicTV = itemView.findViewById(R.id.button1);

        }

        void display (Article article) {

            mTitleTV.setText(article.getTitle());
            mOriginsTV.setText(article.getOrigins());
            mAuthorTV.setText(article.getAuthor());
            mDateTV.setText((CharSequence) article.getDate());
            mCovertPicTV.setImageResource(article.getCovertPic());
            mCovertPicTV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });




        }
    }

}