package cau01.kiemtratk.student.tdl_cau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MovieAdapter extends BaseAdapter{
    Context context;
    int layoutinflater;
    List<Movie> list;

    public MovieAdapter(Context context, int layoutinflater, List<Movie> list) {
        this.context = context;
        this.layoutinflater = layoutinflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.movie_item,null);

        holder.tvName = view.findViewById(R.id.tvName);
        holder.tvCountry = view.findViewById(R.id.tvCountry);
        holder.tvPrice = view.findViewById(R.id.tvPrice);
        Movie mv = this.list.get(i);
        holder.tvName.setText(mv.getName());
        holder.tvCountry.setText(mv.getCountry());
        holder.tvPrice.setText(mv.getPrice());

        return view;
    }
    static class ViewHolder{
        TextView tvName;
        TextView tvCountry;
        TextView tvPrice;
    }
}
