package br.senai.sp.jandira.navigation.root.menu

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
fun Menu(navController: NavHostController) {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(35,51,150,255))
                .padding(25.dp)
        ) {
            Text(
                text = "MENU",
                fontSize = 22.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.size(170.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Button(
                    onClick = { navController.navigate("perfil")},
                    colors = ButtonDefaults.buttonColors(Color.White),
                    modifier = Modifier.size(150.dp, 50.dp)
                ) {
                    Text(text = "Perfil", color = Color.Blue)
                }
            }
            Spacer(modifier = Modifier.size(150.dp))
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(100.dp, 0.dp, 100.dp, 0.dp)){
                    Button(onClick = { navController.navigate("pedido") }, colors =  ButtonDefaults.buttonColors( Color.White), modifier = Modifier.size(150.dp,50.dp)) {
                        Text(text = "Pedidos", color = Color.Blue)
                    }
                    Spacer(modifier = Modifier.size(20.dp))
                    Button(onClick = { navController.navigate("login") }, colors =  ButtonDefaults.buttonColors( Color.White), modifier = Modifier.size(150.dp,50.dp)) {
                        Text(text = "Sair", color = Color.Blue)
                    }
            }

        }
    }

}


