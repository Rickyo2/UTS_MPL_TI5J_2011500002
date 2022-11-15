package ac.id.atmaluhur.mahasiswa_2011500002.ui.slideshow

import ac.id.atmaluhur.mahasiswa_2011500002.LoginActivity
import ac.id.atmaluhur.mahasiswa_2011500002.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Keluar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_slideshow)

        val btnLogout =  findViewById<Button>(R.id.btnLogout)
        val slide = findViewById<TextView>(R.id.nav_slideshow)


        btnLogout.setOnClickListener {
            startActivity(Intent(this@Keluar, LoginActivity::class.java))
            finish()
        }
    }
}