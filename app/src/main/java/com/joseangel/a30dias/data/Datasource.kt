package com.joseangel.a30dias.data

import com.joseangel.a30dias.R
import com.joseangel.a30dias.model.Day

class Datasource() {
    fun loadDays(): List<Day> {
        return listOf<Day>(
            Day(R.string.day1, R.string.day1RecipeName, R.string.day1Recipe, R.drawable.day1),
            Day(R.string.day2, R.string.day2RecipeName, R.string.day2Recipe, R.drawable.day2),
            Day(R.string.day3, R.string.day3RecipeName, R.string.day3Recipe, R.drawable.day3),
            Day(R.string.day4, R.string.day4RecipeName, R.string.day4Recipe, R.drawable.day4),
            Day(R.string.day5, R.string.day5RecipeName, R.string.day5Recipe, R.drawable.day5),
            Day(R.string.day6, R.string.day6RecipeName, R.string.day6Recipe, R.drawable.day6),
            Day(R.string.day7, R.string.day7RecipeName, R.string.day7Recipe, R.drawable.day7),
            Day(R.string.day8, R.string.day8RecipeName, R.string.day8Recipe, R.drawable.day8),
            Day(R.string.day9, R.string.day9RecipeName, R.string.day9Recipe, R.drawable.day9),
            Day(R.string.day10, R.string.day10RecipeName, R.string.day10Recipe, R.drawable.day10),
            Day(R.string.day11, R.string.day11RecipeName, R.string.day11Recipe, R.drawable.day11),
            Day(R.string.day12, R.string.day12RecipeName, R.string.day12Recipe, R.drawable.day12),
            Day(R.string.day13, R.string.day13RecipeName, R.string.day13Recipe, R.drawable.day13),
            Day(R.string.day14, R.string.day14RecipeName, R.string.day14Recipe, R.drawable.day14),
            Day(R.string.day15, R.string.day15RecipeName, R.string.day15Recipe, R.drawable.day15),
            Day(R.string.day16, R.string.day16RecipeName, R.string.day16Recipe, R.drawable.day16),
            Day(R.string.day17, R.string.day17RecipeName, R.string.day17Recipe, R.drawable.day17),
            Day(R.string.day18, R.string.day18RecipeName, R.string.day18Recipe, R.drawable.day18),
            Day(R.string.day19, R.string.day19RecipeName, R.string.day19Recipe, R.drawable.day19),
            Day(R.string.day20, R.string.day20RecipeName, R.string.day20Recipe, R.drawable.day20),
            Day(R.string.day21, R.string.day21RecipeName, R.string.day21Recipe, R.drawable.day21),
            Day(R.string.day22, R.string.day22RecipeName, R.string.day22Recipe, R.drawable.day22),
            Day(R.string.day23, R.string.day23RecipeName, R.string.day23Recipe, R.drawable.day23),
            Day(R.string.day24, R.string.day24RecipeName, R.string.day24Recipe, R.drawable.day24),
            Day(R.string.day25, R.string.day25RecipeName, R.string.day25Recipe, R.drawable.day25),
            Day(R.string.day26, R.string.day26RecipeName, R.string.day26Recipe, R.drawable.day26),
            Day(R.string.day27, R.string.day27RecipeName, R.string.day27Recipe, R.drawable.day27),
            Day(R.string.day28, R.string.day28RecipeName, R.string.day28Recipe, R.drawable.day28),
            Day(R.string.day29, R.string.day29RecipeName, R.string.day29Recipe, R.drawable.day29),
            Day(R.string.day30, R.string.day30RecipeName, R.string.day30Recipe, R.drawable.day30)
        )
    }
}
