package br.com.wedosoft.layouts;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListVieww extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);

		gerarLista();
	}

	private void gerarLista() {
		String[] GENRES = {
				"Ação",
				"Aventura",
				"Animação",
				"Infantil",
				"Comédia",
				"Documentário",
				"Drama",
				"História",
				"Romance"
		};

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GENRES);
		setListAdapter(adapter);
	}
}
