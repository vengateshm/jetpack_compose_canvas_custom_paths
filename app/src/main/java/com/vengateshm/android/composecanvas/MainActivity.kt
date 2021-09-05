package com.vengateshm.android.composecanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import com.vengateshm.android.composecanvas.ui.theme.ComposeCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White) {
                    RightWaveBackground()
                }
            }
        }.
    }
}

@Composable
fun ArcBackground() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
    ) {
        val width = size.width
        val height = size.height
        val path = Path()
        with(path) {
            moveTo(0f, height * 0.35f)
            quadraticBezierTo(width / 2f, height / 2f, width, height * 0.35f)
            lineTo(width, 0f)
            lineTo(0f, 0f)
            close()
        }
        drawPath(path, color = Color(0xFFFF9800))
    }
}

@Composable
fun LeftWaveBackground() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
    ) {
        val width = size.width
        val height = size.height
        val path = Path()
        with(path) {
            moveTo(0f, height * 0.9167f)
            quadraticBezierTo(width * 0.25f, height * 0.875f,
                width * 0.5f, height * 0.9167f)
            quadraticBezierTo(width * 0.75f, height * 0.9584f,
                width * 1.0f, height * 0.9167f)
            lineTo(width, height)
            lineTo(0f, height)
            close()
        }
        drawPath(path, color = Color(0xFFFF9800))
    }
}

@Preview
@Composable
fun RightWaveBackground() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
    ) {
        val width = size.width
        val height = size.height
        val path = Path()
        with(path) {
            moveTo(0f, height * 0.9167f)
            quadraticBezierTo(width * 0.25f, height * 0.9584f, width * 0.5f, height * 0.9167f)
            quadraticBezierTo(width * 0.75f, height * 0.875f, width, height * 0.9167f)
            lineTo(width,height)
            lineTo(0f,height)
            close()
        }
        drawPath(path, brush = Brush.linearGradient(listOf(Color(0XFFFD76EF5),Color(0XFFF8F7AFE))))
    }
}