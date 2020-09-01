package com.example.borshon.sd4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //varisbls

    Context mcontext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context context, List<Model> modellist) {
        mcontext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(context);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView miconIv;
    }


    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {

        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row,null);

            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.miconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        holder.mTitleTv.setText(modellist.get(position).getTitle());
        holder.mDescTv.setText(modellist.get(position).getDesc());
        holder.miconIv.setImageResource(modellist.get(position).getIcon());

        //ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(modellist.get(position).getTitle().equals("বাংলা")){
                    Intent intent = new Intent(mcontext,bangla.class);
                    mcontext.startActivity(intent);
                }

                if(modellist.get(position).getTitle().equals("ইংরেজী")){
                    Intent intent = new Intent(mcontext,english.class);
                    mcontext.startActivity(intent);
                }

                if(modellist.get(position).getTitle().equals("সাধারণ জ্ঞান")){
                    Intent intent = new Intent(mcontext,sadharongan.class);
                    mcontext.startActivity(intent);
                }

                if(modellist.get(position).getTitle().equals("পরীক্ষা")){
                    Intent intent = new Intent(mcontext,exam.class);
                    mcontext.startActivity(intent);
                }
            }
        });

        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if(charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for(Model model : arrayList){
                if(model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }


}
