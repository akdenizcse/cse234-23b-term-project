package com.sevval.myapplication.ui.theme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Logout Button'ı tanımla
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        // Çıkış yap düğmesine tıklama işlevi ekle
        logoutButton.setOnClickListener {
            clearSession()

            // Giriş ekranına yönlendir
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Şu anki aktiviteyi kapat
            finish()
        }
    }

    private fun startActivity(intent: Any) {

    }

    private fun Intent(mainActivity: MainActivity, java: Any): Any {

        return TODO("Provide the return value")
    }

    private fun clearSession() {
        // Oturum bilgilerini temizleme işlemleri buraya gelebilir
    }
}





