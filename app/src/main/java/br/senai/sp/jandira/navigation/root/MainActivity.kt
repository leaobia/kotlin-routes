package br.senai.sp.jandira.navigation.root

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.root.login.Login
import br.senai.sp.jandira.navigation.root.menu.Menu
import br.senai.sp.jandira.navigation.root.pedidos.Pedidos
import br.senai.sp.jandira.navigation.root.perfil.Perfil
import br.senai.sp.jandira.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"){
                        composable(route = "login"){ Login(navController)}
                        composable(route = "menu"){ Menu(navController) }
                        composable(route = "perfil"){ Perfil(navController)}
                        composable(route = "pedido"){ Pedidos(navController)}
                    }
                }
            }
        }
    }

