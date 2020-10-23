package Prog4;



import java.util.*;

public class prog4 {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // add elements in the LinkedList
        languages.add("python");
        languages.add("java");
        languages.add("javaScript");

        System.out.println("Пожалуйста выберите один из трех языков : ");
        for (String st : languages) System.out.println(st);

        try{Scanner lll = new Scanner(System.in);

        String legal=lll.nextLine();
        Python p=new Python();
        Java j=new Java();
        JavaScript js=new JavaScript();


        if (legal.equals("python")) {
            System.out.println("Вы  выбрали python");
            System.out.println("Сколько лет вы изучаете python? ");

            Scanner pp1=new Scanner(System.in);
            Double p1=pp1.nextDouble( );

            p.setYear(p1);
            Scanner pp2=new Scanner(System.in);
            System.out.println("Как вас зовут?");
            String p2=pp2.nextLine();
            p.setName(p2);
            Scanner pp3=new Scanner(System.in);
            System.out.println("Из какой вы страны? ");
            String p3=pp3.nextLine();
            p.setCountry(p3);

            System.out.println("Вы выбрали язык python и изучаете его  "+p.getYear()+" года . Ваше имя "+ p.getName()+".И Вы из "+p.getCountry());


        }

        else if("java".equals(legal)){
            System.out.println("Вы  выбрали java");
            System.out.println("Сколько лет вы изучаете java? ");

            Scanner jj1=new Scanner(System.in);
            Double j1=jj1.nextDouble( );

            j.setYear(j1);
            Scanner jj2=new Scanner(System.in);
            System.out.println("Как вас зовут?");
            String j2=jj2.nextLine();
            j.setName(j2);
            Scanner jj3=new Scanner(System.in);
            System.out.println("Из какой вы страны? ");
            String j3=jj3.nextLine();
            j.setCountry(j3);

            System.out.println("Вы выбрали язык java и изучаете его  "+j.getYear()+" года . Ваше имя "+ j.getName()+".И Вы из "+j.getCountry());




        }
        else if("javascript".equals(legal)){
            System.out.println("Вы  выбрали javascript");
            System.out.println("Сколько лет вы изучаете javascript? ");

            Scanner jss1=new Scanner(System.in);
            Double js1=jss1.nextDouble( );

            js.setYear(js1);
            Scanner jss2=new Scanner(System.in);
            System.out.println("Как вас зовут?");
            String js2=jss2.nextLine();
            js.setName(js2);
            Scanner jss3=new Scanner(System.in);
            System.out.println("Из какой вы страны? ");
            String js3=jss3.nextLine();
            js.setCountry(js3);

            System.out.println("Вы выбрали язык javascript и изучаете его  "+js.getYear()+" года . Ваше имя "+ js.getName()+".И Вы из "+js.getCountry());


        }
        else {
            System.out.println("Вы выбрали другой язык , попробуйте снова");
        }

    }
    catch (InputMismatchException ee){
            System.out.println("Вы ввели неверный символ");
    }

    }

     static class Python {
        private Double year;
        private String name;
        private String country;

         public Double getYear() {
             return year;
         }

         public void setYear(Double year) {
             this.year = year;
         }

         public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;

        }

    }
    }

    class Java {
        private Double year;
        private String name;
        private String country;

        public Double getYear() {
            return year;
        }

        public void setYear(Double year) {
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    }

    class JavaScript {
        private Double year;
        private String name;
        private String country;

        public Double getYear() {
            return year;
        }

        public void setYear(Double year) {
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
