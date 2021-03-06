package in.codingninjas.envision.androidnetworking;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView body;
    View itemView;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        title = itemView.findViewById(R.id.titleTextview);
        body = itemView.findViewById(R.id.bodyTextview);
    }
}
