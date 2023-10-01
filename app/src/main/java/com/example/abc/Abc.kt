package com.example.abc

val abcImage = listOf<Item>(
    Item("Акула", R.drawable.l1, R.drawable.l1low, R.raw.vl1),
    Item("Баран", R.drawable.l2, R.drawable.l2low,  R.raw.vl2),
    Item("Ворона", R.drawable.l3, R.drawable.l3low,  R.raw.vl3),
    Item("Гусь", R.drawable.l4, R.drawable.l4low,  R.raw.vl4),
    Item("Дельфин", R.drawable.l5, R.drawable.l5low,  R.raw.vl5),
    Item("Енот", R.drawable.l6, R.drawable.l6low,  R.raw.vl6),
    Item("Ёж", R.drawable.l7, R.drawable.l7low,  R.raw.vl7),
    Item("Жираф", R.drawable.l8, R.drawable.l8low,  R.raw.vl8),
    Item("Заяц", R.drawable.l9, R.drawable.l9low,  R.raw.vl9),
    Item("Индюк", R.drawable.l10, R.drawable.l10low,  R.raw.vl10),
    Item("Попугай", R.drawable.l11, R.drawable.l11low,  R.raw.vl11),
    Item("Кот", R.drawable.l12, R.drawable.l12low,  R.raw.vl12),
    Item("Лиса", R.drawable.l13, R.drawable.l13low,  R.raw.vl13),
    Item("Медведь", R.drawable.l14, R.drawable.l14low,  R.raw.vl14),
    Item("Носорог", R.drawable.l15, R.drawable.l15low,  R.raw.vl15),
    Item("Осёл", R.drawable.l16, R.drawable.l16low,  R.raw.vl16),
    Item("Петух", R.drawable.l17, R.drawable.l17low,  R.raw.vl17),
    Item("Рыба", R.drawable.l18, R.drawable.l18low,  R.raw.vl18),
    Item("Свинья", R.drawable.l19, R.drawable.l19low,  R.raw.vl19),
    Item("Тигр", R.drawable.l20, R.drawable.l20low,  R.raw.vl20),
    Item("Утка", R.drawable.l21, R.drawable.l21low,  R.raw.vl21),
    Item("Фламинго", R.drawable.l22, R.drawable.l22low,  R.raw.vl22),
    Item("Хамелеон", R.drawable.l23, R.drawable.l23low,  R.raw.vl23),
    Item("Цыплёнок", R.drawable.l24, R.drawable.l24low,  R.raw.vl24),
    Item("Черепаха", R.drawable.l25, R.drawable.l25low,  R.raw.vl25),
    Item("Шимпанзе", R.drawable.l26, R.drawable.l26low,  R.raw.vl26),
    Item("Щенок", R.drawable.l27, R.drawable.l27low,  R.raw.vl27),
    Item("Объявление", R.drawable.l28, R.drawable.l28low,  R.raw.vl28),
    Item("Мышь", R.drawable.l29, R.drawable.l29low,  R.raw.vl29),
    Item("Олень", R.drawable.l30, R.drawable.l30low,  R.raw.vl30),
    Item("Эму", R.drawable.l31, R.drawable.l31low,  R.raw.vl31),
    Item("Юрок", R.drawable.l32, R.drawable.l32low,  R.raw.vl32),
    Item("Як", R.drawable.l33, R.drawable.l33low,  R.raw.vl33)
)

fun nextItem(item: Item): Item{
    return if (abcImage.indexOf(item) == 32){
        abcImage[0]
    }
    else {
        abcImage[abcImage.indexOf(item) + 1]
    }
}

fun prevItem(item: Item): Item{
    return if (abcImage.indexOf(item) == 0){
        abcImage[32]
    }
    else {
        abcImage[abcImage.indexOf(item) - 1]
    }
}
