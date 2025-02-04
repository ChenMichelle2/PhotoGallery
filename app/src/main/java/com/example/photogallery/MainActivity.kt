package com.example.photogallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.photogallery.ui.theme.PhotoGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                PhotoGalleryScreen()

        }
    }
}

@Composable
fun PhotoGalleryScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Pokemon Photo Gallery",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        //first row of images
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.pikachu),
                    contentDescription = "Image 1",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Pikachu")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.pichu),
                    contentDescription = "Image 2",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Pichu")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.raichu),
                    contentDescription = "Image 3",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Raichu")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.snivy),
                    contentDescription = "Image 4",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Snivy")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.servine),
                    contentDescription = "Image 5",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Servine")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.serperior),
                    contentDescription = "Image 6",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Text(text = "Serperior")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoPreview() {
    PhotoGalleryTheme {
        PhotoGalleryScreen()
    }
}