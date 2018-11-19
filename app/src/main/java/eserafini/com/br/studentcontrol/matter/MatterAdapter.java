package eserafini.com.br.studentcontrol.matter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import eserafini.com.br.studentcontrol.R;

public class MatterAdapter extends RecyclerView.Adapter<MatterAdapter.MatterViewHolder> {

    private Context context;
    private int images[];
    private String title[];
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }


    public MatterAdapter(Context context, int[] images, String title[]) {
        this.context = context;
        this.images = images;
        this.title = title;
    }

    @NonNull
    @Override
    public MatterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_content_main, null);

        return new MatterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatterViewHolder MatterViewHolder, int position) {
        MatterViewHolder.image.setImageResource(images[position]);
        MatterViewHolder.title.setText(title[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class MatterViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;

        public MatterViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.content_imageView);
            title = itemView.findViewById(R.id.item_content_title);

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
