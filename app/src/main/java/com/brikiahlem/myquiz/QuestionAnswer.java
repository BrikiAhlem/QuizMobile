package com.brikiahlem.myquiz;

public class QuestionAnswer {

    public static String question[] ={
            "Qu'est-ce que représente ADB en termes d'Android ?",
            " Quel est le nom du langage de programmation principalement utilisé pour le développement d'applications Android ?",
            "Qu'est-ce que représente XML dans le développement Android ?",
            "Quel composant d'Android permet de gérer les différentes versions de l'API Android utilisées par les applications ?"
    };

    public static String choices[][] = {
            {"  Android Debug Bridge "," Application Development Block","Android Developer Backend ","App Debugging Board "},
            {"Java","Swift","  C++","Python "},
            {"External Markup Language"," Extensible Markup Language"," Execute Markup Language","Extended Markup Layout"},
            {" SDK Manager","Android Studio","Gradle"," API Manager"}
    };

    public static String correctAnswers[] = {
            "Android Debug Bridge",
            "Java",
            "Extensible Markup Language",
            "Gradle"
    };

}