import java.util.*;
public class quiz
{
    static int score=0; 
    public void output()
    {
        System.out.println(score);
    }
    public static void main(String args[])
    {
        quiz yo=new quiz();
        int reserveage=0;
        Scanner in=new Scanner(System.in);
        String A[]=new String[3];
        for(int i=5;i<=6;i++)
        {
            if(i==5)
            {
                System.out.println("ENTER YOUR FIRST NAME");
                A[0]=in.next();
            }
            else if(i==6)
            {
                System.out.println("ENTER YOUR LAST NAME");
                A[1]=in.next();
            }
        }

        System.out.println("ENTER YOUR AGE");
        int age=in.nextInt();
        if(age>107)
        {
            System.out.println("PLEASE DON'T LIE ABOUT YOUR AGE, WE KNOW THAT YOU CAN'T LIVE THAT LONG");
            reserveage=in.nextInt();
        }

        
        System.out.println("CLICK 1 IF YOU WANT TO PLAY THE QUIZ, ELSE CLICK 2");
        int selection=in.nextInt();
        while (selection==1)

        {
            System.out.println("ENTER 1 FOR SPORTS, 2 FOR MATHS,  3 FOR SCIENCE, 4 FOR GK");
            int choice=in.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("*************************YOUR CHOICE IS SPORTS************************");

                    System.out.println("                                HERE'S YOUR 1st QUESTION.......");
                    System.out.println("Former Australian captain Mark Taylor has had several nicknames over his playing career. Which of the following was NOT one of them");
                    System.out.println("1)Tubby");
                    System.out.println("2)Stodge");
                    System.out.println("3)Helium Bat");
                    System.out.println("4)Stumpy");
                    System.out.println("enter 1,2,3 or 4");
                    int ans1a=in.nextInt();
                    if(ans1a==4)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1a==2||ans1a==3||ans1a==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11a=in.nextInt();
                        if(ans11a==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 2nd QUESTION.......");
                    System.out.println("Which was the 1st non Test playing country to beat India in an international match?");;
                    System.out.println("1)Canada");
                    System.out.println("2)Sri Lanka");
                    System.out.println("3)Zimbabwe");
                    System.out.println("4)East Africa");
                    System.out.println("enter 1,2,3 or 4");
                    int ans1b=in.nextInt();
                    if(ans1b==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }

                    else if(ans1b==1||ans1b==3||ans1b==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11b=in.nextInt();
                        if(ans11b==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 3rd QUESTION.......");
                    System.out.println("Track and field star Carl Lewis won how many gold medals at the 1984 Olympic games?");
                    System.out.println("1)two");
                    System.out.println("2)three");
                    System.out.println("3)four");
                    System.out.println("4)eight");
                    System.out.println("enter 1,2,3 or 4");
                    int ans1c=in.nextInt();
                    if(ans1c==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    } 
                    else if(ans1c==2||ans1c==1||ans1c==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11c=in.nextInt();
                        if(ans11c==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                   HERE'S YOUR 4th QUESTION.......");
                    System.out.println("Which county did Ravi Shastri play for?");
                    System.out.println("1)Glamorgan");
                    System.out.println("2)Leicestershire");
                    System.out.println("3)Gloucestershire");
                    System.out.println("4)Lancashire");

                    System.out.println("enter 1,2,3 or 4");
                    int ans1d=in.nextInt();
                    if(ans1d==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    } 
                    else if(ans1d==2||ans1d==3||ans1d==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11d=in.nextInt();
                        if(ans11d==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 5th QUESTION.......");
                    System.out.println("Who was the first Indian to win the World Amateur Billiards title?");
                    System.out.println("1)Geet Sethi");
                    System.out.println("2)Wilson Jones");
                    System.out.println("3)Michael Ferreira");
                    System.out.println("4)Manoj Kothari");

                    System.out.println("enter 1,2,3 or 4");
                    int ans1e=in.nextInt();
                    if(ans1e==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    } 
                    else if(ans1e==1||ans1e==3||ans1e==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11e=in.nextInt();
                        if(ans11e==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                              HERE'S YOUR 6th QUESTION.......");
                    System.out.println("First Indian women Olympic Medal winner is -");
                    System.out.println("1) Saina Nehwal ");
                    System.out.println("2)M C Mary Kom");
                    System.out.println("3)Karnam Malleshwari ");
                    System.out.println("4)Sakshi Malik");
                    int ans1f=in.nextInt();
                    if(ans1f==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1f==2||ans1f==1||ans1f==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11f=in.nextInt();
                        if(ans11f==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                              HERE'S YOUR 7th QUESTION.......");
                    System.out.println("Who created a new world record is scoring the fastest century in Test Cricket history in February 2016?");
                    System.out.println("1) Steve Smith");
                    System.out.println("2) Chris Gayle");
                    System.out.println("3) Brendon McCullum");
                    System.out.println("4) Virat Kohli"); 
                    int ans1g=in.nextInt();
                    if(ans1g==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1g==2||ans1g==1||ans1g==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11g=in.nextInt();
                        if(ans11g==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                            HERE'S YOUR 8th QUESTION.......");
                    System.out.println("The term“Googly” is associated with ?");
                    System.out.println("1)Cricket");
                    System.out.println("2)Football");
                    System.out.println("3)Badminton");
                    System.out.println("4)Hockey");
                    int ans1h=in.nextInt();
                    if(ans1h==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1h==2||ans1h==3||ans1h==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11h=in.nextInt();
                        if(ans11h==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                            HERE'S YOUR 9th QUESTION.......");
                    System.out.println("After won the 13th gold medal in Rio Olympic 2016 by Michael Phelps, he has broken 12 individual gold medals records of -");
                    System.out.println("1) Duke Kahanamoku");
                    System.out.println("2) Leonidas of Rhodes");
                    System.out.println("3) Larisa Latynina");
                    System.out.println("4) Paavo Nurmi");
                    int ans1i=in.nextInt();
                    if(ans1i==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1i==1||ans1i==3||ans1i==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11i=in.nextInt();
                        if(ans11i==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                            HERE'S YOUR 10th QUESTION.......");
                    System.out.println("Murugappa Gold Cup is associated with -");
                    System.out.println("1) Badminton");
                    System.out.println("2) Hockey");
                    System.out.println("3) Cricket");
                    System.out.println("4) Golf");
                    int ans1j=in.nextInt();
                    if(ans1j==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                    }
                    else if(ans1j==1||ans1j==3||ans1j==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans11j=in.nextInt();
                        if(ans11j==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }

                    System.out.println("YOUR FINAL SCORE IS : "+score);
                    System.out.println("Do you want to play it again??; click 1 for yes and 2 for no.");
                    int again=in.nextInt();
                    if(again==1)
                    {
                        selection=1;
                    }
                    else
                    {
                        selection=2;
                    }          
                    if(selection==2)
                    {     
                        System.out.println("THANKS FOR PLAYING"); 
                    }
                    break;
                }  
                //0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

                case 2:
                {
                    System.out.println("*********************YOUR CHOICE IS MATHS*********************");
                    System.out.println("");
                    System.out.println("                                HERE'S YOUR 1st QUESTION");
                    System.out.println("The average of first 50 natural numbers is …………. .");
                    System.out.println("1)25.30");
                    System.out.println("2)25.5");
                    System.out.println("3)25.00");
                    System.out.println("4)12.25");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2a=in.nextInt();
                    if(ans2a==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2a==1||ans2a==3||ans2a==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22a=in.nextInt();
                        if(ans22a==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 2nd QUESTION.......");
                    System.out.println("A fraction which bears the same ratio to 1/27 as 3/11 bear to 5/9 is equal to ……….. .");
                    System.out.println("1)1/55");
                    System.out.println("2)55");
                    System.out.println("3)3/11");
                    System.out.println("4)1/11");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2b=in.nextInt();
                    if(ans2b==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans2b==2||ans2b==3||ans2b==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22b=in.nextInt();
                        if(ans22b==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 3rd QUESTION.......");
                    System.out.println("The number of 3-digit numbers divisible by 6, is ………….. .");
                    System.out.println("1)149");
                    System.out.println("2)166");
                    System.out.println("3)150");
                    System.out.println("4)151");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2c=in.nextInt();
                    if(ans2c==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans2c==4||ans2c==2||ans2c==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22c=in.nextInt();
                        if(ans22c==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 4th QUESTION.......");
                    System.out.println("What is 1004 divided by 2?");
                    System.out.println("1)52");
                    System.out.println("2)502");
                    System.out.println("3)520");
                    System.out.println("4)5002");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2d=in.nextInt();
                    if(ans2d==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans2d==4||ans2d==1||ans2d==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22d=in.nextInt();
                        if(ans22d==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 5th QUESTION.......");
                    System.out.println("A clock strikes once at 1 o’clock, twice at 2 o’clock, thrice at 3 o’clock and so on. How many times will it strike in 24 hours?");
                    System.out.println("1)78");
                    System.out.println("2)136");
                    System.out.println("3)156");
                    System.out.println("4)196");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2e=in.nextInt();
                    if(ans2e==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2e==4||ans2e==2||ans2e==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22e=in.nextInt();
                        if(ans22e==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 6th QUESTION.......");
                    System.out.println("9.1 + 19 =?");
                    System.out.println("1)9.9");
                    System.out.println("2)11");
                    System.out.println("3)29.1");
                    System.out.println("4)110");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2f=in.nextInt();
                    if(ans2f==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2f==4||ans2f==2||ans2f==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22f=in.nextInt();
                        if(ans22f==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 7th QUESTION.......");
                    System.out.println("8.2 × 0.41 =");
                    System.out.println("1)336.2");
                    System.out.println("2)33.62");
                    System.out.println("3)3.362");
                    System.out.println("4)3.28");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2g=in.nextInt();
                    if(ans2g==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2g==4||ans2g==2||ans2g==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else
                    {
                        System.out.println("PLEASE ENTER ONLY 1, 2, 3, OR 4 ONLY");
                    }
                    System.out.println("                                HERE'S YOUR 8th QUESTION.......");
                    System.out.println("(0.84)^2 × (0.41) =");
                    System.out.println("1)3.444");
                    System.out.println("2)2.893");
                    System.out.println("3)0.3444");
                    System.out.println("4)0.2893");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2h=in.nextInt();
                    if(ans2h==4)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2h==1||ans2h==2||ans2h==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22h=in.nextInt();
                        if(ans22h==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 9th QUESTION.......");
                    System.out.println("1100 ÷ 5.5 =");
                    System.out.println("1)20");
                    System.out.println("2)200");
                    System.out.println("3)2000");
                    System.out.println("4)6050");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2i=in.nextInt();
                    if(ans2i==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2i==4||ans2i==1||ans2i==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22i=in.nextInt();
                        if(ans22i==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 10th QUESTION.......");
                    System.out.println("1.2 - 0.24 =");
                    System.out.println("1)0.36");
                    System.out.println("2)0.96");
                    System.out.println("3)1.04");
                    System.out.println("4)1.44");
                    System.out.println("enter 1,2,3 or 4");
                    int ans2j=in.nextInt();
                    if(ans2j==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if(ans2j==4||ans2j==1||ans2j==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans22j=in.nextInt();
                        if(ans22j==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("YOUR FINAL SCORE IS : "+score);
                    System.out.println("do you want to play it again?; click 1 for yes and 2 for no.");
                    int again=in.nextInt();
                    if(again==1)
                    {
                        selection=1;
                    }
                    else
                    {
                        selection=2;
                    }          
                    if(selection==2)
                    {     
                        System.out.println("THANKS FOR PLAYING, COME BACK AGAIN."); 
                    }
                    break;
                }
                //000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

                case 3:
                {
                    System.out.println("****************************YOUR CHOICE IS SCIENCE***************************");
                    System.out.println();
                    System.out.println("                                HERE'S YOUR 1st QUESTION.......");
                    System.out.println("The tree sends down roots from its branches to the soil is know as:");
                    System.out.println("1)Oak");
                    System.out.println("2)Pine");
                    System.out.println("3)Banyan");
                    System.out.println("4)Palm");
                    int ans3a=in.nextInt();
                    if(ans3a==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3a==4||ans3a==2||ans3a==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33a=in.nextInt();
                        if(ans33a==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 2nd QUESTION.......");
                    System.out.println("Which is the most abundant gas in the earth's atmosphere?"); 
                    System.out.println("1)Nitrogen");
                    System.out.println("2)Oxygen");
                    System.out.println("3)Canrbon Dioxide");
                    System.out.println("4)Methane");

                    int ans3b=in.nextInt();
                    if(ans3b==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    } 
                    else if (ans3b==4||ans3b==2||ans3b==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else
                    {
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33b=in.nextInt();
                        if(ans33b==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 3rd QUESTION.......");
                    System.out.println("Which gas evolved from  paddy fields and marshes?");
                    System.out.println("1)Nitrogen");
                    System.out.println("2)Oxygen");
                    System.out.println("3)Carbondioxide");
                    System.out.println("4)Methane");
                    int ans3c=in.nextInt();
                    if(ans3c==4)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3c==1||ans3c==2||ans3c==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33c=in.nextInt();
                        if(ans33c==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 4th QUESTION.......");
                    System.out.println("Which toxic element present in automobile exhausts?"); 
                    System.out.println("1)Iron");
                    System.out.println("2)Carbon");
                    System.out.println("3)Lead");
                    System.out.println("4)Oxygen");
                    int ans3d=in.nextInt();
                    if(ans3d==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3d==4||ans3d==2||ans3d==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33d=in.nextInt();
                        if(ans33d==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 5th QUESTION.......");
                    System.out.println("Which of the following is a non metal that remains liquid at room temperature?");
                    System.out.println("1)Phosphorous");
                    System.out.println("2)Bromine");
                    System.out.println("3)Chlorine");
                    System.out.println("4)Helium");
                    int ans3e=in.nextInt();
                    if(ans3e==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3e==4||ans3e==1||ans3e==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33e=in.nextInt();
                        if(ans33e==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 6th QUESTION.......");
                    System.out.println("Electric bulb filament is made of");
                    System.out.println("1)Copper");
                    System.out.println("2)Aluminium");
                    System.out.println("3)Tungsten");
                    System.out.println("4)Lead");
                    int ans3f=in.nextInt();
                    if(ans3f==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3f==4||ans3f==2||ans3f==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33f=in.nextInt();
                        if(ans33f==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 7th QUESTION.......");
                    System.out.println("Chlorophyll is a naturally occurring chelate compound in which central metal is");
                    System.out.println("1)Copper");
                    System.out.println("2)Iron");
                    System.out.println("3)Magnesium");
                    System.out.println("4)Aluminium");
                    int ans3g=in.nextInt();
                    if(ans3g==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3g==4||ans3g==2||ans3g==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33g=in.nextInt();
                        if(ans33g==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 8th QUESTION.......");
                    System.out.println("Which of the following is used in pencils?");
                    System.out.println("1)Graphite");
                    System.out.println("2)Silicon");
                    System.out.println("3)Charcoal");
                    System.out.println("4)Phosphorous");
                    int ans3h=in.nextInt();
                    if(ans3h==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3h==4||ans3h==2||ans3h==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33h=in.nextInt();
                        if(ans33h==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 9th QUESTION.......");
                    System.out.println("Chemical formula for water is");
                    System.out.println("1)NaAlO2");
                    System.out.println("2)H2O");
                    System.out.println("3)Al2O3");
                    System.out.println("4)CaSiO3");
                    int ans3i=in.nextInt();
                    if(ans3i==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3i==4||ans3i==1||ans3i==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33i=in.nextInt();
                        if(ans33i==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 10th QUESTION.......");
                    System.out.println("The gas usually filled in the electric bulb is");
                    System.out.println("1)Oxygen");
                    System.out.println("2)Hydrogen");
                    System.out.println("3)Chlorine");
                    System.out.println("4)Argon");
                    int ans3j=in.nextInt();
                    if(ans3j==4)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans3j==1||ans3j==2||ans3j==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans33j=in.nextInt();
                        if(ans33j==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("YOUR FINAL SCORE IS : "+score);
                    System.out.println("Do you want to play it again?; Click 1 for YES and 2 for NO.");
                    int again=in.nextInt();
                    if(again==1)
                    {
                        selection=1;
                    }
                    else
                    {
                        selection=2;
                    }          
                    if(selection==2)
                    {     
                        System.out.println("THANKS FOR PLAYING"); 
                    }
                    break;
                }
                //00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
                case 4 :
                {  
                    System.out.println("****************************YOUR CHOICE IS GK*****************************");
                    System.out.println();
                    System.out.println("                                HERE'S YOUR 1st QUESTION.......");
                    System.out.println("A tree's age can be found by?");
                    System.out.println("1) counting the number of annual rings ");
                    System.out.println("2) counting the number of branches ");
                    System.out.println("3) measuring its height ");
                    System.out.println("4) measuring its girt");
                    int ans4a=in.nextInt();
                    if(ans4a==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4a==4||ans4a==2||ans4a==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44a=in.nextInt();
                        if(ans44a==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 2nd QUESTION.......");
                    System.out.println("In 1206, who founded the Slave Dynasty, in India ?");
                    System.out.println("1) Iltutmish"); 
                    System.out.println("2) Razia Sultan"); 
                    System.out.println("3) Qutubuddin Aibak"); 
                    System.out.println("4) Balban ");
                    int ans4b=in.nextInt();
                    if(ans4b==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4b==1||ans4b==2||ans4b==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44b=in.nextInt();
                        if(ans44b==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 3rd QUESTION.......");
                    System.out.println("Uhuru Peak' at Mount Kilimanjaro is the highest point of which continent ?");
                    System.out.println("1)asia");
                    System.out.println("2)africa");
                    System.out.println("3)north america"); 
                    System.out.println("4)europe");
                    int ans4c=in.nextInt();
                    if(ans4c==2)

                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4c==1||ans4c==4||ans4c==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44c=in.nextInt();
                        if(ans44c==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 4th QUESTION.......");
                    System.out.println("____________ Harbour is protected by a rocky headland called Dolphin's Nose.");
                    System.out.println("1) Visakhapatnam");
                    System.out.println("2)Paradeep");
                    System.out.println("3)Cochin");
                    System.out.println("4)Kolkata");
                    int ans4d=in.nextInt();
                    if(ans4d==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4d==4||ans4d==2||ans4d==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44d=in.nextInt();
                        if(ans44d==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 5th QUESTION.......");
                    System.out.println("82 and 1/2 degree E longitude is geographically significant to India because");
                    System.out.println("1) It determines the Indian standard time ");
                    System.out.println("2) It has a bearing on the tropical climate of India ");
                    System.out.println("3) It divides India into eastern and western zone ");
                    System.out.println("4) It enables determining local time in eastern India ");
                    int ans4e=in.nextInt();
                    if(ans4e==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4e==4||ans4e==2||ans4e==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44e=in.nextInt();
                        if(ans44e==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 6th QUESTION.......");
                    System.out.println("Grand Central Terminal, Park Avenue, New York is the world'");
                    System.out.println("1)Highest Railway Station");
                    System.out.println("2)Longest Railway Station");
                    System.out.println("3)Largest Railway Station");
                    System.out.println("4)None Of The Above");
                    int ans4f=in.nextInt();
                    if(ans4f==3)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4f==4||ans4f==2||ans4f==1)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44f=in.nextInt();
                        if(ans44f==3)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 7th QUESTION.......");
                    System.out.println("Entomology is the science that studies");
                    System.out.println("1)Behavior of human beings");
                    System.out.println("2)Insects");
                    System.out.println("3)The origin and history of technical and scientific terms");
                    System.out.println("4)The formation of rocks");
                    int ans4g=in.nextInt();
                    if(ans4g==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4g==1||ans4g==4||ans4g==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44g=in.nextInt();
                        if(ans44g==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 8th QUESTION.......");
                    System.out.println("For which of the following disciplines is Nobel Prize awarded?");
                    System.out.println("1)Physics and Chemistry");
                    System.out.println("2)Physiology or Medicine");
                    System.out.println("3)Literature, Peace and Economics");
                    System.out.println("4)All of the above");
                    int ans4h=in.nextInt();
                    if(ans4h==4)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4h==1||ans4h==2||ans4h==3)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44h=in.nextInt();
                        if(ans44h==4)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }
                    System.out.println("                                HERE'S YOUR 9th QUESTION.......");
                    System.out.println("Hitler party which came into power in 1933 is known as");
                    System.out.println("1)Labour Party");
                    System.out.println("2)Nazi Party");
                    System.out.println("3)Ku-Klux-Klan");
                    System.out.println("4)Democratic Party");
                    int ans4i=in.nextInt();
                    if(ans4i==2)
                    {
                        score=score+1;
                        System.out.println("WELL DONE, IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4i==1||ans4i==3||ans4i==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44i=in.nextInt();
                        if(ans44i==2)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");}
                    }

                    System.out.println("                                HERE'S YOUR 10th QUESTION.......");
                    System.out.println("Each year World Red Cross and Red Crescent Day is celebrated on");
                    System.out.println("1)May 8");
                    System.out.println("2)May 18");
                    System.out.println("3)June 8");
                    System.out.println("4)June 18");
                    int ans4j=in.nextInt();
                    if(ans4j==1)
                    {
                        score=score+1;
                        System.out.println("WELL DONE IT'S THE CORRECT ANSWER");
                    }
                    else if(ans4j==2||ans4j==3||ans4j==4)
                    {
                        System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                    }
                    else{
                        System.out.println("ENTER ONLY 1, 2, 3 OR 4 ONLY  (and this is your last chance to enter it)");
                        int ans44j=in.nextInt();
                        if(ans44j==1)
                        {score=score+1;
                            System.out.println("WELL DONE, ITS THE CORRECT ANSWER");
                        }
                        else{
                            System.out.println("......................IT'S THE WRONG ANSWER. BETTER LUCK NEXT TIME...........................");
                        }
                    }
                    System.out.println("Name"+"\t"+"Age"+"\t"+"Score"+"\t");
                    String outputname=A[0].toUpperCase();
                    System.out.println(outputname+"\t"+"\t"+A[2]+"\t"+score+"\t");
                    System.out.println("DO YOU WANT TO PLAY THE QUIZ AGAIN??; CLICK 1 FOR YES AND 2 FOR NO.");
                    int again=in.nextInt();
                    if(again==1)
                    {
                        selection=1;
                    }
                    else if(again==2)
                    {
                        selection=2;
                    }      
                    else
                    {
                        System.out.println("PLEASE ENTER 1 OR 2 ONLY");
                    }
                    if(selection==2)
                    {     
                        System.out.println("......................THANKS FOR PLAYING........................"); 
                        System.out.println("Your final score is.....:"+score);
                    }
                    break;
                }

            }
                       
        }
        yo.output();
    }
}

