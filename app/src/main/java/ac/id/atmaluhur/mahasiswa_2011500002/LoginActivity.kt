package ac.id.atmaluhur.mahasiswa_2011500002

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val eName = findViewById<EditText>(R.id.eName)
        val ePass = findViewById<EditText>(R.id.ePass)
        val btnLogin = findViewById<Button>(R.id.btnlogin)

        val sp = getSharedPreferences("login", Context.MODE_PRIVATE)
        if(sp.contains("nama") && sp.getString("nama", "") != null) {
            val i = Intent(this@LoginActivity, MainActivity::class.java)
            i.putExtra("nama", sp.getString("nama", ""))
            startActivity(i)
            finish()
        }

        btnLogin.setOnClickListener {
            val nm = "${eName.text}"
            val pw = "${ePass.text}"
            if(nm.isNotEmpty() && pw.isNotEmpty()) {
                if(pw == "ricky tjhin") {
                    val editor = sp.edit()
                    editor.putString("nama", "${eName.text}")
                    editor.apply()

                    val i = Intent(this@LoginActivity, MainActivity::class.java)
                    i.putExtra("nama", sp.getString("nama", ""))
                    startActivity(i)
                    finish()

                    Toast.makeText(this@LoginActivity, "Login Berhasil", Toast.LENGTH_SHORT).show()
                } else {
                    eName.setText("")
                    ePass.setText("")
                    eName.requestFocus()
                    Toast.makeText(this@LoginActivity, "Password Salah", Toast.LENGTH_SHORT).show()
                }

            } else {
                eName.setText("")
                ePass.setText("")
                eName.requestFocus()
                Toast.makeText(
                    this@LoginActivity,
                    "Username dan Password tidak boleh kosong!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}