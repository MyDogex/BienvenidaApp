package com.example.bienvenidaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidaapp.ui.theme.BienvenidaAppTheme
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidaAppTheme {
                BienvenidaScreen()
            }
        }
    }
}

@Composable
fun BienvenidaScreen() {
    // Caja contenedora para fondo y contenido
    val context = LocalContext.current
    val welcomeText = context.getString(R.string.welcome) // Obtiene la cadena traducida
    val enterText = context.getString(R.string.enter) // Obtiene la cadena traducida
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Fondo de pantalla
        Image(
            painter = painterResource(id = R.drawable.background), // Nombre de tu imagen de fondo
            contentDescription = null,
            contentScale = ContentScale.Crop, // Ajusta el fondo al tamaño de la pantalla
            modifier = Modifier.fillMaxSize()
        )

        // Contenido encima del fondo
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título "Bienvenido"
            Text(
                text = welcomeText,
                style = TextStyle(
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(20.dp)) // Espacio entre título y botón

            // Botón "Entrar"
            Button(
                onClick = { /* Acción del botón */ },
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp)) // Bordes redondeados
                    .size(width = 200.dp, height = 60.dp)
            ) {
                Text(text = enterText, fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(20.dp)) // Espacio entre botón y imagen del Android

        }
    }
}
