package br.senai.sp.jandira.navigation.root

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleIn
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navigation.root.login.Login
import br.senai.sp.jandira.navigation.root.menu.Menu
import br.senai.sp.jandira.navigation.root.pedidos.Pedidos
import br.senai.sp.jandira.navigation.root.perfil.Perfil
import br.senai.sp.jandira.navigation.ui.theme.NavigationTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        exitTransition = {
                                         slideOutOfContainer(
                                             AnimatedContentScope.SlideDirection.End,
                                             tween(900)
                                         )
                        },
                        enterTransition = {
                                          scaleIn(tween(1600))
                        },
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

