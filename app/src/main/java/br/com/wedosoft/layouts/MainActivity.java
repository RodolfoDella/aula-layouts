package br.com.wedosoft.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Aula";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        ouvinte();
		gerarLogs();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.m_WebView:
			Intent it = new Intent(MainActivity.this, WebVieww.class);
			startActivity(it);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void ouvinte() {
		frameLayout();
		linearLayout();
		relativeLayout();
		listView();
		gridView();
	}

	private void gridView() {
		Button grid = (Button) findViewById(R.id.bt_gridView);
		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, GridVieww.class);
				startActivity(it);
			}
		});
	}

	private void listView() {
		Button list = (Button) findViewById(R.id.bt_listView);
		list.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, ListVieww.class);
				startActivity(it);
			}
		});
	}

	private void relativeLayout() {
		Button relative = (Button) findViewById(R.id.bt_relativeLayout);
		relative.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, RelativeLayout.class);
				startActivity(it);
			}
		});
	}

	private void linearLayout() {
		Button linear = (Button) findViewById(R.id.bt_linearLayout);
		linear.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, LinearLayout.class);
				startActivity(it);
			}
		});
	}

	private void frameLayout() {
		Button frame = (Button) findViewById(R.id.bt_frameLayout);
		frame.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(MainActivity.this, FrameLayout.class);
				startActivity(it);
			}
		});
	}

	private void gerarLogs() {
		Log.v(TAG, "Log de Verbose");
		Log.d(TAG, "Log de Debug");
		Log.i(TAG, "Log de Info");
		Log.w(TAG, "Log de Warn");
		Log.e(TAG, "Log de Error");
	}

}