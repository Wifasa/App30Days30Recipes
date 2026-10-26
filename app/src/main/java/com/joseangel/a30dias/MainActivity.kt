package com.joseangel.a30dias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joseangel.a30dias.data.Datasource
import com.joseangel.a30dias.model.Day
import com.joseangel.a30dias.ui.theme.App30Dias30RecetasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App30Dias30RecetasTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
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
            Text(
                text = stringResource(day.stringDay)
            )
            Text(
                text = stringResource(day.stringDayRecipeName),
                fontSize = 12.sp
            )
            Image(
                painter = painterResource(day.imageResourceId),
                contentDescription = stringResource(day.stringDayRecipeName),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(day.stringDayRecipe),
                modifier = Modifier.padding(12.dp),
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DayListPreview() {
    App30Dias30RecetasTheme {
        DayCard(Day(R.string.day1,R.string.day1RecipeName,R.string.day1Recipe, R.drawable.day1))
    }
}
