package tads.eaj.ufrn.tobis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextLogin: EditText = findViewById(R.id.editTextLogin)
        var editTextPassword: EditText = findViewById(R.id.editTextPassword)

        var buttonOK: Button = findViewById(R.id.buttonOK)

        Toast.makeText(this, "Ola mundo", Toast.LENGTH_LONG).show()

        buttonOK.setOnClickListener {
            (it as Button).text = "mudei o texto do botao"
            Log.i("aula", editTextLogin.text.toString())
            Log.i("aula", editTextPassword.text.toString())
            Log.i("aula", editTextLogin!!.text.toString())// '!!' nao permite valor nulo
            Log.i(
                "aula",
                editTextLogin?.text.toString()
            ) // '?' aceita valor nulo mas nao invoca os metodos

            val stringLogin = editTextLogin?.text.toString()
            val stringPassword = editTextPassword?.text.toString()

            if (stringLogin.equals("tobias") && stringPassword.equals("1234")) {
                Log.i("Aula", "Login feito com sucesso")
                Toast.makeText(this, "Login feito com sucesso", Toast.LENGTH_SHORT).show()
            } else {
                Log.i("Aula", "Login incorreto")
                Toast.makeText(this, "Login incorreto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}