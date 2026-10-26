package com.joseangel.a30dias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joseangel.a30dias.ui.theme.App30Dias30RecetasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App30Dias30RecetasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DaysApp()
                }
            }
        }
    }
}


@Composable
fun DaysApp() {
    DayList(
        dayList = Datasource().loadDays(),
    )
}

@Composable
fun DayList(dayList: List<Day>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(dayList) { day ->
            DayCard(
                day = day,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun DayCard(day: Day, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(day.imageResourceId),
                contentDescription = stringResource(day.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(day.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DayListPreview() {
    App30Dias30RecetasTheme {
        DayList()
    }
}
