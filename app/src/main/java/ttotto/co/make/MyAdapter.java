package ttotto.co.make;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final List<Item> ItemList;

    public MyAdapter(List<Item> dataList){

        ItemList = dataList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView TextView_title;
        public TextView TextView_contents;
        public ImageView ImageView_title;

        public MyViewHolder(View v) {
            super(v);
            TextView_title = v.findViewById(R.id.TextView_title);
            TextView_contents = v.findViewById(R.id.TextView_contents);
            ImageView_title = v.findViewById(R.id.ImageView_title);
            //
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_show, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Item item = ItemList.get(position);
        holder.TextView_title.setText(item.getTitle());
        holder.TextView_contents.setText(""+item.getContents());

    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }
}
