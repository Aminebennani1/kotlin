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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
val image = painterResource(R.drawable .delicieuses_pommes_rouges_isolees_blanc)
    val image2 = painterResource(R.drawable.pikaso_edit__3_)
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
            painter = image,
            modifier= Modifier.width(550.dp).height(200.dp),
            contentDescription = null,

            )
        Text(
            text = "Big Apple $name!",
            modifier = modifier.padding(15.dp),
            fontSize = 32.sp

        )
        Text(
            text = "Midelt est une ville située au centre du Maroc, dans la région de Drâa-Tafilalet, au pied du Moyen Atlas. Cette ville est connue pour plusieurs aspects, et l'un des produits phares de la région est la pomme de Midelt. ",
            modifier = modifier.padding(15.dp),

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