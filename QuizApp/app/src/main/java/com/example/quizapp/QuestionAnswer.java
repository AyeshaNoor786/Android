package com.example.quizapp;

public class QuestionAnswer {

        public static String question[] ={
                "Which one of the following feature of OOP is used to derive a class from another?",
                "Which one is not the programming language?",
                "Which of the following operator always takes no argument if overloaded?",
                "The keyword that is used when the variable can not change state?",
                "In OOP a class is an example of?"
        };

        public static String choices[][] = {
                {"Encapsulation","Polymorphism","Data hiding","Inheritance"},
                {"Java","Kotlin","Notepad","Python"},
                {"++","/","--","+"},
                {"static","friend","private","const"},
                {"Data type","both a & d","User defined type","Abstract type"}
        };

        public static String correctAnswers[] = {
                "Inheritance",
                "Notepad",
                "++",
                "const",
                "user defined type"
        };
}
