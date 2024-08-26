package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {

            }
        }
    }
}


@Composable
fun Card(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.mine)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(264.dp,325.dp),
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {

            Spacer(Modifier.height(30.dp))
            NameInfo(modifier.align(alignment = Alignment.CenterHorizontally))
            Spacer(Modifier.height(40.dp))
            Contact(modifier.align(alignment = Alignment.CenterHorizontally))
        }
    }
}

@Composable
fun NameInfo(modifier: Modifier){
    Column() {
        Image(
            painter = painterResource(id = R.drawable.img_20240729_002621_344),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(120.dp)
                .background(
                    color = Color.Black
                )
        )
        Text(
            text = "レッド ロール",
            fontSize = 20.sp,
            modifier = modifier
        )
        Text(
            text = "プロビデオウォッチャー",
            modifier = modifier
        )
    }
}

@Composable
fun Contact(modifier: Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Icon(
                Icons.Rounded.Call,
                contentDescription = null
            )
            Text(
                text = "+八一 (三一七) 九五四 八八四二",
                textAlign = TextAlign.Center,
                modifier = modifier
            )
        }
        Row {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null
            )
            Text(
                text = "@あなたの好きな人",
                textAlign = TextAlign.Center,
                modifier = modifier
            )
        }
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null
            )
            Text(
                text = "hamilbra002@warren.k12.in.us",
                textAlign = TextAlign.Center,
                modifier = modifier
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Card()
    }
}

