package kotlar;

import java.util.Scanner;

public class Menu {
  Scanner scanner = new Scanner(System.in);
  void list(){
    System.out.println("1. Перевірка слова на паліндромом");
    System.out.println("2. Замінити всі голосні букви на тире");
    System.out.println("3. Порахувати кількість слів у реченні");
    }

    void menu(){
    Scanner scanner = new Scanner(System.in);

    while (true){
      list();

      switch (scanner.nextLine()){
        case "1":{
          System.out.println("Введіть слово з 5 букв");
          String word = scanner.nextLine();
          StringBuffer reverse = new StringBuffer(word);

          if(word.length() < 5 || word.length() > 5){
            System.out.println("ПОМИЛКА! Слово має більше або мене 5 букв");
          }else{
            reverse.reverse();
            String reversedString = reverse.toString();
            if (word.equalsIgnoreCase(reversedString)){
              System.out.println(word + "- є паліндромом");
            }else { System.out.println(word + "- не є паліндромом");}
          }
        }
        case "2":{
          System.out.println("Напишіть речення");
          String sentences = scanner.nextLine();

          if(sentences.isEmpty()){
            System.out.println("Ви нічого не написали");
          }else{
            String replace = sentences.replaceAll("[аоуиіе]", "-");
            System.out.println(replace);
          }
        }
        case "3":{
          System.out.println("Напишіть речення");
          String sentence = scanner.nextLine();

          if(sentence.isEmpty())
          {
            System.out.println("Ви нічого не написали");
          }else {
            String[] words = sentence.split(" ");
            int wordCount = words.length;

            System.out.println("Речення: " + sentence);
            System.out.println("Кількість слів: " + wordCount);
          }
        }
        break;
        default:
          throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
      }

    }

    }

  }


