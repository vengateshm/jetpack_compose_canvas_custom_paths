package com.vengateshm.android.composecanvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vengateshm.android.composecanvas.ui.theme.ComposeCanvasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White) {
                    Box(modifier = Modifier
                        .width(300.dp)
                        .height(300.dp)
                        .border(2.dp, color = Color(0XFFFF9800))) {
                        DockerIconPath()
                    }
                }
            }
        }
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
            lineTo(width, height)
            lineTo(0f, height)
            close()
        }
        drawPath(path, brush = Brush.linearGradient(listOf(Color(0XFFFD76EF5), Color(0XFFF8F7AFE))))
    }
}

@Composable
fun DockerIconPath() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height

        // Whale body
        with(Path()) {
            moveTo(width * 0.1666667f, height * 0.5000000f)
            lineTo(width * 0.5666667f, height * 0.5000000f)
            lineTo(width * 0.6000000f, height * 0.4666667f)
            quadraticBezierTo(width * 0.5711000f,
                height * 0.4035667f,
                width * 0.6000000f,
                height * 0.3666667f)
            quadraticBezierTo(width * 0.6318667f,
                height * 0.3756333f,
                width * 0.6333333f,
                height * 0.4333333f)
            quadraticBezierTo(width * 0.6819333f,
                height * 0.3982000f,
                width * 0.7000000f,
                height * 0.4333333f)
            quadraticBezierTo(width * 0.6972333f,
                height * 0.4894667f,
                width * 0.6000000f,
                height * 0.5000000f)
            quadraticBezierTo(width * 0.4956000f,
                height * 0.6462667f,
                width * 0.3666667f,
                height * 0.6666667f)
            quadraticBezierTo(width * 0.1872333f,
                height * 0.6724333f,
                width * 0.1666667f,
                height * 0.5000000f)
            close()

//            drawPath(this, Color(0XFF05C3DD))
            drawPath(this, brush = Brush.linearGradient(
                colors = listOf(Color(0xFF73A1F9), Color(0xFF6DC8F3)),
                start = Offset((size.width * 0.17).toFloat(), (size.height * 0.52).toFloat()),
                end = Offset((size.width * 0.70).toFloat(), (size.height * 0.52).toFloat())
            ))
        }

        // Whale Eye
        with(Path()) {
            moveTo((size.width * 0.2349080).toFloat(), (size.height * 0.5311411).toFloat())
            cubicTo((size.width * 0.2425667).toFloat(),
                (size.height * 0.5312000).toFloat(),
                (size.width * 0.2535667).toFloat(),
                (size.height * 0.5368000).toFloat(), (size.width * 0.2536356).toFloat(),
                (size.height * 0.5498686).toFloat())
            cubicTo((size.width * 0.2535667).toFloat(),
                (size.height * 0.5575000).toFloat(),
                (size.width * 0.2479667).toFloat(),
                (size.height * 0.5684000).toFloat(), (size.width * 0.2349080).toFloat(),
                (size.height * 0.5685962).toFloat())
            cubicTo((size.width * 0.2273000).toFloat(),
                (size.height * 0.5684000).toFloat(),
                (size.width * 0.2162667).toFloat(),
                (size.height * 0.5629333).toFloat(), (size.width * 0.2161805).toFloat(),
                (size.height * 0.5498686).toFloat())
            cubicTo((size.width * 0.2162667).toFloat(),
                (size.height * 0.5422000).toFloat(),
                (size.width * 0.2218667).toFloat(),
                (size.height * 0.5312000).toFloat(), (size.width * 0.2349080).toFloat(),
                (size.height * 0.5311411).toFloat())
            close()

            drawPath(this, Color(0XFFFFFFFF))
        }

        // Containers
        with(Path()) {
            moveTo((size.width * 0.2000000).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.2000000).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.2000000).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.2000000).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.2666667).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.2666667).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.2000000).toFloat(), (size.height * 0.4666667).toFloat())
            close()
            drawPath(this, Color(0XFF05C3DD))
        }
        with(Path()) {
            moveTo((size.width * 0.3000000).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.3000000).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.3000000).toFloat(), (size.height * 0.4666667).toFloat())
            close()
            drawPath(this, Color(0XFF8F7AFE))
        }
        with(Path()) {
            moveTo((size.width * 0.4000000).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.4000000).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.4666667).toFloat(), (size.height * 0.4666667).toFloat())
            lineTo((size.width * 0.4666667).toFloat(), (size.height * 0.4000000).toFloat())
            lineTo((size.width * 0.4000000).toFloat(), (size.height * 0.4000000).toFloat())
            close()
            drawPath(this, Color(0XFF05C3DD))
        }
        with(Path()) {
            moveTo((size.width * 0.2666667).toFloat(), (size.height * 0.3000000).toFloat())
            lineTo((size.width * 0.2666667).toFloat(), (size.height * 0.3666667).toFloat())
            lineTo((size.width * 0.3333333).toFloat(), (size.height * 0.3666667).toFloat())
            lineTo((size.width * 0.3333333).toFloat(), (size.height * 0.3000000).toFloat())
            lineTo((size.width * 0.2666667).toFloat(), (size.height * 0.3000000).toFloat())
            close()
            drawPath(this, Color(0XFF05C3DD))
        }
        with(Path()) {
            moveTo((size.width * 0.3666667).toFloat(), (size.height * 0.3000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.3666667).toFloat())
            lineTo((size.width * 0.4333333).toFloat(), (size.height * 0.3666667).toFloat())
            lineTo((size.width * 0.4333333).toFloat(), (size.height * 0.3000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.3000000).toFloat())
            close()
            drawPath(this, Color(0XFF05C3DD))
        }
        with(Path()) {
            moveTo((size.width * 0.3000000).toFloat(), (size.height * 0.2666667).toFloat())
            lineTo((size.width * 0.3000000).toFloat(), (size.height * 0.2000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.2000000).toFloat())
            lineTo((size.width * 0.3666667).toFloat(), (size.height * 0.2666667).toFloat())
            lineTo((size.width * 0.3000000).toFloat(), (size.height * 0.2666667).toFloat())
            drawPath(this, Color(0XFF8F7AFE))
        }
    }
}