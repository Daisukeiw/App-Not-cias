package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppnoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppnoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //tudo que tiver aqui dentro vai rodar no celular
                    AppPreview()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)

    ) {
        Column {


            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Yellow),
                Arrangement.Center
            )
            {
                Text(
                    text = "App Notícias",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 30.sp
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            )
            {

            }
        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )
        {

        }
        Column (
            Modifier
                .fillMaxWidth()
        ){
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Título",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Descrição da notícia",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ) {
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "botão")
                }
            }
        }

    }

}

@Composable
@Preview
fun AppPreview(){
    AppnoticiasTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            //tudo que tiver aqui dentro vai rodar no celular
            App()
        }
    }
}