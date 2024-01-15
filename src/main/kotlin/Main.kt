fun main(args: Array<String>) {
    homeWork();
}

fun classwork() {
    var sentence = "";
    val sentenceVariant = 0;
    if (sentenceVariant == 0) {
        sentence = "Hello world";
    } else if (sentenceVariant == 1) {
        sentence = "Helloy Kotlin";
    } else {
        sentence = "Hello Android";
    }
    println(sentence);

    when (sentenceVariant) {
        0 -> {
            sentence = "Hello world";
        };
        1 -> {
            sentence = "Helloy Kotlin";
        };
        else -> {
            sentence = "Hello Android";
        }

    }
    println(sentence);

    when {
        sentenceVariant == 0 -> {
            sentence = "Hello world"
        };
        sentenceVariant == 1 -> {
            sentence = "Helloy Kotlin"
        };
        else -> {
            sentence = "Hello Android"
        };
    }
    println(sentence);

    fun showSentence(number: Int): Unit {

        when (number) {

            0 -> {
                println("Text 1");
            };

            1 -> {
                println("Text 2");
            };

            2 -> {
                println("Text 3");
            }

            else -> {
                println("Some text");
            }
        }
    }

    println("Enter number");
    val number = readln();
    try {
        showSentence((number).toInt());
    } catch (ex: NumberFormatException) {
        println("number is not number!");
    }

}

fun classwork_part2() {
    for (i in 1..5) {
        println("Index equals $i");
    }

    val loopIsWorking = true;
    var counter = 0

    while (counter <= 3) {
        println("Some text");
        println("Some text");
        println("Some text");
        counter++;
    }

    var couunter = 0
    do {
        println("Do something $counter");
    } while (couunter > 2)

    repeat(5, {
        println("Вся жрать!");
    })

    fun repeatCode(startNumber: Int, stopNumber: Int): Unit {

        for (i in startNumber..stopNumber) {
            println("Show i: $i ");
        }
    }

    print("Enter start Loop: ");
    val firstNumber = readln();
    print("Enter end Loop: ");
    val secondNumber = readln();
    try {
        repeatCode((firstNumber).toInt(), (secondNumber).toInt());
    } catch (ex: NumberFormatException) {
        println("number is not number!");
    }

}

fun homeWork():Unit{

    fun multiplicationTable(number:Int):Unit{
        for(i in 0..10){
            println("${number} * ${i} = ${number*i}");
        };
    };

    fun guessLanguage(string:String):String{
      if(string == "Kotlin"){
          return  "Yes, you won!"
      }else{
          return "Please try again, maybe you will catch it!"
      };
    };

    print("Enter number: ");
    val number = readln();
    try{
        multiplicationTable(number.toInt());
    }catch (ex:NumberFormatException){
        println("number: \"${number}\" is not number.");
    };
    var flag = true;

    while(flag){
        print("Enter string: ");
        val string = readln();
        val result = guessLanguage(string);
        println(result);
        when(result){
            "Yes, you won!" -> {
                flag = false;
            }
            else -> {
                flag = true;
            };
        };
    };

}

