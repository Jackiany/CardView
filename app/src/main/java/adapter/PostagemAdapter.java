package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;


//Dentro dessa classe criei outra classe interna para o ViewHolder
public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return  new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textNome.setText(("JACKIANY SILVA"));
        holder.textPostagem.setText("#tbt Viagem legal!");
        holder.imagePostagem.setImageResource( R.drawable.imagem2);

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        private TextView textNome;
        private  TextView textPostagem;
        private ImageView imagePostagem;


        public MyViewHolder( View itemView){
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
        public MyViewHolder(@NonNull View itemView, TextView nome, TextView postagem, ImageView imagem) {
            super(itemView);
            this.textNome = nome;
            this.textPostagem = postagem;
            this.imagePostagem = imagem;
        }
    }
}
