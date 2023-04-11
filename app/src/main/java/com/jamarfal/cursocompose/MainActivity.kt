package com.jamarfal.cursocompose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jamarfal.cursocompose.ui.screens.Screen
import com.jamarfal.cursocompose.ui.screens.login.Login
import com.jamarfal.cursocompose.ui.theme.CursoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Punto de entrada
        setContent {
            Login()
        }
    }
}

@Composable
@Preview(widthDp = 200, heightDp = 100)
fun TextButton() {
    Screen {
        Box(
            contentAlignment = Alignment.Center
        ) {
           Text(
               text = "Hello Button",
               modifier = Modifier
                   .clickable { }
                   .border(2.dp, Color.Blue)
                   .background(Color.Cyan)
                   .padding(horizontal = 16.dp, vertical = 8.dp)
                   .border(2.dp, Color.Red)
                   .background(Color.Gray)
                   .padding(8.dp)

           )
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//
//@Composable
//fun SimpleButton(name: String) {
//    val context = LocalContext.current
//    OutlinedButton(
//        onClick = { Toast.makeText(context, "Click!", Toast.LENGTH_LONG).show() }) {
//        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
//        Text(text = name)
//        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
//    }
//}
//
////@Preview(uiMode = UI_MODE_NIGHT_YES)
////@Preview
////@Composable
////fun DefaultPreview() {
////    CursoComposeTheme {
////        Surface {
////            Greeting("Android")
////            SimpleButton(name = "Android")
////        }
////    }
////}
//
//
//@Preview
//@Composable
//fun MyButtonPreview() {
//    CursoComposeTheme {
//        Surface {
//            SimpleButton(name = "Android")
//        }
//    }
//}
//
//@Preview(widthDp = 200, heightDp = 200)
//@Composable
//fun BoxPreview() {
//    Surface {
//        Box(
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
//            TButton("Mi Botón")
//        }
//    }
//}
//
//@Preview(widthDp = 200, heightDp = 200)
//@Composable
//fun ColumnPreview() {
//    Surface {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            TButton("Button1", modifier = Modifier.weight(1f))
//            TButton("Button2", modifier = Modifier.weight(1f))
//            TButton("Button3")
//        }
//    }
//}

@Composable
fun TButton(text: String, modifier: Modifier = Modifier) {
    Button(onClick = { /*TODO*/ }, modifier = modifier) {
        Text(text = text)
    }
}
