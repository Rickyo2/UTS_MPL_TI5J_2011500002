package ac.id.atmaluhur.mahasiswa_2011500002.ui.gallery

import ac.id.atmaluhur.mahasiswa_2011500002.R
import ac.id.atmaluhur.mahasiswa_2011500002.TampilFragment
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_gallery)

        val etNama =findViewById<EditText>(R.id.etNama)
        val etNim= findViewById<EditText>(R.id.etNim)
        val rdMi = findViewById<RadioButton>(R.id.rdMi)
        val rdSi = findViewById<RadioButton>(R.id.rdSi)
        val rdTi = findViewById<RadioButton>(R.id.rdTi)
        val cbMakan = findViewById<CheckBox>(R.id.cbMakan)
        val cbTidur = findViewById<CheckBox>(R.id.cbTidur)
        val cbBelajar = findViewById<CheckBox>(R.id.cbBelajar)
        val btnTampil= findViewById<Button>(R.id.btnTampil)

        btnTampil.setOnClickListener {
            val nama = "${etNama.text}"
            val nim = "${etNim.text}"

            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val fragment = TampilFragment()
            val b = Bundle()
            b.putString("Nama",nim)
            b.putString("Nim",nama)
            fragment.arguments = b
            ft.replace(R.id.fragTampil,fragment).commit()
        }
    }
}