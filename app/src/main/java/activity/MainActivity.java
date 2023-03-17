package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;

import java.util.ArrayList;
import java.util.List;

import adapter.PostagemAdapter;
import model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Jackiany Silva", "#tbt Viagem legal!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("João Gabriel", "Que foto linda", R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Pedro Sousa", "#viagen #momentos", R.drawable.imagem4);
        postagens.add(p);

    }
}