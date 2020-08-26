package com.example.volley;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{
    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    private Context context;
    private List<Product> products;


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler,parent,false);


        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
Product product = products.get(position);
holder.title.setText(product.getTitle());
holder.desc.setText(product.getDesc());
holder.image.setImageDrawable(context.getResources().getDrawable(product.getImage()));

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        TextView title, desc ;
        ImageView image ;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.textViewTitle);
            desc=(TextView)itemView.findViewById(R.id.textViewShortDesc);
            image=(ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
