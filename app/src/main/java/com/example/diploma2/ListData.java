package com.example.diploma2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListData {
    public static HashMap<String, List<String>> loadData() {
        HashMap<String, List<String>> expDetails = new HashMap<>();

        List<String> one = new ArrayList<>();
        one.add("Виктор Блуд - Силач, основатель движения  «Силачи Старой Школы».\n МСМК по армлифтингу, обладатель мирового рекорда в категории до 90 кг. Действующий спортсмен и тренер в клубе Нева Кроссфит  \n YouTube: https://www.youtube.com/user/Blud1488 \n Instagram: https://www.instagram.com/victorblud/");

        List<String> two = new ArrayList<>();
        two.add("Друзья, меня зовут Сухарев Андрей я основатель и создатель кроссфита в восточной Сибири и создатель зала CrossFit Atlant - ПЕРВЫЙ сертифицированный (аффилированный с CrossFit Inc, (USA)) зал в ИРКУТСКЕ. Моя цель продвижения моей новой системы тренировок Функциональный Бодибилдинг (подраздел кроссфита), и я хочу двигаться вместе с вами, выкладываю обучающие и мотивационные видео по этому поводу ВМЕСТЕ - МЫ СИЛА. Так же я являюсь ВИКИНГОМ ВСЕЯ РУСИ и многие меня могут узнать про прозвищу ЖИВОТНОЕ ИЗ ИРКУТСКА с канала Алексея Мокшина СПОРТ ФАЗА  \n Инстаграм https://www.instagram.com/suharev_andrey \n YouTube https://www.youtube.com/channel/UC7ZAl5tMtgV50nU2lu0iE_g/about");


        List<String> three = new ArrayList<>();
        three.add("Кирилл Игоревич Сарычев - русский пауэрлифтер. Ранее он занимал мировой рекорд в жиме лежа с грузоподъемностью 335 кг. В 2016 году он установил мировой рекорд по пауэрлифтингу в 3 лифта в общей сложности 1 082,5 кг. \n YouTube: https://www.youtube.com/c/KIRILLSARYCHEV/featured \n Instagram: https://www.instagram.com/sarychevkirill/");



        expDetails.put("Виктор Блуд", one);
        expDetails.put("Сухарев Андрей", two);
        expDetails.put("Сарычев Кирил", three);


        return expDetails;
    }
}
