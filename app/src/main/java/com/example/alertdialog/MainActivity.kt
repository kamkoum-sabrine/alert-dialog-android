package com.example.alertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var nom : EditText
    lateinit var prenom : EditText
    lateinit var email : EditText
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.nom)
        prenom = findViewById(R.id.prenom)
        email = findViewById(R.id.email)
        button = findViewById(R.id.submit)

        button.setOnClickListener{
            if ((nom.text.length == 0) ||(prenom.text.length==0)||(email.text.length==0)){
               val builder  = AlertDialog.Builder(this)
                builder.setTitle("Error !")
                builder.setMessage("Les champs ne doivent pas etre vide")
                builder.setPositiveButton("Ok",{dialogin:DialogInterface,i:Int->})
                builder.show()
            }
        }

    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error !")
        builder.setMessage("Les champs ne doivent pas etre vide")
        builder.setPositiveButton("No",{dialogin:DialogInterface,i:Int->})
        builder.setNegativeButton("Yes", {dialogin:DialogInterface,i:Int->finish()})
        builder.show()
    }
}