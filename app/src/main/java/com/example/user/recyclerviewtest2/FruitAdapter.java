package com.example.user.recyclerviewtest2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter <FruitAdapter.ViewHolder>{
    private List<Fruit> mFruitList;
    static class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        TextView fruitTime;
        TextView fruitIntroduce;
        //RecyclerView子项的最外层布局，通过其可获得ImageView与TextView
        public ViewHolder(View view) {
            super(view);
            fruitImage = view.findViewById(R.id.fruit_image);
            fruitName = view.findViewById(R.id.fruit_name);
            fruitIntroduce=view.findViewById(R.id.fruit_introduce);
            fruitTime=view.findViewById(R.id.fruit_time);
        }
    }
    //用于获取展示的数据源
    public FruitAdapter(List<Fruit> fruitList) {
        mFruitList = fruitList;
    }

    //用于创建ViewHolder实例
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    //用于对RecyclerView子项进行赋值，当前子项滚动到屏幕时，会通过position得到当前子项的Fruit实例，然后设置到ImageView与TextView中。
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
        holder.fruitIntroduce.setText(fruit.getIntroduce());
        holder.fruitTime.setText(fruit.getTime());
    }
    //告诉RecyclerView一共有多少子项
    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
