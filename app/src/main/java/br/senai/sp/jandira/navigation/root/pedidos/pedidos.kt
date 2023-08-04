package br.senai.sp.jandira.navigation.root.pedidos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Pedidos(navController: NavHostController) {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
                .padding(25.dp)
        ) {
            Text(
                text = "PEDIDOS",
                fontSize = 22.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.size(170.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                Button(onClick = { navController.navigate("menu")}, colors =  ButtonDefaults.buttonColors( Color.White), modifier = Modifier.size(150.dp,50.dp)) {
                    Text(text = "Voltar", color = Color.Blue)
                }
            }

        }
    }

}

