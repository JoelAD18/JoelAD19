package com.example.app002

import android.graphics.drawable.Icon
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.List
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier= Modifier
                .fillMaxSize()
                .border(1.dp, color = Color.Black),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start){

                Row(modifier = Modifier
                    .height(90.dp)
                    .background(color = Color.Green)
                    .fillMaxWidth()
                    .border(1.dp, color = Color.Green),
                    verticalAlignment = Alignment.CenterVertically){

                    Column(modifier= Modifier
                        .fillMaxHeight()
                        .padding(start = 10.dp)
                        .width(260.dp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center) {

                        Text(
                            text = "IMSS Digital",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )

                        Text(
                            text = "Bienvenido",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }

                    Column(modifier= Modifier
                        .fillMaxHeight()
                        .width(100.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){

                        Text(
                            text = "Consulta",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Button(
                            onClick = {/*TODO*/ },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.White
                            )
                        ){
                            Text(
                                text = "NSS",
                                color = Color.Black,
                                fontSize = 20.sp
                            )
                        }
                    }
                }

                Row(modifier = Modifier
                    .height(150.dp)
                    .border(1.dp, color = Color.White)
                    .background(color = Color.White)
                    .fillMaxSize()
                    .padding(top = 6.dp)
                    .padding(bottom = 3.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically){

                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imguno),
                            contentDescription = "imguno",
                            modifier = Modifier.size(90.dp)
                        )
                        Text(
                            text = "Módulo Atención Respiratoria (MARSS)",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                    Column(modifier = Modifier
                        .height(110.dp)
                        .width(6.dp)
                        .border(1.dp, color = Color.White)) {

                    }
                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgdos),
                            contentDescription = "imgdos",
                            modifier = Modifier.size(90.dp)
                        )
                        Text(
                            text = "Permiso COVID 4.5",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Row(modifier = Modifier
                    .height(150.dp)
                    .border(1.dp, color = Color.White)
                    .background(color = Color.White)
                    .fillMaxSize()
                    .padding(top = 3.dp)
                    .padding(bottom = 3.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically){

                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgtres),
                            contentDescription = "imgtres",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "Cita medicina familiar",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                    Column(modifier = Modifier
                        .height(110.dp)
                        .width(6.dp)
                        .border(1.dp, color = Color.White)) {

                    }
                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgcuatro),
                            contentDescription = "imgcuatro",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "CHKT en línea",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Row(modifier = Modifier
                    .height(150.dp)
                    .border(1.dp, color = Color.White)
                    .background(color = Color.White)
                    .fillMaxSize()
                    .padding(top = 3.dp)
                    .padding(bottom = 3.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically){

                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        Image(
                            painter = painterResource(id = R.drawable.imgcinco),
                            contentDescription = "imgcinco",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "Vigencia de derechos",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                    Column(modifier = Modifier
                        .height(110.dp)
                        .width(6.dp)
                        .border(1.dp, color = Color.White)) {

                    }
                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgseis),
                            contentDescription = "imgseis",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "Alta o cambio de clínica",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Row(modifier = Modifier
                    .height(150.dp)
                    .border(1.dp, color = Color.White)
                    .background(color = Color.White)
                    .fillMaxSize()
                    .padding(top = 3.dp)
                    .padding(bottom = 3.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically){

                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgsiete),
                            contentDescription = "imgsiete",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "Infórmate de tu familiar",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                    Column(modifier = Modifier
                        .height(110.dp)
                        .width(6.dp)
                        .border(1.dp, color = Color.White)) {

                    }
                    Column(modifier= Modifier
                        .border(1.dp, color = Color.LightGray, shape = AbsoluteCutCornerShape(7.dp))
                        .fillMaxHeight()
                        .height(110.dp)
                        .width(165.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.imgocho),
                            contentDescription = "imgocho",
                            modifier = Modifier.size(90.dp))
                        Text(
                            text = "Licencia 140 Bis",
                            modifier = Modifier,
                            fontSize = 15.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Row(modifier = Modifier
                    .height(90.dp)
                    .border(1.dp, color = Color.White)
                    .background(color = Color.White)
                    .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier=Modifier.width(130.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowLeft,
                            contentDescription = "uno",
                            modifier = Modifier.size(45.dp)
                        )
                    }
                    Column(modifier=Modifier.width(130.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Icon(
                            imageVector = Icons.Outlined.List,
                            contentDescription = "dos",
                            modifier = Modifier.size(45.dp)
                        )
                    }
                    Column(modifier=Modifier.width(130.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Icon(
                            imageVector = Icons.Outlined.ArrowDropDown,
                            contentDescription = "tres",
                            modifier = Modifier.size(45.dp)
                        )
                    }
                }
            }
        }
    }
}