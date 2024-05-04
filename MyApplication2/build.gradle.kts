// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org")

    <Button
    android:id = "@+id/logoutButton"
    android:layout_width = "wrap_content"
    android:layout_height = "wrap_content"
    android:text = "Logout"
    android:layout_gravity = "center"/>
    import android . content . Intent
            import androidx . appcompat . app . AppCompatActivity
            import android . os . Bundle
            import kotlinx . android . synthetic . main . activity_main . *

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Logout Button'ı tanımla
            val logoutButton = findViewById<Button>(R.id.logoutButton)

            // Çıkış yap düğmesine tıklama işlevi ekle
            logoutButton.setOnClickListener {
                // Oturumu kapatmak için gerekli işlemleri yap
                // Örneğin, oturum bilgilerini temizle
                clearSession()

                // Giriş ekranına yönlendir
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

                // Şu anki aktiviteyi kapat
                finish()
            }
        }

        private fun clearSession() {
            // Oturum bilgilerini temizleme işlemleri buraya gelebilir
        }
    }

}