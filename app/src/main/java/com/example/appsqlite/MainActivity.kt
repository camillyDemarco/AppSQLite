package com.example.appsqlite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appsqlite.ui.theme.AppSQliteTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}
@Composable
fun App(){
    AppSQliteTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                SimpleTextFieldSample("Nome:")
                Divider(
                    Modifier.height(20.dp),
                    //modifier = Modifier.background(Color.Transparent)
                )
                SimpleTextFieldSample("Endereço:")
                Divider(
                    Modifier.height(20.dp)
                )
                SimpleTextFieldSample("Bairro:")
                Divider(
                    Modifier.height(20.dp)
                )
                SimpleTextFieldSample("Cep:")
                Divider(
                    Modifier.height(20.dp)
                )
                ButtonSample()
            }
        }
    }
}
@Preview(widthDp = 300, heightDp = 500)
@Composable
fun AppPreview(){
    App()
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextFieldSample(campo: String) {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(campo) },
        singleLine = true
    )
}
@Preview
@Composable
fun SimpleTextFieldSamplePreview(){
    SimpleTextFieldSample("Nome:")
    //SimpleTextFieldSample("Endereço:")
}
@Composable
fun ButtonSample() {
    Button(onClick = { /* Do something! */ }) { Text("Cadastrar") }
}
@Preview
@Composable
fun ButtonSamplePreview(){
    ButtonSample()
}