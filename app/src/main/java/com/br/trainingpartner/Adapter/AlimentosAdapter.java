package com.br.trainingpartner.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.br.trainingpartner.Model.Alimento;
import com.br.trainingpartner.R;

import java.util.List;

/**
 * Created by LGPC on 08/06/2016.
 */
public class AlimentosAdapter extends RecyclerView.Adapter<AlimentosAdapter.ViewHolder> {

    private List<Alimento> list;
    private LayoutInflater inflater;

    public AlimentosAdapter(Context context, List<Alimento> list){
        this.list = list;
        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_alimento, parent , false);
        ViewHolder holder = new ViewHolder(view);

        return holder;

    }
    @Override
    public void onBindViewHolder(AlimentosAdapter.ViewHolder holder, int position) {
        holder.tvNome.setText(list.get(position).getNome());
        holder.tvGrupo.setText(list.get(position).getGrupoAlimentar());
    }

    @Override
    public int getItemCount() {
        return this.list != null ? this.list.size() : 0;
    }

    public static final class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNome;
        TextView tvGrupo;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNome = (TextView) itemView.findViewById(R.id.tvNome);
            tvGrupo = (TextView) itemView.findViewById(R.id.tvGrupo);
        }
    }
}
