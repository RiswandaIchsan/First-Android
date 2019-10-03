package xtend.indonesia.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext,"onCreate", Toast.LENGTH_LONG).show()

        buttonHitung.setOnClickListener {
            val alas = editAlas.text
            val tinggi = editTinggi.text

            if (alas.isNullOrBlank()) {
                editAlas.error = "Alas tidak boleh kosong!!!"
                editAlas.requestFocus()
            } else if (tinggi.isNullOrBlank()) {
                editTinggi.error = "Tinggi tidak boleh kosong!!!"
                editTinggi.requestFocus()
            } else {
                hitungLuas(alas.toString().toInt(), tinggi.toString().toInt())
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext,"onStart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext,"onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext,"onPause", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext,"onStop", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext,"onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext,"onDestroy", Toast.LENGTH_LONG).show()
    }

    fun hitungLuas(alas : Int, tinggi : Int){
        val hasil = alas * tinggi
        textHasil.text = hasil.toString()
    }
}
