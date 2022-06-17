package com.example.firstprototype

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is a correct syntax to output \"Hello World\" in Python?",
            "print(\"Hello World\")",
            "p(\"Hello World\")",
            "echo \"Hello World\"",
            "echo(\"Hello World\");",
            1)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Python is a _______ language?",
            "interpreter",
            "machine",
            "compiled",
            "binary",
            1)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which one is NOT a legal variable name?",
            "my-var",
            "_myvar",
            "my_var",
            "Myvar",
            1)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the correct file extension for Python files?",
            ".pyt",
            ".py",
            ".pyth",
            ".pt",
            2)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "How do you create a variable with the numeric value 5?",
            "x = int(5)",
            "x = 5",
            "Both the other answers are correct ",
            "None",
            3)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "How do you create a variable with the floating number 2.8?",
            "x = float(2.8)",
            "x = 2.8",
            "Both the other answers are correct",
            "None",
            3)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What is the correct syntax to output the type of a variable or object in Python?",
            "print(typeof(x))",
            "print(type(x))",
            "print(typeof x)",
            "print(typeOf(x))",
            2)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What is the correct way to create a function in Python?",
            "def myFunction():",
            "function myfunction():",
            "create myFunction():",
            "Alter myFunction():",
            1)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "In Python, 'Hello', is the same as \"Hello\"",
            "True",
            "False",
            "Both the other answers are correct",
            "None",
            2)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What is a correct syntax to return the first character in a string?",
            "x = \"Hello\"[0]",
            "x = \"Hello\".sub(0, 1)",
            "x = sub(\"Hello\", 0, 1)",
            "None",
            1)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForNormal():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which method can be used to remove any whitespace from both the beginning and the end of a string?",
            "len()",
            "strip()",
            "ptrim()",
            "trim()",
            2)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Which method can be used to return a string in upper case letters?",
            "upperCase()",
            "upper()",
            "uppercase()",
            "toUpperCase()",
            2)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which operator is used to multiply numbers?",
            "#",
            "x",
            "%",
            "* ",
            4)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Which method can be used to replace parts of a string?",
            "repl()",
            "replace()",
            "switch()",
            "replaceString()",
            2)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Which operator can be used to compare two values?",
            "=",
            "==",
            "<>",
            "><",
            1)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which of these collections defines a LIST?",
            "(\"apple\", \"banana\", \"cherry\")",
            "{\"name\": \"apple\", \"color\": \"green\"}",
            "{\"apple\", \"banana\", \"cherry\"}",
            "[\"apple\", \"banana\", \"cherry\"]",
            4)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Which of these collections defines a TUPLE?",
            "[\"apple\", \"banana\", \"cherry\"]",
            "(\"apple\", \"banana\", \"cherry\") ",
            "{\"apple\", \"banana\", \"cherry\"}",
            "{\"name\": \"apple\", \"color\": \"green\"}",
            2)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Which of these collections defines a SET?",
            "{\"apple\", \"banana\", \"cherry\"} ",
            "[\"apple\", \"banana\", \"cherry\"]",
            "{\"name\": \"apple\", \"color\": \"green\"}",
            "(\"apple\", \"banana\", \"cherry\")",
            1)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Which of these collections defines a DICTIONARY?",
            "{\"name\": \"apple\", \"color\": \"green\"} ",
            "[\"apple\", \"banana\", \"cherry\"]",
            "{\"apple\", \"banana\", \"cherry\"}",
            "(\"apple\", \"banana\", \"cherry\")",
            1)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Which collection is ordered, changeable, and allows duplicate members?",
            "LIST",
            "SET",
            "DICTIONARY",
            "TUPLE",
            4)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForHard():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which collection does not allow duplicate members?",
            "LIST",
            "SET",
            "TUPLE",
            "NONE",
            2)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "How do you start writing an if statement in Python?",
            "if x > y then:",
            "if (x > y)",
            "if x > y: ",
            "NONE",
            3)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "How do you start writing a for loop in Python?",
            "for each x in y:",
            "for x > y:",
            "for x in y:",
            "NONE",
            3)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "How do you start writing a while loop in Python?",
            "x > y while {",
            "while (x > y)",
            "while x > y {",
            "while x > y:",
            4)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Which statement is used to stop a loop?",
            "stop",
            "exit",
            "return",
            "break ",
            4)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which of the following functions returns the smallest character in the string str?",
            "lower()",
            "lstrip()",
            "upper(str)",
            "min(str)",
            4)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What function is used to open the file for reading in Python?",
            "fopen(file_name, mode)",
            "open(file_name, mode)",
            "openfile(file_name, mode)",
            "open_file(file_name, mode)",
            2)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Suppose list1 is [1, 2, 3], then list1 * 2?",
            "[2, 4, 6]",
            "[1, 2, 3, 1, 2]",
            "[1, 2, 3, 1, 2, 3]",
            "[1, 2, 3, 3, 2, 1]",
            3)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Which of the following statements is true?",
            "You cannot chain multiple decorators in Python.",
            "Decorators don't work with functions that take parameters.",
            "The @ symbol is of no use when using decorators.",
            "Neither of the above is true",
            4)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What is the output of the following code?\n" +
                    "\t1.sum (1,2,3)\n" +
                    "\t2.sum ([1,2,3])",
            "6, 6",
            "6, Error",
            "Error, Error",
            "Error, 6",
            3)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForjava():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is a correct syntax to output \"Hello World\" in Java?",
            "print (\"Hello World\");",
            "echo(\"Hello World\");",
            "System.out.println(\"Hello World\");",
            "Console.WriteLine(\"Hello World\");",
            3)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "Java is short for \"JavaScript\".",
            "True",
            "false",
            "BOTH ",
            "NONE",
            2)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "How do you insert COMMENTS in Java code?",
            "// This is a comment",
            "/* This is a comment",
            "# This is a comment",
            "NONE",
            1)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Which data type is used to create a variable that should store text?",
            "string",
            "Txt",
            "myString",
            "String",
            4)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "How do you create a variable with the numeric value 5?",
            "num x = 5",
            "int x = 5;",
            "x = 5;",
            "float x = 5;",
            2)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "How do you create a variable with the floating number 2.8?",
            "x = 2.8f;",
            "float x = 2.8f;",
            "int x = 2.8f;",
            "byte x = 2.8f",
            2)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Which method can be used to find the length of a string?",
            "length()",
            "getLength()",
            "len()",
            "getSize()",
            1)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Which operator is used to add together two values?",
            "The & sign",
            "The + sign ",
            "The * sign",
            "NONE",
            2)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "The value of a string variable can be surrounded by single quotes.",
            "False",
            "True",
            "BOTH",
            "NONE",
            1)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Which method can be used to return a string in upper case letters?",
            "upperCase()",
            "tuc()",
            "touppercase()",
            "toUpperCase()",
            4)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForSharp():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is a correct syntax to output \"Hello World\" in C#?",
            "print(\"Hello World\")",
            "p(\"Hello World\")",
            "echo \"Hello World\"",
            "Console.WriteLine(\"Hello World\");",
            4)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "C# is an alias of C++",
            "FALSE",
            "TRUE",
            "BOTH",
            "NONE",
            1)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "How do you insert COMMENTS in C# code?",
            "/* This is a comment",
            "# This is a comment",
            "// This is a comment",
            "NONE",
            3)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Which data type is used to create a variable that should store text?",
            "Txt",
            "string",
            "myString",
            "str",
            2)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "How do you create a variable with the numeric value 5?",
            "num x = 5",
            "x = 5;",
            "double x = 5;",
            "int x = 5;",
            4)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "How do you create a variable with the floating number 2.8?",
            "byte x = 2.8",
            "int x = 2.8;",
            "double x = 2.8D;",
            "int x = 2.8D;",
            3)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Which property can be used to find the length of a string?",
            "length",
            "getLength()",
            "length()",
            "Length ",
            4)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Which operator is used to add together two values?",
            "The + sign ",
            "The * sign",
            "The & sign",
            "NONE",
            1)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "The value of a string variable can be surrounded by single quotes.",
            "True",
            "False",
            "Both the other answers are correct",
            "None",
            2)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Type casting is when you assign a value of one data type to another type.",
            "TRUE",
            "FALSE",
            "Both the other answers are correct",
            "None",
            1)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForCss():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What does CSS stand for?",
            "Computer Style Sheets",
            "Colorful Style Sheets",
            "Creative Style Sheets",
            "Cascading Style Sheets",
            4)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the correct HTML for referring to an external style sheet?",
            "<stylesheet>mystyle.css</stylesheet>",
            "<style src=\"mystyle.css\">",
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"mystyle.css\"> ",
            "NONE",
            3)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Where in an HTML document is the correct place to refer to an external style sheet?\n",
            "At the end of the document",
            "In the <body> section",
            "In the <head> section",
            "NONE",
            3)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "Which HTML tag is used to define an internal style sheet?",
            "<style> ",
            "<css>",
            "myString",
            "<script>",
            1)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Which HTML attribute is used to define inline styles?",
            "font",
            "styles",
            "class",
            "style",
            4)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which is the correct CSS syntax?",
            "{body;color:black;}",
            "body {color: black;}",
            "{body:color=black;}",
            "body:color=black;",
            2)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "How do you insert a comment in a CSS file?",
            "// this is a comment",
            "' this is a comment",
            "// this is a comment //",
            "/* this is a comment */ ",
            4)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Which property is used to change the background color?",
            "bgcolor",
            "background-color",
            "color",
            "NONE",
            2)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "How do you add a background color for all <h1> elements?",
            "h1 {background-color:#FFFFFF;}",
            "h1.all {background-color:#FFFFFF;}",
            "all.h1 {background-color:#FFFFFF;}",
            "None",
            1)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "Which CSS property is used to change the text color of an element?",
            "color",
            "fgcolor",
            "text-color",
            "None",
            1)
        questionsList.add(que10)




        return questionsList
    }

    fun getQuestionsForC():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "The C99 standard guarantees the uniqueness of ____ characters for local variable names.",
            "31",
            "63",
            "12",
            "14",
            2)
        questionsList.add(que1)

        val que2 = Question(
            2,
            "The C99 standard guarantees the uniqueness of _____ characters for the names of global variables.",
            "31",
            "6",
            "12",
            "14",
            1)
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which of the following statements is not a valid variable name declaration?\n\n",
            "int __a7;",
            "int __7a;",
            "int __7a;",
            "none of these answers",
            4)
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the valid expression?",
            "int my_nbr = 100, 000;",
            "int my_nbr = 100000;",
            "int my nbr = 1000;",
            "int my_nbr = 10000",
            2)
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What is the output of this C code?\n" +
                    "\t#include <stdio.h>\n" +
                    "\tint main()\n" +
                    "\t{\n" +
                    "    \t\tint y = 9000;\n" +
                    "    \t\tint y = 20;\n" +
                    "    \t\tprintf(\"Hello World! %d \", y);\n" +
                    "    \t\treturn 0;\n" +
                    "\t}",
            "Erreur de compilation",
            "Hello World! 20",
            "Hello World! 9000",
            "Hello World! suivi par une valeur alÃ©atoire",
            3)
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which of the following is not a valid statement?",
            "float PI = 3.14;",
            "double PI = 3.14;",
            "int PI = 3.14;",
            "#define PI 3.14",
            4)
        questionsList.add(que6)

        val que7 = Question(
            7,
            "Comment on the output of this C code?\n" +
                    "\t#include <stdio.h>\n" +
                    "\tint main ()\n" +
                    "\t{\n" +
                    " \t    int a [4] = {1, 2, 3, 4};\n" +
                    "    \t    int i;\t\n" +
                    "\t    for (i = 0; i <4; i ++){\n" +
                    "         \tif ((char) a [i] == '4')\n" +
                    "        \t    printf (\"% d \\ n\", a [i]);\n" +
                    "         \telse\n" +
                    "        \t    printf (\"FAIL \\ n\");\n" +
                    "\t    }\t\n" +
                    "\t}\n",
            "The compiler reports an error",
            "The program compiles and displays output 4",
            "The program compiles and displays the ASCII value of 4",
            "The program compiles and displays FAIL for 4 times",
            4)
        questionsList.add(que7)

        val que8 = Question(
            8,
            "Comment on the output of this C code?\n" +
                    "\t#include <stdio.h>\n" +
                    "\tint main()\n" +
                    "\t{\n" +
                    "    \t\tchar c;\n" +
                    "    \t\tint i = 0;\n" +
                    "    \t\tFILE *file;\n" +
                    "    \t\tfile = fopen(\"test.txt\", \"w+\");\n" +
                    "    \t\tfprintf(file, \"%c\", 'x');\n" +
                    "   \t\tfprintf(file, \"%c\", -1);\n" +
                    "    \t\tfprintf(file, \"%c\", 'y');\n" +
                    "    \t\tfclose(file);\n" +
                    "   \t\tfile = fopen(\"test.txt\", \"r\");\n" +
                    "    \t\twhile ((c = fgetc(file)) !=  -1){\n" +
                    "        \t\tprintf(\"%c\", c);\n" +
                    "\t\t}\n" +
                    "   \t\treturn 0;\n" +
                    "\t}",
            "Poster x",
            "infinite loop",
            "Depends on what fgetc returns",
            "depends on the compiler",
            1)
        questionsList.add(que8)

        val que9 = Question(
            9,
            "Comment on the output of this C code?\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int x = 20000;\n" +
                    "    double y = 26;\n" +
                    "    int *p = &x;\n" +
                    "    double *q = &y;\n" +
                    "    printf(\"The size of p = %d et q = %d\", sizeof(p), sizeof(q));\n" +
                    "    return 0;\n" +
                    "}\n",
            "The size of p = 4 and q = 4",
            "The size of p = 4 and q = 8",
            "compilation error",
            "The size of p = 8 and q = 4",
            1)
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What is the output of this C code (on a 64-bit machine)?\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "union S\n" +
                    "{\n" +
                    "     int a;\n" +
                    "     char b;\n" +
                    "};\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    union S s;\n" +
                    "    printf(\"%d\", sizeof(s));\n" +
                    "    return 0;\n" +
                    "}",
            "8",
            "5",
            "9",
            "4",
            4)
        questionsList.add(que10)




        return questionsList
    }
}