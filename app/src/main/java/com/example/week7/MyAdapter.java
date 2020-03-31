package com.example.week7;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.week7.Entities.Coin;

import java.util.ArrayList;
import java.util.List;

/*
Creating an adapter is largely implementing and extending pre-made interfaces and abstract classes/methods,
and then customising said methods to your specific needs. The basic process of building out this file should go something like this
(assuming that you call your Adapter class MyAdapter):

1. add 'extends RecyclerView.Adapter<MyAdapter.MyViewHolder>' to the class declaration, ignore the red line for now
MyViewHolder is the ViewHolder class which implements the row XML file you should have already made

(I called it MyViewHolder here, but it can be called whatever you want!)

2. Made the MyViewHolder class: public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

3. Time to deal with the error lines, click on each line, press option+enter, and implement all constructors/methods
All error lines should now be gone

 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private static final String TAG = "MyAdapter";

    //Declare whatever it is you need to populate each row of your adapter. In this example,
    // I just need the ArrayList that I made in MainActivity, plus the listener to react when I click on the RecyclerView


    RecyclerViewClickListener listener;
    final Coin coin = new Coin();
    List<Coin> coins;

    //Make the constructor as needed (same as with any other class)
    public MyAdapter(List<Coin> coins, RecyclerViewClickListener listener) {
        this.coins = coins;
        this.listener = listener;
    }

    //unlike a regular listener, you also need the int position, hence why it's declared in the interface for RecyclerViewClick Listener
    //You can add other things that the interface needs to be able to do if needed, but don't forget to make it void methods since it is an interface
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    //When the view holder is created (see lifecycle diagram), you need to inflate the row xml file, and return the view + the listener back
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(v, listener);
    }

    //Whatever needs to happen when the view holder is binded to the recycler view.
    // In this case, all that needs to happen is to set the name TextView to a value from the arraylist
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.currency_name.setText(coins.get(position).getName());
        holder.currency_value.setText("$"+ (coins.get(position).getPriceUsd()));
        holder.currency_change.setText(coins.get(position).getPercentChange1h()+ "%");

    }

    //Fairly self-explanatory, replace the 0 (the default) with how big recyclerview should be
    @Override
    public int getItemCount() {
        return coins.size();
    }


    //Creating the ViewHolder class to handle the row xml, notice how it implements the View.OnclickListener
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //Declare the views from the row xml
        TextView currency_name;
        TextView currency_value;
        TextView currency_change;
        RecyclerViewClickListener listener;

        //Constructor
        public MyViewHolder( View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            //set a listener to the view (i.e setting a click listener to every row of the recyclerView)
            itemView.setOnClickListener(this);

            //initialise views
            this.listener = listener;
            this.currency_name = itemView.findViewById(R.id.currency_name);
            this.currency_value = itemView.findViewById(R.id.currency_value);
            this.currency_change = itemView.findViewById(R.id.currency_change);

        }

        //When testing this code, look for when this log message shows up
        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick: inside myadapter on click");
            listener.onClick(v,getAdapterPosition());
        }
    }
}
