package com.example.cartedevisite

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Logo(
                            imagePainter = painterResource(id = R.drawable.android_logo),
                            fullName = stringResource(id = R.string.full_name),
                            titre = stringResource(id = R.string.titre),
                            modifier = Modifier.align(alignment = Alignment.Center)
                        )
                        Coordonnes(
                            numero = "+ 11 (123) 444 555 666",
                            mailpro = "@AndroidDev",
                            mailperso = "jen.doe@android.com",
                            modifier = Modifier.align(alignment = Alignment.BottomCenter)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Logo(imagePainter : Painter, fullName : String, titre : String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier
                .height(90.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = fullName,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            //color = Color(0xFF3ddc84),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = titre,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun Coordonnes(numero: String, mailpro : String, mailperso : String ,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Row (
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        ){
            Icon(
                imageVector = Default.Phone,
                contentDescription = "Description localisée du téléphone"
            )
            Text(
                text = numero,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }

        Row(modifier = Modifier
            .padding(10.dp)
        ) {
            Icon(
                imageVector = Default.Email,
                contentDescription = "Description localisée du téléphone"
            )
            Text(
                text = mailpro,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }
        Row (modifier = Modifier
            .align(alignment = Alignment.CenterHorizontally)
        ){
            Icon(
                imageVector = Default.Share,
                contentDescription = "Description localisée du téléphone"
            )

            Text(
                text = mailperso,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteDeVisiteTheme {
        Logo(imagePainter = painterResource(id = R.drawable.android_logo),
            fullName = stringResource( id = R.string.full_name),
            titre = stringResource(id = R.string.titre))
        Coordonnes(numero = "+ 11 (123) 444 555 666", mailpro = "@AndroidDev", mailperso = "jen.doe@android.com")
    }
}