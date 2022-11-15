package ac.id.atmaluhur.mahasiswa_2011500002.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import ac.id.atmaluhur.mahasiswa_2011500002.R;

public class PerhitunganActivity extends AppCompatActivity {

    private EditText etPanjang, etLebar;
    private Button btnhitung;
    private TextView tvhasil;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        btnhitung = findViewById(R.id.btnhitung);
        tvhasil = findViewById(R.id.tvhasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String panjang = etPanjang.getText().toString();
                String lebar = etLebar.getText().toString();

                hitungLuas(
                        Integer.parseInt(panjang), Integer.parseInt(lebar)
                );
            }
        });
    }

    private void hitungLuas(int panjang, int lebar) {

        int hasil = panjang * lebar;
        tvhasil.setText(String.valueOf(hasil));
    }
}