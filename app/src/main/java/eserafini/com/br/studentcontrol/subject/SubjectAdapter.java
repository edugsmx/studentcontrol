package eserafini.com.br.studentcontrol.subject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import eserafini.com.br.studentcontrol.R;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.HomeViewHolder> {

    private Context context;
    private int images[];
    private HomeViewHolder homeViewHolder;

    public SubjectAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_content_main, null);

        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HomeViewHolder homeViewHolder, int i) {
        homeViewHolder.image.setBackgroundResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    class HomeViewHolder extends RecyclerView.ViewHolder {

        ImageView image;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.content_imageView);
        }
    }
}
