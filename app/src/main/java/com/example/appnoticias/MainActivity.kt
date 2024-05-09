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
                Text(text = "Bastidores: Palmeiras tenta vender Estêvão acima da multa ao Chelsea e não descarta abrir concorrência",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Verdão vê ingleses como favoritos a fechar acordo com o atacante, mas ainda busca ajustar detalhes do contrato que não estão em sintonia entre as duas partes",
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
                    Text(text = "Veja mais")
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
                Text(text = "Pouco visadas: veja seis dicas para a defesa na rodada #6 do Cartola",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Confira dois goleiros, dois zagueiros e dois laterais que estão fora dos mais escalados",
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
                    Text(text = "Veja mais")
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
                Text(text = "Festa da torcida, entrega de Júnior Santos e confusão no VAR: a vitória do Botafogo por um ângulo diferente",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Triunfo do Alvinegro sobre a LDU direto do gramado do Estádio Nilton Santos",
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
                    Text(text = "Veja mais")
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
                Text(text = "Playoffs da NBA 2024: veja tabela, datas, horários e jogos",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Confira as datas e os horários (de Brasília) de todos os confrontos da fase final da NBA",
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
                    Text(text = "Veja mais")
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
                Text(text = "Shai Gilgeous-Alexander decide, e OKC vence Mavericks em jogo 1 da semifinal da Conferência Oeste",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Canadense foi o cestinha da partida e foi peça chave na primeira vitória da equipe na série",
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
                    Text(text = "Veja mais")
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
                Text(text = "NBA: Polícia investiga jogador dos Bucks por atirar bola contra torcedor",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 25.sp
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                Text(text = "Discussão entre Patrick Beverley e fãs do Indiana Pacers é objeto de inquérito. Jogador da NBA reconhece que atitude é \"indesculpável\"",
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
                    Text(text = "Veja mais")
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