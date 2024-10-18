package com.example.myapplicationcartevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationcartevisite.ui.theme.MyApplicationCarteVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationCarteVisiteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "MiDelt",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf( 1) }
    val image2 = painterResource(R.drawable.pikaso_edit__3_)
    val (imageResource,title) = when(result) {
        1 -> Pair( R.drawable.delicieuses_pommes_rouges_isolees_blanc,"big appel mouument")
        2 -> Pair(R.drawable._5dd6ee2ac58a15d30a8a668d37abba0,"Taddart Hotel")
        3 -> Pair(R.drawable.donne_une_image_de_ville_midelt_pour_backgroundimage_la_photo_vertical,"Sahat Al  Alaouine")
        else -> Pair(R.drawable.utah,"la pomme de midelt")
    }
Box {
    Image(
        painter = image2,
        contentDescription = null,
        modifier=Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,

        )
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(top = 135.dp)

    ) {
        Image(
            painter = painterResource(id = imageResource ),
            modifier= Modifier.width(550.dp).height(200.dp),
            contentDescription = null,

            )
        Text(
            text = title,
            color = Color.Black,
            modifier = modifier.padding(15.dp),
            fontSize = 32.sp

        )
        Button(
            onClick = { result = (1..6).random() },
        ) {
            Text(text = stringResource(R.string.roll), fontSize = 24.sp)
        }
        Text(
            text = "Midelt est une ville située au centre du Maroc, dans la région de Drâa-Tafilalet, au pied du Moyen Atlas. Cette ville est connue pour plusieurs aspects, et l'un des produits phares de la région est la pomme de Midelt. ",
            modifier = modifier.padding(15.dp),
            color = Color.Black,

        )

    }
}


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationCarteVisiteTheme {
        Greeting("MiDelt")
    }
}