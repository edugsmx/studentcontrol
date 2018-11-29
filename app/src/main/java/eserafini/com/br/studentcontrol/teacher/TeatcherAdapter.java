package eserafini.com.br.studentcontrol.teacher;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eserafini.com.br.studentcontrol.R;

public class TeatcherAdapter extends RecyclerView.Adapter<TeatcherAdapter.TeatcherViewHolder> {

    private Context context;
    private String teatcherName[];
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }


    public TeatcherAdapter(Context context, String title[]) {
        this.context = context;
        this.teatcherName = title;
    }

    @NonNull
    @Override
    public TeatcherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_teatcher, null);

        return new TeatcherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeatcherViewHolder TeatcherViewHolder, int position) {
        TeatcherViewHolder.teatcherName.setText(teatcherName[position]);
    }

    @Override
    public int getItemCount() {
        return teatcherName.length;
    }

    class TeatcherViewHolder extends RecyclerView.ViewHolder {

        TextView teatcherName;

        public TeatcherViewHolder(@NonNull View itemView) {
            super(itemView);
            teatcherName = itemView.findViewById(R.id.teatcher_name_textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
