//import java.util.Scanner;
//
//public class Classes {
//    public static class Person {
//        int age;
//        String name;
//
//        void sayHi() {
//            System.out.println("hello " + name + " Your age is : " + age);
//        }
////        constructor is used to initlize the values
////        if we forgot to make it java will make it for us
////        Constructor is created when we create object(new person()) like this
//        Person(String name, int age){
//            this.name = name;
//            this.age = age;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        Person p1 = new Person();
//        p1.name = "Priyansh sharma";
//        p1.age = 20;
//        p1.sayHi();
//
//        Person p2 = p1;
//        p2.age = 99;
//        p2.sayHi();
//        p1.sayHi();
//
//        Person p3 = new Person("Priyash",20);
//        p3.sayHi();

        //When we -> Person p3 an refrence p3 created in stack
//        when we write new Person() an object creared(instance)
//        and inside the heap memory whatever the class have attribute its
//        default value placed like name=null age=0
//        Inside the constructor we use this.name and this.age
//        This variable is of 4k memory
//        this.name is 4k ka name
//        this.age is 4k ka age

//    }
//
//}

//1. Memory allocation -> When we write new keyword memory allocated with default value
//2. Parsing -> Code outside the function and inside the class runs
//3. constructor-> Call to constructor inside which have default this keyword
// this keyword points to that particulat object(memory adress) variables

//Note-> If we dont write then java make default is give parameterized then java dont make default

//So if we write the constructor that we use if at object creation
//Person p1 = new Person("priyansh",20)
//then we cant do this,
//Person p2 = new Person();
//p2.name = "priyanhs"
//and if we are doing this then also provide defalut mannuly